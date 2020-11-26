package com.yedam.board;

import java.util.Scanner;
import java.util.List;

import com.yedam.db2.EmployeeVO;

public class BoardMain {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		BoardService service = new BoardServicelmpl();

		while (true) {

			System.out.println("----------------------------------");
			System.out.println("1.리스트 2.상세화면 3.등록 4.수정 5.삭제");
			System.out.println("--------------------------------- ");
			System.out.println("선택> ");
			int selectNo = scn.nextInt();
			if (selectNo == 1) {
				List<BoardVO> list = service.getBoardList();
				for (BoardVO vo : list) {
					BoardVO board = (BoardVO) vo;
					board.showBoardInfo();

				}
			}else if (selectNo == 2) {
				System.out.println("리스트 : ");
				int boaId = scn.nextInt();
				BoardVO board2 = service.getBoard(boaId);
				if(board2 != null) {
					board2.showBoardInfo();
				}
		

			}else if (selectNo == 3) {
				BoardVO vo = new BoardVO();
				System.out.println("리스트를 입력하시오");
				int vo1 = scn.nextInt(); scn.nextLine();
				System.out.println("타이틀을 입력하시오");
				String vo2 = scn.nextLine();
				System.out.println("컨탠트를 입력하시오");
				String vo3 = scn.nextLine();
				System.out.println("writer을 입력하시오");
				String vo4 = scn.nextLine();
				System.out.println("creation_date를 입력하시오");
				int vo5 = scn.nextInt();
				
				vo.setBoardNO(vo1);
				vo.setTitle(vo2);
				vo.setContent(vo3);
				vo.setWriter(vo4);
				vo.setCreationDate(vo5);
				
				
			}else if (selectNo == 4) {
				BoardVO vo = new BoardVO();
			
			System.out.println("수정할 리스트: ");
			int boaId = scn.nextInt(); scn.nextLine();
			System.out.println("수정할 타이틀: ");
			String title = scn.nextLine();
			System.out.println("수정할 컨탠트: ");
			String content=  scn.nextLine();
			System.out.println("수정할 writer: ");
			String writer= scn.nextLine();
			System.out.println("수정할 Creation_date: ");
			int CreationDate = scn.nextInt(); 
			
			
			
			
			}else if (selectNo == 5) {
				
			}
			
	}
	}}	
				
				
