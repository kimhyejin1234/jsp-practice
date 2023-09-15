package com.jsp.board.service;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.board.model.BoardRepository_self;
import com.jsp.board.model.BoardVO_self;

public class RegistService_self implements IBoardServise_self {

	@Override
	public void excute_self(HttpServletRequest request, HttpServletResponse response) {
		String writer = request.getParameter("writer");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		BoardVO_self vo = new BoardVO_self();
		vo.setWriter(writer);
		vo.setTitle(title);
		vo.setContent(content);
		vo.setRegDate(LocalDateTime.now());
		
		BoardRepository_self.getInstanceSelf().regist_self(vo); 
		
	}

}
