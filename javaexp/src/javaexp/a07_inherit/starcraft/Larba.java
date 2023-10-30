package javaexp.a07_inherit.starcraft;

public abstract class Larba {	
						
	//모든 유닛에 공통되는 내용 처리
	public void gameInfo() {
		System.out.println("스타그래프트 저그 유닉입니다.");
	}
	//각 유닛(Larba)마다 재정의 할 내용
	public abstract void attack() ;	// abstract:추상메서드
	//추상 메서드가 1개라도 있으면 추상 클래스가 된다.
	
	//	{
//		System.out.println("라바가 공격합니다.");
//	}
	
}
