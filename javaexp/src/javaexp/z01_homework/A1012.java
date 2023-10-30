package javaexp.z01_homework;

public class A1012 {

	public static void main(String[] args) {
		
		Food f1 = new Food();
		f1.eat();
		f1.et(new Food1());
		f1.et(new Food2());
		f1.et(new Food3());
		
		
	}
}
/*		[1단계:개념] 1. 추상클래스와 일반클래스의 재정의 차이점을 예제를 통해 기술하세요
//		* 추상클래스 : 추상 메소드를 가질수 있음
//					==> 구현이 없는 메소드(즉, 선언만 있고 구현이 없음) 
 * 						반드시 자식 클래스에서 구현되어야함.
 * 						쓰는 이유 : 공통된 기능을 추출하여 상위 클래스로 정의 가능
 * 									구체적인 구현을 자식 클래스에 위임 가능
 * 									다형성 구현 가능
						* 메소드는 선언/구현으로 구성
							- 선언 : 메소드의 이름,매개변수,반환 등을 정의(선언)
							- 구현 : 메서드 실제 기능을 실행(구현)			*/
		
//		[1단계:개념] 2. Food를 추상클래스로 선언하고, name(음식종류), 
//					eat()공통메서드 @@을 먹다, taste()추상메서드로 다양한 맛을 출력
//					좋아하는음식 3가지를 실제클래스를 선언하여 출력하세요.
	class Food {								//abstract 추상 클래스 선언
			private String name;					//name
			private Taste taste;
			public Food() {
				name="짬뽕";
			}
			public void eat() {						//public-공통메서드 :eat
				System.out.println(name+"을 먹다.");
			}
			
			public void et(Taste taste) {
//				String tasteStr = "";
//				for(int idx=1; idx<=3; idx++) {
//					tasteStr = name+"의 "+idx+"번째 맛은, ";
//					}
//				System.out.print(tasteStr);
				System.out.print(name+"의 맛은, ");
				
				if(taste!=null) {
					taste.taste(); 
					}
				}
			}
	
		interface Taste{
			void taste();
		}
		class Food1 implements Taste{
			public void taste() {
				System.out.println("매콤하고 불맛이나요!!");
			}
		}
		class Food2 implements Taste{
			public void taste() {
				System.out.println("국물이 시원합니다!!");
			}
		}
		class Food3 implements Taste{
			public void taste() {
				System.out.println("속이 풀리는 맛이에요!!");
			}
		}
		
		
/*		[1단계:개념] 3. 인터페이스의 구성요소의 특징을 예제와 함께 선언하세요
					인터페이스의 구성요소 : 인터페이스에 선언된 변수는 기본적으로 상수이다
									 추상메서드는 abstract키워드가 자동으로 추상 메서드에 붙는다
									==> 눈에 보이는 코드는 void taste();일지라도 
										public abstract가 자동으로 붙어서 인식하므로
										컴퓨터가 인식하는건 public abstract void taste(); 가 됨.
	*/	
//		[1단계:확인] 4. FishingWay goFishing() 인터페이스를 선언하여, 상속받은 실제클래스를 2개를 선언하고, 
//		실제클래스 Fisher에 이름과 인터페이스 FishingWay를 선언하고
//		addFishingSkill() 할당하게 하면  해당 어부가 낙시하는 goFishing()메서드를 호출하여 처리하세요.

		
	

