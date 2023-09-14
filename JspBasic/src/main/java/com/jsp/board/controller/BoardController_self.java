package com.jsp.board.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.board_self")
public class BoardController_self extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BoardController_self() {
        super();
    }


    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	if(request.getMethod().equals("POST")) {
    		request.setCharacterEncoding("UTF-8");
    	}
    	
    	String uri = request.getRequestURI();
    	uri = uri.substring(request.getContextPath().length()+1,uri.lastIndexOf('.'));
    	System.out.println("정제된 uri : " + uri);
    	
    	switch (uri) {
			case "write": {
				System.out.println("(self)_글쓰기 페이지로 이동 요청이 들어 왔습니다.!");
				response.sendRedirect("board/board_write_self.jsp");
				break;
			}
			case "regist": {
				System.out.println("(self)_글등록 페이지로 이동 합니다. !");
				response.sendRedirect("board/board_write_self.jsp");
				break;
			}
		}
		
    	
    }

}
