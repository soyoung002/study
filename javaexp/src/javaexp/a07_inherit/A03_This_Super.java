package javaexp.a07_inherit;

public class A03_This_Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
 	# this 생성자
 		1) 현재 클래스에서 정의된 생성자 호출
 		2) 현재 재정의 된 생성자를 호출 할 때, 사용
 		3) 현재 클래스와 상위 클래스의 생성자와 구분할 때도 사용된다.
 	#
  
 */
class Person{
	String name;
	int age;
	String loc;
	Person() {
		name="이름없음";
		loc="지역없음";
		
	}
	Person(String name) {
		this();			//현재 정의된 생성자 중에 매개변수가 없는 생성자 호출
		this.name=name;
	}
	Person(String name,int age) {
		this(name);		//현재 정의된 생성자 중에 이름이 있는 생성자 호출
		this.age=age;
	}
	Person(String name, int age, String loc){
		this(name, age);	
		//==>현재 정의된 생성자 중에 이름과 나이가 있는 생성자 호출
		this.loc = loc;
	}
}