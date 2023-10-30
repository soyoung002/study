package javaexp.a08_access.story2.son1home;

import javaexp.a08_access.story2.woodcutterhome.WoodCutter;

public class Son1 extends WoodCutter {
	// 상속하는 클래스에서 호출
	public void callWoodCutterInhit() {
		//System.out.println("private:"+privSecurity);
		//System.out.println("default:"+savingMoney);
		System.out.println("protected:"+inhiritance);
		// 상속한 클래스는 protected 외부패키지에 있더라도 접근 가능
		
		System.out.println("public:"+announce);
	}
	/*
	ex) a08_access.shapeworld
			Shape 클래스 선언
				protected 메서드
					도형을 그리다
		a08_access.triworld
			Triangle 클래스를 위 Shape를 상속받아서..
				protected 메서드를 호출하게 처리하세요.
	 * */
	
}
