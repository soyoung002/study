package javaexp.a08_access.story2.woodcutterhome;

public class WoodCutter {
/*
	private : 개인적인비밀
	X : 가족들과여행계획/가족들의살림
	protected : 유산이 숨긴곳 
         		다른패키지에 있지만, 상속관계가 있는 클래스에서
				는 접근이 가능한 제어자
	public : 막내딸의결혼식
*/
	private String privSecurity= "천사옷은 뒷동산 바위 밑에";
	String savingMoney = "뒷 마당 항아리 밑에";
	protected String inhiritance="집천정위에";
	public String announce = "막내딸이 이달 보름에 결혼합니다.";
	// 상속하는 클래스에서 호출
	public void callWoodCutterInhit() {
		System.out.println("private:"+privSecurity);
		System.out.println("default:"+savingMoney);
		System.out.println("protected:"+inhiritance);
		System.out.println("public:"+announce);
	}
	// 상속하지않는 일반클래스 호출
	public void callWoodCutter() {
		WoodCutter wc = new WoodCutter();
		System.out.println("private:"+wc.privSecurity);
		System.out.println("default:"+wc.savingMoney);
		System.out.println("protected:"+wc.inhiritance);
		System.out.println("public:"+wc.announce);
	}			
	
	
}





