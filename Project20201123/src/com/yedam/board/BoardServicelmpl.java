package com.yedam.board;

import java.util.List;

public class BoardServicelmpl implements BoardService {

	BoardDAO dao = new BoardDAO();

	@Override
	public List<BoardVO> getBoardList() {
		
		return dao.getBoardList();
	}

	@Override
	public BoardVO getBoard(int boaId) {
		
		return dao.getBoard(boaId);
	}

	@Override
	public void insertBoard(BoardVO boaVO) {
		dao.insertBoard(boaVO);
		
	}

	@Override
	public void UpdateBoard(BoardVO boaVO) {
		dao.updateBoard(boaVO);
		
	}

	@Override
	public void deleteBoard(int boaId) {
		dao.deleteBoard(boaId);
		
	}
}

	