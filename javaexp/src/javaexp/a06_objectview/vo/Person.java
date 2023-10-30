// 제일 상담 이 클래스가 소속되어 있는 묶음 위치
package javaexp.a06_objectview.vo;

// 접근 제어자 class 클래스명(대문자로시작해야함) {}
public class Person {	//해당하는 클래스에 public 선언
	// Person Passport 1:1 관계
	private Passport passport;
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}

	public Passport getPassport() {
		return passport;
	}

	//Person p01 = new Person("홍길동",25);
	//p01.showMsg(); 객체 안에 객체가 없을 때 처리
	//p01.setPassPort(new Passport("AB2343","한국"));
	//p01.showMsg(); 객체 안에 객체가 있을 때 처리
	public void showMsg() {
		System.out.println("#인원 정보#");
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		if(passport!=null) {	//객체가 할당되어 있을 때
			// 객체가 할당되지 않았을 때 passport.get@@@() 에러발생
			System.out.println("#여권정보#");
		}else {	//그렇지 않을 때
			System.out.println("여권정보가 없습니다.");
		}
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}


