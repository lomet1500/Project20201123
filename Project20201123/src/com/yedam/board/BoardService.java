package com.yedam.board;

import java.util.List;

public interface BoardService {
	public List<BoardVO> getBoardList();

	public BoardVO getBoard(int boaId);

	public void insertBoard(BoardVO boaVO);

	public void UpdateBoard(BoardVO boaVO);

	public void deleteBoard(int boaId);
}
