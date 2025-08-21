package com.emp.manager.employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.emp.employee.EmployeeDTO;
import com.emp.employee.EmployeeMapper;
import com.emp.util.EmployeeID;

@Controller
@RequestMapping("/manage")
public class ManagerEmployeeController {

	@Autowired
	private EmployeeMapper empMapper;
	
	/* 관리자 메인 페이지 보여주기 */
	@GetMapping("/")
	public ModelAndView manageForm() {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("manager/manageBoard");
		return mav;
	}
	
	/* 직원 등록 페이지 보여주기 */
	@GetMapping("/empForm")
	public ModelAndView empForm() {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("manager/emp_create_view");
		return mav;
	}
	
	/* 직원 등록 실행 */
	@PostMapping("/empC")
	public ModelAndView empC(EmployeeDTO employee) {
		ModelAndView mav = new ModelAndView();
		
		String id = "";
		try {
			id = employee.getDepartment_id() + EmployeeID.createEmpID(
					new SimpleDateFormat("yyyy-mm-dd").parse(employee.getBirthdate()),
					new SimpleDateFormat("yyyy-mm-dd").parse(employee.getEmployment_date()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(id);
		employee.setEmployee_id(id);
		
		empMapper.employeeInsert(employee);
		
		/* 보여줄 페이지 */
		mav.setViewName("redirect:/manage/");
		return mav;
	}
	
}
