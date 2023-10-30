package javaexp.a07_inherit.compart;

public class Z01_ExcuteComputer {
	public static void main(String[] args) {
		
		
		//1단계 : 공통내용 처리
		//2단계 : 재정의 내용처리
		Part p1 = new Part();
		p1.comInfo();
		p1.comInfo2();
		Ssd s1 = new Ssd();
		s1.comInfo();
		s1.comInfo2();
		Ram r1 = new Ram();
		r1.comInfo();
		r1.comInfo2();
		Cpu c1 = new Cpu();
		c1.comInfo();
		c1.comInfo2();
		
		//3단계 : 다형성 처리
		Part p2 = new Ssd();
		Part p3 = new Ram();
		Part p4 = new Cpu();
		System.out.println("다형성");
		
		p2.comInfo2();
		p3.comInfo2();
		p4.comInfo2();
		
	}	

}