package com.jsp.board.model;

import java.util.ArrayList;
import java.util.List;

public class BoardRepository_self {
	private static final List<BoardVO_self> boardList = new ArrayList<>();
	private BoardRepository_self() {}
	private static BoardRepository_self repository = new BoardRepository_self();
	public static BoardRepository_self getInstanceSelf() {
		return repository;
	}
	
	//글등록 메서드
	public void regist_self(BoardVO_self vo) {
		boardList.add(vo);
	}
	
	public List<BoardVO_self> getList_self(){
		return boardList;
	}
}
