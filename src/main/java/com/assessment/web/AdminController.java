  
package com.assessment.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.assessment.bean.FeedbackBean;
import com.assessment.bean.QuestionBean;
import com.assessment.service.AdminService;
import com.assessment.service.AdminServiceImpl;
import com.assessment.service.AssessmentService;
import com.assessment.service.AssessmentServiceImpl;


@WebServlet(name = "Admin", urlPatterns = { "/Admin.fm" })
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	private AdminService adminService;
	private AssessmentService testService;
	
	@Override
	public void init() {
		adminService = new AdminServiceImpl();
		testService = new AssessmentServiceImpl();
	}
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String referer = request.getHeader("referer");
		if(referer.contains("addques")) {
			QuestionBean question = new QuestionBean();
			question.setId(Integer.parseInt(request.getParameter("id")));
			question.setQuestion(request.getParameter("question"));
			question.setOption_a(request.getParameter("option_a"));
			question.setOption_b(request.getParameter("option_b"));
			question.setOption_c(request.getParameter("option_c"));
			question.setOption_d(request.getParameter("option_d"));
			question.setAnswer(request.getParameter("answer"));
		
			adminService.addQuestion(question);
				response.sendRedirect("quiz.jsp?failed=yes");
		}
//	
		if(request.getParameter("id") != null) {
					int id = Integer.parseInt(request.getParameter("id"));
			
			adminService.deleteQuestion(id);
			}
		
		List<QuestionBean> questions = testService.getQuiz();
		request.setAttribute("QUIZ", questions);
		getServletContext().getRequestDispatcher("/admin.jsp").forward(request, response);
		
		
		List<FeedbackBean> feeds = adminService.getFeedbacks();
		request.setAttribute("FEED", feeds);
		getServletContext().getRequestDispatcher("/feedback.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
