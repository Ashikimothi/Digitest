package com.assessment.dao;

import java.sql.SQLException;
import java.util.List;

import com.assessment.bean.FeedbackBean;
import com.assessment.bean.LoginBean;
import com.assessment.bean.QuestionBean;
import com.assessment.bean.RegisterBean;

public interface AssessmentDao {
		

		boolean persist(RegisterBean user) throws SQLException;
		
		RegisterBean validate(LoginBean login) throws SQLException;

		List<QuestionBean> fetchQuestions() throws SQLException;

		QuestionBean fetchQuestion(int id) throws SQLException;

		boolean persistF(FeedbackBean feed) throws SQLException;

		
		
	}


