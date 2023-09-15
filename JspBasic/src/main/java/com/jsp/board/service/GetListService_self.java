package com.jsp.board.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.board.model.BoardRepository_self;
import com.jsp.board.model.BoardVO_self;

public class GetListService_self implements IBoardServise_self {

	@Override
	public void excute_self(HttpServletRequest request, HttpServletResponse response) {
		List<BoardVO_self> list = BoardRepository_self.getInstanceSelf().getList_self();
		request.setAttribute("boardList",list);

	}

}
