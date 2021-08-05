package com.assessment.service;

import java.sql.SQLException;
import java.util.List;

import com.assessment.bean.LoginBean;
import com.assessment.bean.QuestionBean;
import com.assessment.bean.RegisterBean;
import com.assessment.dao.AssessmentDao;
import com.assessment.dao.AssessmentDaoImpl;
import com.assessment.util.FlopEncoder;

public class AssessmentServiceImpl implements AssessmentService {
	private AssessmentDao dao;
	
	public AssessmentServiceImpl() {
		dao = new AssessmentDaoImpl();
	}
	
	@Override
	public boolean addUser(RegisterBean user) {
		user.setPassword(FlopEncoder.encode(user.getPassword()));
		try {
			return dao.persist(user);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public RegisterBean authenticate(LoginBean login) {
		login.setPassword(FlopEncoder.encode(login.getPassword()));
		try {
			return dao.validate(login);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public QuestionBean getQuestion(int id) {
		try {
			return dao.fetchQuestion(id);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<QuestionBean> getQuiz() {
		try {
			return dao.fetchQuestions();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	
}