package com.assessment.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.assessment.service.AssessmentService;
import com.assessment.service.AssessmentServiceImpl;


@WebServlet(name = "Result", urlPatterns = { "/Result.fm" })
public class ResultController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AssessmentService service;
	@Override
	public void init() throws ServletException {
		service = new AssessmentServiceImpl();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String referer = request.getHeader("referer");
		if(referer.contains("quiz")) {
		
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
	
	
	

}
