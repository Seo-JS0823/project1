<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
<style>
	/* 모달창 CSS */
	#addressModal {
		display: none;
		position: fixed;
		top: 20%;
		left: 30%;
		width: 40%;
		padding: 20px;
		background: #FFF;
		border: 1px solid #CCC;
		
		height: 300px;
		overflow-y: auto;
	}
</style>
</head>
<body>
	<form action="/manage/empC" method="post">
	
		<!-- 이름 : name -->
		이름<input type="text" name="name"/><br>
		
		부서
		<!-- 부서코드 : department_id -->
		<select name="department_id">
			<option value="1010">총무 경비팀</option>
			<option value="1020">총무 시설관리팀</option>
			<option value="2010">재무회계 1팀</option>
			<option value="2020">재무회계 2팀</option>
			<option value="2030">감사팀</option>
			<option value="3010">영업 1팀</option>
			<option value="3020">영업 2팀</option>
			<option value="3030">영업 3팀</option>
			<option value="4010">자재관리팀</option>
			<option value="5010">가공 1팀</option>
			<option value="5020">가공 2팀</option>
			<option value="6010">생산 1라인</option>
			<option value="6020">생산 2라인</option>
			<option value="6030">생산 3라인</option>
			<option value="7010">운송 1팀</option>
			<option value="8010">안전관리팀</option>
		</select><br>
		
		근무형태
		<!-- 근무형태코드 : worktype_id -->
		<select name="worktype_id">
			<option value="1">정규직</option>
			<option value="2">계약직</option>
			<option value="3">파견직</option>
			<option value="4">일용직</option>
		</select><br>
		
		직급
		<!-- 직급코드 : position_id -->
		<select name="position_id">
			<option value="11">사원</option>
			<option value="12">대리</option>
			<option value="13">과장</option>
			<option value="14">차장</option>
			<option value="15">부장</option>
			<option value="21">생산사원</option>
			<option value="22">A팀 반장</option>
			<option value="23">B팀 반장</option>
			<option value="24">생산반장</option>
			<option value="25">생산부팀장</option>
			<option value="26">생산본부장</option>
			<option value="31">가공사원</option>
			<option value="32">가공반장</option>
			<option value="41">운송사원</option>
			<option value="42">운송팀장</option>
			<option value="43">운송본부장</option>
			<option value="51">안전관리본부장</option>
		</select><br>
		
		<!-- 성별 : gender -->
		성별<input type="text" name="gender"/><br>
		
		<!-- 생년월일 : birthdate -->
		생년월일<input type="date" name="birthdate"/><br>
		
		<!-- 전화번호 : phone_num -->
		전화번호<input type="text" name="phone_num"/><br>
		
		<!-- 이메일 : email -->
		이메일<input type="text" name="email"/><br>
		
		<!-- 주소코드 : address_id -->
		<input type="hidden" id="addressCode" name="address_id"/>
		
		<!-- AJAX & JS : 주소검색버튼 = addressSearch -->
		<button type="button" id="addressSearch">주소검색</button><br>
		
		<!-- AJAX & JS : 검색해서 선택한 주소 = successAddr -->
		<input type="text" id="successAddr" readOnly/><br>
		
		<!-- AJAX & JS : 모달창 = addressModal -->
		<div id="addressModal">
		
			<!-- AJAX & JS : 도로명 주소 입력란 = searchKeyword -->
			<input type="text" id="searchKeyword" placeholder="도로명 주소 입력"/>
			
			<!-- AJAX & JS : 도로명 주소 입력란 입력하고 검색 버튼 누르면 실행 = searchBtn -->
			<button type="button" id="searchBtn">검색</button>
			
			<!-- AJAX & JS : 서버에서 넘어온 주소 리스트가 담길 영역 -->
			<ul id="addressList"></ul>
			
			<button type="button" id="closeModal">닫기</button>
		</div>
		입사일<input type="date" name="employment_date"/><br>
		<input type="submit" value="등록"/>
	</form>
<script src="/js/address.js"></script>
</body>
</html>