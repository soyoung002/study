package javaexp.a08_access.story2.woodcutterhome;

public class Angel {
	// 상속하지않는 일반클래스 호출
	public void callWoodCutter() {
		WoodCutter wc = new WoodCutter();
		//System.out.println("private:"+wc.privSecurity);
		// 같은 패키지라도 private는 접근이 불가능
		System.out.println("default:"+wc.savingMoney);
		System.out.println("protected:"+wc.inhiritance);
		System.out.println("public:"+wc.announce);
	}	
}
