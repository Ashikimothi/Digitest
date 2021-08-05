package com.assessment.service;


import java.util.List;

import com.assessment.bean.FeedbackBean;
import com.assessment.bean.QuestionBean;

public interface AdminService {
	

	boolean deleteQuestion(int id);
	boolean addQuestion(QuestionBean que);
	List<FeedbackBean> getFeedbacks();
	
	
}