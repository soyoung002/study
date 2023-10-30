package javaexp.a07_inherit.starcraft;

public class Z01_Game {

	public static void main(String[] args) {

//		Larba l1 = new Larba();
//		l1.attack();	//동일한 메서드에서 재정의(오버라이딩)호출
//		추상 클래스는 하위 객체를 위해 만들어 지기 때문에
//		독립적으로 객체 생성을 하지 못한다.
		
		Dron d1 = new Dron();	//동일한 메서드에서 재정의(오버라이딩)호출
		d1.attack();
		Hydra h1 = new Hydra(); //동일한 메서드에서 재정의(오버라이딩)호출
		h1.attack();
		
		//공통으로 동일한 내용 처리
//		l1.gameInfo(); d1.gameInfo(); h1.gameInfo();
		
		
		//다형성 : 상위 메모리에서  하위 메모리에 할당 
		Larba l2 = new Dron();
		Larba l3 = new Hydra();
		System.out.println("다형성에서 의해 만들어진 재정의 메서드");
		
		l2.attack();
		l3.attack();
	}

}
