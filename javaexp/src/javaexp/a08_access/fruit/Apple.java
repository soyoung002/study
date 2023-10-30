package javaexp.a08_access.fruit;

public class Apple {

	private String tasteSec="사과 맛있당";
	public void callAppleInfo() {
		Apple a = new Apple();
		System.out.println(a.tasteSec);
	}
	
	public void callMellonInfo() {	//같은 패키지라서 바로 사용 가능
		Mellon m = new Mellon();
		System.out.println(m.taste);
	
		
	}
}
