package com.emp.employee;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/emp")
public class EmployeeController {

	// 직원 메인 페이지 보여주기
	// /
	@GetMapping("/")
	public ModelAndView empForm() {
		ModelAndView mav = new ModelAndView();
		
		return mav;
	}
	
	// 직원 휴가/초과근무 신청서 페이지 보여주기
	// /leaveForm
	public ModelAndView leaveForm() {
		ModelAndView mav = new ModelAndView();
		
		return mav;
	}
	
	
	// 직원 휴가 신청 로직
	// leaveC
	public ModelAndView leaveC() {
		ModelAndView mav = new ModelAndView();
		
		return mav;
	}
	
	
	// 직원 휴가 신청서 수정 로직
	// leaveU
	public ModelAndView leaveU() {
		ModelAndView mav = new ModelAndView();
		
		return mav;
	}
	
	
	// 직원 휴가 신청서 삭제 로직
	// leaveD
	public ModelAndView leaveD() {
		ModelAndView mav = new ModelAndView();
		
		return mav;
	}
	
	
	// 초과근무 신청 로직
	// overC
	public ModelAndView overC() {
		ModelAndView mav = new ModelAndView();
		
		return mav;
	}
	
	
	// 초과근무 신청서 수정 로직
	// overU
	public ModelAndView overU() {
		ModelAndView mav = new ModelAndView();
		
		return mav;
	}
	
	
	// 초과근무 신청서 삭제 로직
	// overD
	public ModelAndView overD() {
		ModelAndView mav = new ModelAndView();
		
		return mav;
	}
	
	
	// 지.결.조 신청서 페이지 보여주기
	// eatForm
	public ModelAndView eatForm() {
		ModelAndView mav = new ModelAndView();
		
		return mav;
	}
	
	
	// 지.결.조 신청 로직 실행
	// eatC
	public ModelAndView eatC() {
		ModelAndView mav = new ModelAndView();
		
		return mav;
	}
	
	
	// 지.결.조 신청 내역 수정 로직 실행
	// eatU
	public ModelAndView eatU() {
		ModelAndView mav = new ModelAndView();
		
		return mav;
	}
	
	
	// 지.결.조 신청 내역 삭제 로직 실행
	// eatD
	public ModelAndView eatD() {
		ModelAndView mav = new ModelAndView();
		
		return mav;
	}
	
	
	// 직원 정보 수정 페이지 보여주기
	// updateForm
	
	
	// 직원 정보 수정 로직 실행
	// update
	
	
	
}
