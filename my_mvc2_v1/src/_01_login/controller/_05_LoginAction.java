package _01_login.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import _01_login.dao.MemberDAO;

@WebServlet("/loginAction.do")
public class _05_LoginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public _05_LoginAction() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	
	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		boolean isLogin = MemberDAO.getInstance().login(id, pw);
		
		request.setAttribute("isLogin", isLogin);
		if(isLogin) {
			HttpSession session = request.getSession();
			session.setAttribute("memId", id);
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("_01_login/05_loginPro.jsp");
		dis.forward(request, response);
		
	}

}
