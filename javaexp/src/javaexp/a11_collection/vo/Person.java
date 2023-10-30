package javaexp.a11_collection.vo;

public class Person {
	
	private String name;
	private int age;
	private String ad;
	
	
	
//	public Person() {
//		// TODO Auto-generated constructor stub
//	}
//


	public Person(String name, int age, String ad) {
		this.name = name;
		this.age = age;
		this.ad = ad;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getAd() {
		return ad;
	}



	public void setAd(String ad) {
		this.ad = ad;
	}
	

	
}
