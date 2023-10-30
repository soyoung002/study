package javaexp.a06_objectview.vo;

public class Student 
{
	private int number;
	private String name;
	private Subject subject;
	
	public Student(int number, String name)
	{
		this.number = number;
		this.name = name;
		
	}
	
	public void setSubject(Subject subject)
	{
		this.subject=subject;
	}
	public void showMyPoint() 
	{
		System.out.println("# 학생정보 #");
		System.out.println("번호:"+number);
		System.out.println("이름:"+name);
		if(subject!=null) {
			System.out.println("과목:"+subject.getSubject());
			System.out.println("점수:"+subject.getScore());
		}else {
			System.out.println("과목에 대한 정보가 없습니다.");
		}
		System.out.println("====================");
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
