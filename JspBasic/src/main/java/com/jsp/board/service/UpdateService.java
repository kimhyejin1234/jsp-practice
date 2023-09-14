package com.jsp.board.service;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.board.model.BoardRepository;
import com.jsp.board.model.BoardVO;

public class UpdateService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		int bId = Integer.parseInt(request.getParameter("boardNo"));
//		String writer = request.getParameter("writer");
//		String content = request.getParameter("content");
//		String title = request.getParameter("title");
//		LocalDateTime updateTime = LocalDateTime.now();
		
//		BoardVO vo = new BoardVO(writer,title,content,updateTime);
		
		BoardVO vo = new BoardVO(
				request.getParameter("writer"),
				request.getParameter("title"),
				request.getParameter("content"),
				LocalDateTime.now()
			);
				
		BoardRepository.getInstance().update(bId ,vo); //글 수정 완료
		
	}

}
