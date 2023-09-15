package com.jsp.board.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.board.service.GetListService_self;
import com.jsp.board.service.IBoardServise_self;
import com.jsp.board.service.RegistService_self;

@WebServlet("*.board_self")
public class BoardController_self extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private IBoardServise_self sv;
    private RequestDispatcher dp;
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
				System.out.println("(self)_글등록 요청이 들어옴. !");
				sv = new RegistService_self();
				sv.excute_self(request, response);// 여기서 글 등록후 아래 글 목록 화면으로 이동
				response.sendRedirect("board/list.board_self");
				
				break;
			}
			case "list": {
				System.out.println("(self)_글목록 요청이 들어옴. !");
				sv = new GetListService_self();
				sv.excute_self(request, response);
				dp = request.getRequestDispatcher("board/board_list_self.jsp");
				dp.forward(request, response);
				
				break;
			}
		}
		
    	
    }

}
