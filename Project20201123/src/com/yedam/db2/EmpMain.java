package com.yedam.db2;

import java.util.List;
import java.util.Scanner;

public class EmpMain {
	public static void main(String[] args) {
		// 1.전체조회, 2.한건조회,3.입력,4.수정,5.삭제
		Scanner scn = new Scanner(System.in);
		EmpService service = new EmpServiceImpl();
		
		while (true) {
			
			System.out.println("------------------------------------------");
			System.out.println("1.전체조회 2.검색 3.입력 4.수정 5. 삭제 6. 종료 7.부서별조회");
			System.out.println("------------------------------------------");
			System.out.println("선택> ");
			int selectNo = scn.nextInt();
			if (selectNo == 1) {
				List list = service.getEmpList();
				for(Object vo :list) {
					EmployeeVO 	emp = (EmployeeVO) vo;
					emp.showEmpInfo();
				}
				
			} else if (selectNo == 2) {
				System.out.println("조회할 사원번호 입력: ");
				int empId =scn.nextInt();
				EmployeeVO emp2 = service.getEmp(empId);
				if(emp2 != null) {
				emp2.showEmpInfo();
				}else {
					System.out.println("없음");
				}
				
			} else if (selectNo == 3) {
				EmployeeVO vo = new EmployeeVO();
				System.out.println("사원번호를 입력하시오");
				int vo1 = scn.nextInt(); scn.nextLine();
				System.out.println("이름을 입력하시오");
				String vo2 = scn.nextLine();
				System.out.println("성을 입력하시오");
				String vo3 = scn.nextLine();
				System.out.println("이메일을 입력하시오");
				String vo4 = scn.nextLine();
				System.out.println("전화번호를 입력하시오");
				String vo5 = scn.nextLine();
				System.out.println("일을 입력하시오");
				String vo6 = scn.nextLine();
				System.out.println("입사일을 입력하시오");
				String vo7 = scn.nextLine();
				
				vo.setEmployeeId(vo1);
				vo.setFirstName(vo2);
				vo.setLastName(vo3);
				vo.setEmail(vo4);
				vo.setPhoneNumber(vo5);
				vo.setJobId(vo6);
				vo.setHireDate(vo7);
				
				
				service.insertEmp(vo);
				

			} else if (selectNo == 4) {
				EmployeeVO vo = new EmployeeVO();
			
				System.out.println("수정할 사원번호: "); 
				int empId = scn.nextInt(); scn.nextLine();
				System.out.println("수정할 이메일: "); 
				String email = scn.nextLine();
				System.out.println("수정할 전화번호: "); 
				String phoneNum = scn.nextLine();
				System.out.println("수정할 급여: "); 
				String salary1 = scn.nextLine();
				
				if(salary1.length() > 0) {
				int salary = Integer.parseInt(salary1);
				vo.setSalary(salary);
				}
				
				vo.setEmployeeId(empId);
				vo.setEmail(email);
				vo.setPhoneNumber(phoneNum);
				
				
				service.updateEmp(vo);

			} else if (selectNo == 5) {
				System.out.println("삭제할 항목 : ");
				int empId = scn.nextInt(); scn.nextLine(); 
				
				service.deleteEmp(empId);
			

			} else if (selectNo == 6) {
				break;
				
			}else if (selectNo == 7) {
				scn.nextLine();
				System.out.println("조회할 부서: ");
				String dept = scn.nextLine();
				List<EmployeeVO> list = service.getDeptList(dept);
				for(Object vo :list) {
					EmployeeVO 	emp = (EmployeeVO) vo;
					emp.showEmpInfo();
					
					
				
			}
		}
	}
}}