package javaexp.a06_objectview;

import javaexp.a06_objectview.vo.Subject;
import javaexp.a06_objectview.vo.Employee;
import javaexp.a06_objectview.vo.Office;
import javaexp.a06_objectview.vo.Student;
public class A05_ObjVsObjExp 
{

	public static void main(String[] args) {
		
		/*
		 ex) Office(포함 될 객체)
		 			location(위치), capcity(수용인원)
		 		Employee(포함할 객체)
		 			name(이름), age(나이), 
		 			Office office
		 			set@@@
		 			get@@@
		 			void showMyOfficeInfo() 위 포함될 객체의 정보 출력
		 			
		 * */
		Employee emp01 = new Employee("홍길동", 25);	//이름,나이
		emp01.showMyOfficeInfo();
		emp01.setOffice(new Office("서울 서초동",20));
		emp01.showMyOfficeInfo();
		//ex) 다른 사무실 정보 할당 후..
		//showMyOfficeInfo()호출
		emp01.setOffice(new Office("제주 서귀포시",30));
		emp01.showMyOfficeInfo();
	 
		
		
		/*
		 * 
		 Subject 포함될 클래스
		  과목, 점수
		 
		 Student
		 	번호 이름
		 	Subject subject;
		 	void showMyPoint() 학생의번호 이름 과목 점수
		 	
		 * */
		
		Student st1 = new Student(1, "홍길동");
		st1.showMyPoint();
		st1.setSubject(new Subject("영어",80));
		st1.showMyPoint();
		
		
		
		
	}

}
