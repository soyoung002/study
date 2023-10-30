package javaexp.a06_object.vo;

public class Student {
	private int no;
	private String name;
	private int grade;
	public Student(int no, String name, int grade) {
		this.no = no;
		this.name = name;
		this.grade = grade;
	}
	public void studentInfo() {
		System.out.println("# 학생 정보 #");
		System.out.println("학생번호:"+no);
		System.out.println("이름:"+name);
		System.out.println("학년:"+grade);
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
}
