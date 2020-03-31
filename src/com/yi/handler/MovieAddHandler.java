package com.yi.handler;

import java.io.File;
import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.yi.dao.MovieDao;
import com.yi.jdbc.JDBCUtil;
import com.yi.model.Movie;
import com.yi.mvc.CommandHandler;

public class MovieAddHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		if (req.getMethod().equalsIgnoreCase("get")) {
			return "/WEB-INF/view/movie/mmcForm.jsp";
		} else if (req.getMethod().equalsIgnoreCase("post")) {
			String uploadPath = req.getRealPath("upload");
			File dir = new File(uploadPath);
			if (dir.exists() == false) {
				dir.mkdir();
			}
			int size = 1024 * 1024 * 10;
			MultipartRequest multi = new MultipartRequest(req, uploadPath, size, "UTF-8",
					new DefaultFileRenamePolicy());

			Connection conn = null;

			try {
				conn = JDBCUtil.getConnection();
				MovieDao dao = MovieDao.getInstance();
				Movie movie = new Movie(0, multi.getParameter("mName"),
						multi.getParameter("mContent"), multi.getFilesystemName("mImg"),
						multi.getParameter("mTime"));
				dao.insertMovie(conn, movie);

				res.sendRedirect("list.do");
				return null;
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				JDBCUtil.close(conn);
			}
			return "list.do";
		}
		return null;
	}

}
