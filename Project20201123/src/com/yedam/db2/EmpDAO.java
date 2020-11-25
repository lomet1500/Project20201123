package com.yedam.db2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class EmpDAO {
	Connection conn = null;
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;

	// 전체조회
	public List getEmpList() {
		conn = DAO.getConnection();
		sql = "select*from emp1 order by 1";
		List list = new ArrayList();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				EmployeeVO vo = new EmployeeVO();
				vo.setEmployeeId(rs.getInt("employee_id"));
				vo.setFirstName(rs.getString("first_name"));
				list.add(vo);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	// 한건조회
	public EmployeeVO getEmp(int empId) {
		int i = 0;
		conn = DAO.getConnection();
		sql = " select*from emp1 where employee_id = " + empId;
		EmployeeVO employee = new EmployeeVO();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				i++;
				employee.setEmployeeId(rs.getInt("employee_id"));
				employee.setFirstName(rs.getString("first_name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (i > 0) {
			return employee;

		} else {
			return null;
		}

	}

	// 한건입력
	public void insertEmp(EmployeeVO vo) {
		conn = DAO.getConnection();
		sql = "insert into emp1 (employee_id, first_name , last_name, email, phone_number, job_id, hire_date) Values (?,?,?,?,?,?,?)";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getEmployeeId());
			pstmt.setString(2, vo.getFirstName());
			pstmt.setString(3, vo.getLastName());
			pstmt.setString(4, vo.getEmail());
			pstmt.setString(5, vo.getPhoneNumber());
			pstmt.setString(6, vo.getJobId());
			pstmt.setString(7, vo.getHireDate());

			rs = pstmt.executeQuery();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// 한건수정
	public void updateEmp(EmployeeVO vo) {

		if (vo.getSalary() != 0) {
			sql = " update emp1" + " set email = nvl(' " + vo.getEmail() + "', email)" + " ,phone_number = nvl(' "
					+ vo.getPhoneNumber() + " ', phone_number)" + " ,salary = ' " + vo.getSalary() + " ' "
					+ " where employee_id = " + vo.getEmployeeId();

		} else {
			sql = " update emp1" + " set email = nvl(' " + vo.getEmail() + "', email)" + " ,phone_number = nvl(' "
					+ vo.getPhoneNumber() + " ', phone_number)" + " where employee_id = " + vo.getEmployeeId();
		}
		conn = DAO.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			int r = pstmt.executeUpdate();
			System.out.println(r + "건 수정됨.");
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// 한건삭제
	public void deleteEmp(int empId) {
		conn = DAO.getConnection();
		sql = "delete from emp1 where employee_id = " + empId;
		EmployeeVO employee = new EmployeeVO();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

		} catch (SQLException e) {
			e.printStackTrace();

		}
	}
}