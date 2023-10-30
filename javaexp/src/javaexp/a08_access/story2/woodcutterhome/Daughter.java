package javaexp.a08_access.story2.woodcutterhome;

public class Daughter extends WoodCutter{
	// 상속하는 클래스에서 호출
	public void callWoodCutterInhit() {
//		System.out.println("private:"+privSecurity);
//		상속을 하더라도 private는 접근 불가..
		System.out.println("default:"+savingMoney);
		System.out.println("protected:"+inhiritance);
		System.out.println("public:"+announce);
	}
}
