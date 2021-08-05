package com.assessment.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public final class JdbcFactory {
	private JdbcFactory() {
	}
	
	public static Connection getConnection() throws SQLException {
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			Class.forName("oracle.jdbc.OracleDriver");
			Connection conn = DriverManager.getConnection(url, "ashi", "oracle");
			return conn;
	} catch (ClassNotFoundException | SQLException e) {
			throw new SQLException(e);
	}
	}
}
	
//	public static Connection getConnection() throws SQLException{
//		try {
//			Context initContext =new InitialContext();
//			Context envContext =(Context)initContext.lookup("java:/comp/env");
//			DataSource ds=(DataSource)envContext.lookup("jdbc/myoracle");
//			Connection conn =ds.getConnection();
//			return conn;
//		}
//		catch(NamingException e) {
//			throw new SQLException(e);
//		}
//		}
	
	
