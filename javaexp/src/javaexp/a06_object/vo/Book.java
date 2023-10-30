package javaexp.a06_object.vo;

public class Book {
//		- 필드: 제목, 저자, 가격, 출판년도
//	    - 생성자: 모든 필드 초기화
//	    - 메서드: 도서 정보 출력, 가격 변경
	private String name; 
	private String name2; 
	private int price; 
	private int year;

	public Book(String name, String name2, int price, int year) {
		this.name = name;
		this.name2 = name2;
		this.price = price;
		this.year = year;
	}
	public void bookInfo() {
		System.out.println("# 책 정보 # ");
		System.out.println("책이름:"+name);
		System.out.println("저자:"+name2);
		System.out.println("가격:"+price);
		System.out.println("출판연도:"+year);
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}	
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year=year;
	}	
		
	
}
