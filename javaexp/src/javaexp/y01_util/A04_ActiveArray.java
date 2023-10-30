package javaexp.y01_util;

import java.util.ArrayList;
import javaexp.a06_object.vo.Student;
import javaexp.a06_object.vo.Car;

public class A04_ActiveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 
		 # 동적 배열
		 
		 1. 자바의 기본 배열을 한번 크기가 정해지면, 변경을 할 수 없다.
		 2. 자바에서는 동적 배열을 지원하는 객체를 API에서 제공한다.
		 	- Collection안에 List/ArrayList
		 3. ArrayList<타입>로 여러가지 객체들을 동적으로 추가하거나 삭제할 수 있다.

		 * */
		
		ArrayList<String> fruits = new ArrayList<String>();
		
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("딸기");	// 동적배열에 String 타입으로 추가 

		for(String fruit:fruits) {
			System.out.println(fruit);
		}
		
		fruits.set(0,"오렌지");	//특정한 index 위치 변경
		System.out.println("# 변경 후 #");
		
		for(String fruit:fruits) {
			System.out.println("fruit");
		}
		
		fruits.remove(1);	//특정한 index 위치 삭제
		System.out.println("# 삭제 후 #");
		
		for(String fruit:fruits) {
			System.out.println(fruit);
		}
		

		//members 라는 이름으로 동적 배열을 위와 같이 만들고 
		//회원 이름 3명을 추가,
		//2번째 데이터 변경
		//마지막데이터 삭제하고 출력하세요
		
		ArrayList<String> members = new ArrayList<String>();
		
		members.add("신짱구");
		members.add("김철수");
		members.add("최유리");	//3명을 추가
		
		members.set(1, "신맹구");	//2번째 데이터 변경
		members.remove(2);	//마지막 데이터 삭제
		
		System.out.println("# 최종 회원 리스트 #");
		
		for(String member:members) {
			System.out.println(member);
		
		}
		
		ArrayList<Student> stList = new ArrayList<Student>();
						   //(번호, 이름, 학년)
		stList.add(new Student(1,"홍길동",2));		//추가1
		stList.add(new Student(2,"김길동",3));		//추가2
		stList.add(new Student(3,"홍길동",1));		//추가3
		
		stList.set(0, new Student(4, "오길동", 1));	//수정
		
		stList.remove(1);							//삭제
		
		System.out.println("# 학생 동적 배열 리스트 #");
		for(Student st:stList) {
			System.out.println(st.getNo()+"\t");
			System.out.println(st.getName()+"\t");
			System.out.println(st.getGrade()+"\t");
		}
		
		
		//ex) Car(종류,속도) 5개를 위 ArrayList형식으로 추가 
		//		3번째 변경
		//		1번째 삭제 후
		// 		for문을 통해서 종류와 속도를 출력하여라.
		
		ArrayList<Car> carlist = new ArrayList<Car>();
	
		carlist.add(new Car("그랜저",90));
		carlist.add(new Car("제네시스",100));
		carlist.add(new Car("소나타",80));
		carlist.add(new Car("K7",60));
		carlist.add(new Car("제규어",150));
		
		carlist.set(2, new Car("K9",75)); 	//수정
		carlist.remove(0);	//삭제
		
		System.out.println("# 자동차 리스트 #");
		for(Car car:carlist) {
			System.out.println(car.getKind()+"\t");
			System.out.println(car.getSpeed()+"\n");
		}
		
		

	}
}
