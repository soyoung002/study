package javaexp.a06_object.vo;

public class Person {
	private String name;
	private int age;
	public Person(String name, int age) { //생성자를 통해서 생성
		this.name = name;
		this.age = age;
	}
	public void showInf() {
		System.out.println("# perso객체의 정보 #"); //return값은 없지만 필드에 있는 값을 출력
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
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
