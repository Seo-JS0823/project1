package com.emp.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeID {
	/*
	다음 4 자리 : 부서코드
	다음 7 자리 : 생년월일의 앞에서 두 자리 + (입사일 + 11004부터 99999까지의 랜덤 난수)
	*/
	
	public String createEmpID(Date birthdate, Date emplyment_date) {
		SimpleDateFormat birth = new SimpleDateFormat("yyyy");
		SimpleDateFormat empDate = new SimpleDateFormat("dd");
		String date = birth.format(birthdate);
		int emp = Integer.parseInt(empDate.format(emplyment_date));
		
		String start = date.substring(2,4);
		String last = date.substring(0,2);
		
		int endFormat = Integer.parseInt(last);
		int random = endFormat + (int) (Math.random()*99999) + 11004;
		String id =  start + (random + emp);
		
		return id;
	}
	
}
