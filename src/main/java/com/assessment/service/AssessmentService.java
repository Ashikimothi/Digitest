package com.assessment.service;


import java.util.List;

import com.assessment.bean.LoginBean;
import com.assessment.bean.QuestionBean;
import com.assessment.bean.RegisterBean;

public interface AssessmentService {

      boolean addUser(RegisterBean user);
	
	RegisterBean authenticate(LoginBean login);
	
	QuestionBean getQuestion(int id);
	
	List<QuestionBean> getQuiz();
}