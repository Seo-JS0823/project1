package com.emp.employee;

import lombok.Data;

@Data
public class EmployeeDTO {
	/*
	employee_id		사번
	department_id	부서
	worktype_id		근무형태 코드
	position_id		직급 코드
	name			이름
	gender			성별
	birthdate		생년월일
	email			이메일
	address			주소
	employment_date	입사일
	emp_flag		재직 상태 플래그 0=퇴사, 1=재직
	*/
	
	private String employee_id;
	private int department_id;
	private int worktype_id;
	private int position_id;
	private String name;
	private String gender;
	private String birthdate;
	private String phone_num;
	private String email;
	private String address;
	private String employment_date;
	private int emp_flag;
	
}
