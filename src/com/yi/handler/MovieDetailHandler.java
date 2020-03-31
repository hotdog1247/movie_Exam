package com.yi.handler;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yi.dao.MovieDao;
import com.yi.jdbc.JDBCUtil;
import com.yi.model.Movie;
import com.yi.mvc.CommandHandler;

public class MovieDetailHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		Connection conn = null;
		try {
			conn = JDBCUtil.getConnection();
			MovieDao dao = MovieDao.getInstance();
			String mNoString = req.getParameter("mNo");
			int mNo = Integer.parseInt(mNoString);
			Movie movie = new Movie(mNo);
			Movie item = dao.selectByNo(conn, movie);
			req.setAttribute("item", item);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			JDBCUtil.close(conn);
		}

		return "/WEB-INF/view/movie/mmcSel.jsp";
	}

}
