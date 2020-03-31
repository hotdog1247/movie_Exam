package com.yi.dao.test;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.yi.dao.MovieDao;
import com.yi.jdbc.DBCPInit;
import com.yi.jdbc.JDBCUtil;
import com.yi.model.Movie;

public class MovieDaoTest {
	private MovieDao dao = null;
	private Connection conn= null;
	@Before
	public void setUp() throws Exception {
		try {
			DBCPInit dbcpInit = new DBCPInit();
			dao.getInstance();
			conn = JDBCUtil.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@After
	public void tearDown() throws Exception {
		JDBCUtil.close(conn);
	}

	@Test
	public void testInsertMovie() {
		Movie movie = new Movie(0, "11", "11", "busan.jpg", "11:30");
		try {
			dao.insertMovie(conn, movie);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testSelectByAll() {
		try {
			List<Movie> list = dao.selectByAll(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Assert.assertNotNull(list);
	}

	@Test
	public void testSelectByNo() {
		fail("Not yet implemented");
	}

}
