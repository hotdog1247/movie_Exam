package com.yi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yi.jdbc.JDBCUtil;
import com.yi.model.Movie;

public class MovieDao {
	private final static MovieDao instance = new MovieDao();

//	private ArrayList<Movie> list = null;
//
//	public MovieDao() {
//		if (list == null) {
//			list = new ArrayList<>();
//		}
//	}
//
//	public void addMovie(Movie movie) {
//		list.add(movie);
//	}
//
//	public ArrayList<Movie> getList() {
//		return list;
//	}
	
	private MovieDao() {
	}

	public static MovieDao getInstance() {
		return instance;
	}

	public void insertMovie(Connection conn, Movie movie) throws SQLException {
		PreparedStatement pstmt = null;

		try {
			String sql = "INSERT INTO movie VALUES(null, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, movie.getmName());
			pstmt.setString(2, movie.getmContent());
			pstmt.setString(3, movie.getmImg());
			pstmt.setString(4, movie.getmTime());
			pstmt.executeUpdate();
		} finally {
			JDBCUtil.close(pstmt);
		}
	}

	public List<Movie> selectByAll(Connection conn) throws SQLException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			String sql = "select * from movie";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			List<Movie> list = new ArrayList<>();
			while (rs.next()) {
				Movie m = new Movie(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
				list.add(m);
			}
			return list;
		} finally {
			JDBCUtil.close(rs);
			JDBCUtil.close(pstmt);
		}
	}

	public Movie selectByNo(Connection conn, Movie movie) throws SQLException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			String sql = "select * from movie where m_no = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, movie.getmNo());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Movie m = new Movie(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
				return m;
			}
		} finally {
			JDBCUtil.close(rs);
			JDBCUtil.close(pstmt);
		}
		return null;
	}
}
