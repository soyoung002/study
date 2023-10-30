package javaexp.a06_object;

import javaexp.a06_object.vo.Student;
import javaexp.a06_object.vo.School;

public class A11_ObjVsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
	# 1:다관계 처리
	
	1. 프로그램에서 여러가지 경우에 1:다관계로 데이터를 처리하는 경우
		 
		 ex)
		 1. 학교나 반에서 포함된 학생들 정보
		 2. 쇼핑몰에서 판매하는 물건들 정보나 회원들 정보
		 3. 출판사에서 출판한 책들
		 
		==> 처리방법
			1) 1:다관계에서 여러가지 처리하는 
				다수의 객체의 단일 데이터에 대한 클래스 설정 구조 처리...
			2) 다수의 객체를 포함하는 클래스 선언
					기본속성
					배열/동적배열 형태의 객체 선언
		 
		 * */
		
		School sch = new School("자바");
		sch.showSchoolInfo();		//==>등록되지 않음.
		sch.regStudent(new Student(1,"홍길동",1));
		sch.regStudent(new Student(2,"김길동",1));
		sch.regStudent(new Student(3,"신길동",1));
		sch.showSchoolInfo();	//등록된 리스트 출력
	}

}
