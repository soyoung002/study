package javaexp.a07_inherit.starcraft;

public class Dron extends Larba{
	//attack()의 재정의 된 내용이 되야하는데
	//attack1() 오타일시 추상화를 통해 
	//재정의가 아니고 추가되는 메서드로 처리됨
	
	public void attack1() {
		System.out.println("드론이 공격합니다.");
	}
//	추상 클래스를 상속 받은 클래스는 
//	추상메서드를 반드시 선언하여야 한다.
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("드론이 공격합니다!!!(추상메서드)");
		
	}
	
	
}
