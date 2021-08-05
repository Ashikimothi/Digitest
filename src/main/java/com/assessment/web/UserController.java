package com.assessment.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.assessment.bean.LoginBean;
import com.assessment.bean.RegisterBean;
import com.assessment.service.AssessmentService;
import com.assessment.service.AssessmentServiceImpl;


@WebServlet(name = "User", urlPatterns = { "/User.fm" })
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AssessmentService service;

	@Override
	public void init() throws ServletException {
		service = new AssessmentServiceImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		// Request is coming for logout
		if (request.getParameter("logout") != null) {
			session.invalidate(); // Deleting user session
			response.sendRedirect("login.jsp"); // Sending to home page
		} else {

			// To identify the request is coming for login or registration
			String referer = request.getHeader("referer");
			if (referer.contains("login")) {
				// Request is coming from home.jsp for login
				LoginBean login = new LoginBean();
				login.setEmail(request.getParameter("email"));
				login.setPassword(request.getParameter("password"));

				RegisterBean user = service.authenticate(login);
				if (user != null) {
					// Login successful
					session.setAttribute("USER", user);
					
					if(user.getEmail().equalsIgnoreCase("admin@digitest.com"))
						response.sendRedirect("Admin.fm");
					else
						response.sendRedirect("Test.fm");
				} else {
					// Login failed
					response.sendRedirect("login.jsp?invalid=yes");
				}

			} else {
				// Request is coming from register.jsp
				RegisterBean user = new RegisterBean();
				user.setEmail(request.getParameter("email"));
				user.setPassword(request.getParameter("password"));
				user.setName(request.getParameter("name"));
				user.setAge(Integer.parseInt(request.getParameter("age")));
				user.setGender(request.getParameter("gender"));
				user.setMobile(request.getParameter("mobile"));

				if (service.addUser(user)) {
					// Registration successful
					response.sendRedirect("login.jsp");
				} else {
					// Registration failed
					response.sendRedirect("register.jsp");
				}
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}