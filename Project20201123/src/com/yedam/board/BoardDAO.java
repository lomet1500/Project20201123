package com.yedam.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;
import com.yedam.db2.EmployeeVO;

public class BoardDAO {
	Connection conn = null;
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;

	public List<BoardVO> getBoardList() {
		conn = DAO.getConnection();
		sql = "select*from board1 order by 1";
		List<BoardVO> list = new ArrayList();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				BoardVO vo = new BoardVO();
				vo.setBoardNO(rs.getInt("boardNO"));
				vo.setTitle(rs.getString("title"));
				vo.setContent(rs.getString("content"));
				vo.setWriter(rs.getString("writer"));
				vo.setCreationDate(rs.getInt("title"));

				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public BoardVO getBoard(int boaId) {
		int i = 0;
		conn = DAO.getConnection();
		sql = "select*from board1 where boardNO = " + boaId;
		BoardVO board = new BoardVO();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				i++;
				board.setBoardNO(rs.getInt("boardNO"));
				board.setTitle(rs.getString("title"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (i > 0) {
			return board;

		} else {
			return null;
		}

	}

	public void insertBoard(BoardVO vo) {
		conn = DAO.getConnection();
		sql = "insert into board1 (boardNO, title, content, writer, creationDate)	values (?,?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getBoardNO());
			pstmt.setString(2, vo.getTitle());
			pstmt.setString(3, vo.getContent());
			pstmt.setString(4, vo.getWriter());
			pstmt.setInt(5, vo.getCreationDate());

			rs = pstmt.executeQuery();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void updateBoard(BoardVO vo) {
		sql = " update Board1" +" set title = (' "+ vo.getTitle() + "',title)" + " ,content = (' " + vo.getContent() + " ', content)"
	+ " ', writer = ' " + vo.getWriter() + " ' " + " where boardNO = " + vo.getBoardNO();
	
		conn = DAO.getConnection();

		try {
			pstmt = conn.prepareStatement(sql);
			int r = pstmt.executeUpdate();
			System.out.println(r + "건 수정");

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void deleteBoard(int boaId) {
		conn = DAO.getConnection();
		sql = "delete from board1 where boardNO = " + boaId;
		BoardVO board = new BoardVO();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}