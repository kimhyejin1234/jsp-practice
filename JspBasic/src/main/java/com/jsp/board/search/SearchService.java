package com.jsp.board.search;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.board.model.BoardRepository;
import com.jsp.board.model.BoardVO;
import com.jsp.board.service.IBoardService;

public class SearchService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		String keyword = request.getParameter("keyword");
		
		List<BoardVO> list = BoardRepository.getInstance().searchtList(keyword);
		request.setAttribute("boardList", list);
	}

}
