package com.assessment.service;

import java.sql.SQLException;
import java.util.List;

import com.assessment.bean.FeedbackBean;
import com.assessment.bean.QuestionBean;
import com.assessment.dao.AdminDao;
import com.assessment.dao.AdminDaoImpl;

public class AdminServiceImpl implements AdminService{
private AdminDao dao;
	
	public AdminServiceImpl() {
		dao = new AdminDaoImpl();
	}

	@Override
	public boolean addQuestion(QuestionBean que) {
		try {
			return dao.addQuestion(que);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}


	@Override
	public boolean deleteQuestion(int id) {
		try {
			return dao.deleteQuestion(id);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	
	@Override
	public List<FeedbackBean> getFeedbacks() {
		try {
			return dao.fetchfeedbacks();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	

}