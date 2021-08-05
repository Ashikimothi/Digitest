package com.assessment.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.assessment.bean.FeedbackBean;
import com.assessment.bean.QuestionBean;
import com.assessment.util.JdbcFactory;



public class AdminDaoImpl implements AdminDao {


	@Override
	public boolean addQuestion(QuestionBean question) throws SQLException {
		String sql = "insert into oatest values (?,?,?,?,?,?,?)";
		Connection conn = null;
		
		try {
			conn = JdbcFactory.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, question.getId());
			stmt.setString(2,question.getQuestion());
			stmt.setString(3,question.getOption_a());
			stmt.setString(4,question.getOption_b());
			stmt.setString(5,question.getOption_c());
			stmt.setString(6,question.getOption_d());
			stmt.setString(7,question.getAnswer());
			
			stmt.executeUpdate();
			return true;
		} finally {
			conn.close();
		}
		
	}

	@Override
	public boolean deleteQuestion(int id) throws SQLException {
		String sql = "delete from oatest where id="+id;
		Connection conn = null;
		
		try {
			conn = JdbcFactory.getConnection();
			conn.createStatement().executeUpdate(sql);
			return true;
		} finally {
			conn.close();
		}
	}


	@Override
	public List<FeedbackBean> fetchfeedbacks() throws SQLException {
		String sql = "select * from oafeedbacks";
		Connection conn = null;
		List<FeedbackBean> feedbacks = new ArrayList<FeedbackBean>();
		
		try {
			conn = JdbcFactory.getConnection();
			ResultSet rs = conn.createStatement().executeQuery(sql);
			while (rs.next()) {
				FeedbackBean feed = new FeedbackBean();
				
				feed.setEmail(rs.getString(1));
				feed.setFeedback(rs.getString(2));
				
				feedbacks.add(feed);
			}
			return feedbacks;
		} finally {
			conn.close();
		}
	}



		
	
	
		
	
}