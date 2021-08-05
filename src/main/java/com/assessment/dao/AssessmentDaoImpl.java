package com.assessment.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.assessment.bean.FeedbackBean;
import com.assessment.bean.LoginBean;
import com.assessment.bean.QuestionBean;
import com.assessment.bean.RegisterBean;
import com.assessment.util.JdbcFactory;

public class AssessmentDaoImpl implements AssessmentDao{
	@Override
	public boolean persist(RegisterBean user) throws SQLException {
		String sql = "insert into oausers values (?,?,?,?,?,?,?)";
		Connection conn = null;
		try {
			System.out.println("before connection");
			conn = JdbcFactory.getConnection();
			System.out.println("After connection");
			if(conn==null)
				System.out.println("your connection is null");
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, user.getEmail());
			stmt.setString(2, user.getPassword());
			stmt.setString(3, user.getName());
			stmt.setInt(4, user.getAge());
			stmt.setString(5, user.getGender());
			stmt.setString(6, user.getMobile());
			stmt.setInt(7, 0);
			
			
			stmt.executeUpdate();
			return true;
		} finally {
			conn.close();
		
		}
	}

	@Override
	public RegisterBean validate(LoginBean login) throws SQLException {
		String sql = "select * from oausers where email=? and password=?";
		Connection conn = null;
		RegisterBean user = null;
		try {
			conn = JdbcFactory.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, login.getEmail());
			stmt.setString(2, login.getPassword());
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				user = new RegisterBean();
				user.setEmail(rs.getString(1));
				user.setPassword(rs.getString(2));
				user.setName(rs.getString(3));
				user.setAge(rs.getInt(4));
				user.setGender(rs.getString(5));

				user.setMobile(rs.getString(6));
				user.setResult(rs.getInt(7));
			}
			return user;
		} finally {
			conn.close();
			
		}
	}

@Override	
public QuestionBean fetchQuestion(int id) throws SQLException {
	String sql = "select * from oatest";
	Connection conn = null;
	QuestionBean que = null;
	
	try {
		System.out.println("hello test table");
		conn = JdbcFactory.getConnection();
		System.out.println("hello 2");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		if (rs.next()) {
			que = new QuestionBean();
			que.setId(rs.getInt(1));
			que.setQuestion(rs.getString(2));
			que.setOption_a(rs.getString(3));
			que.setOption_b(rs.getString(4));
			que.setOption_c(rs.getString(5));
			que.setOption_d(rs.getString(6));
			que.setAnswer(rs.getString(7));
		}
		return que;
	} finally {
		conn.close();
	}
}


@Override
public boolean persistF(FeedbackBean user) throws SQLException {
	String sql = "insert into oausers values (?,?)";
	Connection conn = null;
	try {
		System.out.println("before connection");
		conn = JdbcFactory.getConnection();
		System.out.println("After connection");
		if(conn==null)
			System.out.println("your connection is null");
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setString(1, user.getEmail());
		stmt.setString(2, user.getFeedback());
		stmt.executeUpdate();
		return true;
	} finally {
		conn.close();
	
	}
}
	
	
	@Override
	public List<QuestionBean> fetchQuestions() throws SQLException {
		String sql = "select * from oatest";
		Connection conn = null;
		List<QuestionBean> quiz = new ArrayList<QuestionBean>();
		
		try {
			conn = JdbcFactory.getConnection();
			ResultSet rs = conn.createStatement().executeQuery(sql);
			while (rs.next()) {
				QuestionBean que = new QuestionBean();
				que.setId(rs.getInt(1));
				que.setQuestion(rs.getString(2));
				que.setOption_a(rs.getString(3));
				que.setOption_b(rs.getString(4));
				que.setOption_c(rs.getString(5));
				que.setOption_d(rs.getString(6));
				que.setAnswer(rs.getString(7));
				quiz.add(que);
			}
			return quiz;
		} finally {
			conn.close();
		}
	}

}
