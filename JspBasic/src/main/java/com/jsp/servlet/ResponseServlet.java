package com.jsp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet 을 지정하면 따로 서블릿을 등록하고 url mapping 하는 과정을 생략할 수 있습니다.
@WebServlet("/resp")
public class ResponseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ResponseServlet() {
        super();
   
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("servise 메서드가 호출됨!");
		
		//요청과 함께 넘어온 아이디를 얻자
//		String age = request.getParameter("customerAge");
		int age = Integer.parseInt(request.getParameter("customerAge"));
		
		if(age > 20) {
			//성인 페이지로 이동시키고 싶다.
			response.sendRedirect("/JspBasic/response/res_audit.jsp");
		} else {
			//미성년자 페이지로 이동시키고 싶다.
			response.sendRedirect("/JspBasic/response/res_underage.jsp");
		}
	}

}
