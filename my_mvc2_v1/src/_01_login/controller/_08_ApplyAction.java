package _01_login.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import _01_login.dao.MemberDAO;

@WebServlet("/applyAction.do")
public class _08_ApplyAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		String field = request.getParameter("field");
		String major = request.getParameter("major");
		String skill = "";
		
		String[] skills = request.getParameterValues("skill");
		for (int i = 0; i < skills.length; i++) {
			skill += skills[i];
			if(i != skills.length-1)
				skill += ",";
		} 
		
		if(field != null && major != null && skill.length() > 0) {
//			String id = (String)request.getSession().getAttribute("id"); // session 
			
			String id = (String)request.getParameter("id");
			
			MemberDAO.getInstance().apply(id, field, skill, major);
		} else {
			System.out.println("빈칸존재");
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("_01_login/08_applyPro.jsp");
		dis.forward(request, response);
	}

}
