package com.yedam.board;

public class BoardVO {
	private int boardNO;
	private String title;
	private String content;
	private String writer;
	private int creationDate;
	
	public BoardVO(int boardNO, String title, String content, String writer, int creationDate) {
		super();
		this.boardNO = boardNO;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.creationDate = creationDate;
		
	}public BoardVO(){
		
	}
	public int getBoardNO() {
		return boardNO;
	}
	public void setBoardNO(int boardNO) {
		this.boardNO = boardNO;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(int creationDate) {
		this.creationDate = creationDate;
	}

	public void showBoardInfo() {
		System.out.println("boardNO: " + boardNO + ", title: " + title + ", content: " + content + ", writer: " + writer + ", creationDate: " + creationDate);
	}
}
	
	
	
	