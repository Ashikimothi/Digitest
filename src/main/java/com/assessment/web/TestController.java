package com.assessment.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.assessment.bean.QuestionBean;
import com.assessment.service.AssessmentService;
import com.assessment.service.AssessmentServiceImpl;

@WebServlet(name = "Test", urlPatterns = { "/Test.fm" })
public class TestController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AssessmentService service;
	
	@Override
	public void init() throws ServletException {
		service = new AssessmentServiceImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		
		if(id != null) {
			// Request is received for adding product to cart
			HttpSession session = request.getSession();
//			QuestionBean question = service.getQuiz();
			
			List<QuestionBean> quiz = (List<QuestionBean>) session.getAttribute("QUIZ");
			
			if(quiz == null)	// session is new, no existing quiz found
				quiz = new ArrayList<QuestionBean>(); // Instantiating quiz for first use
			session.setAttribute("QUIZ", quiz);	// Adding/Updating quiz into session
			
			response.sendRedirect("quiz.jsp");
			
		} else {
			// Request is for populating quiz 
			List<QuestionBean> quiz = service.getQuiz();
			System.out.println("Question fetched: " + quiz.size());
			
			// Adding question list to request scope
			request.setAttribute("QUIZ", quiz);
	
			// Forward to quiz page along with question list in request scope
			getServletContext().getRequestDispatcher("/quiz.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}