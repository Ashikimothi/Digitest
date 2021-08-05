package com.assessment.dao;

import java.sql.SQLException;
import java.util.List;

import com.assessment.bean.FeedbackBean;
import com.assessment.bean.QuestionBean;
import com.assessment.bean.RegisterBean;

public interface AdminDao {
	

	boolean deleteQuestion(int id) throws SQLException;

	boolean addQuestion(QuestionBean question) throws SQLException;
	
	List<FeedbackBean> fetchfeedbacks() throws SQLException;
}
