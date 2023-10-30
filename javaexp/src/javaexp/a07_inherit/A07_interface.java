package javaexp.a07_inherit;

public class A07_interface {

	public static void main(String[] args) {
		
		/*
		 # 인터페이스 #
		 
		 1. 이해를 위한 도입
		 	Robot
		 	Mz : 지구를 지키는 로봇, 초기에 하늘을 날지 못함
		 	Mz에서 Flyway를 중앙장치로 컨트롤 할 수 있는
		 	메모리와 외부에서 실제 날개가 부착이 되어 처리할 수 있는
		 	어댑터 어깨에 만들어 상호작용 할 수있게 만듦
		 	
		 	Flyway(인터페이스) : 날수있게됨
		 						날개껍데기(어깨에 정보를 입/출력 하게 하는 처리 장치를 붙여 사용하게 함)
		 	Wing01(날개1호) 만들기 : 날개가 부착해서 붙여 놓은 인터페이스에 의해 실제 컨트롤로 작동하게 함
		 							이 후, 날개2호, 날개3호 ... 가 계속 만들어지지만
		 							Mz는 변경하지 않고 더 좋은 성능의 날개를 사용하게 된다.
		 2. 인터페이스란?
		 	1) 개발 코드와 객체가 서로 통신하는 접점
		 		- 개발 코드는 인터페이스의 메서드만 알고 있으면 된다.
		 	2) 역할
		 	 	- 개발 코드가 객체에 종속되지 않고 실제 객체가 교체할 수 있도록 하는 역할
		 	 		개발 코드가 변경 없이 리턴값 또는 실행 내용이 다양해 질 수 있음
		 3. 인터페이스의 활용
		 	1) 인터페이스의 이름 : 자바 식별자 작성 규칙에 의해 첫글짜 시작 대문자로 작성
		  	2) 소스 파일 또는 클래스 하위에서 생성
		  	3) 선언 : 접근 제어자 interface 인터페이스명{}
		 4. 구성요소
		  		상수: 인터페이스에 선언된 모든 변수는 기본적으로 상수이다.
		  			int FLYNO = 1; ==> 앞에 public static final이 사용으로 붙는다
		  		메서드 : 인터페이스는 재정의 매세드가 기본적으로 추상메서드로 붙는다.
		  				void fly(); ==> 앞에 public abstract가 자동으로 붙음
		  				추상 메서드에는 abstract 키워드 생략이 가능하지만
		  				abstract 를 생략시 추상 메서드임을 명확히 알수없으므로
		  				abstract 사용하는 것이 좋다.
		  		기타 : default메서드, 정적 메소드 지원
		  				default 리턴유형 메서드명() {}
		  				static 리턴유형 메서드명() {}
		  5) 인터페이스의 특징
		  	- 인터페이스는 extends를 통해 부모를 여러개 상속 받아서 사용할수 있다.
		  		인터페이스를 상속받은 실제 클래스는 여러개의 인터페이스를 선언하여 사용할수 있다
		  		class 실제 객체 implements 인터페이스1, 인터페이스2 {
		  		}
		 */
		
		FlyWay f01 = new Wing01(); 
		f01.fly();
		FlyWay f02 = new Wing01(); 
		f02.fly();
		
		SwimmingWay sw01 = new RuberDuckSwim(); sw01.swimming();
		SwimmingWay sw02 = new NormalDuckSwim(); sw02.swimming();
		
		Mz m1 = new Mz();
		m1.attack();
		m1.flying();
		
		//FlyWay f01 = new Wing01();
		m1.setFlyway(new Wing01());
		m1.flying();
		m1.setFlyway(new Wing02());
		m1.flying();
		m1.setFlyway(new Wing03());
		m1.flying();
		
		
		System.out.println("# 오리 세계 #");
		Duck d1 = new Duck();
		d1.quack();
		d1.swimming();
		d1.setSwimway(new RuberDuckSwim());
		
	}
}

class Mz{
	private FlyWay flyway;
	private String name;
	public Mz() {
		name="Mz로봇";
	}
	public void attack() {
		System.out.println(name+"가 공격을 하며 지구를 지킵니다.");
	}
	//날개를 장착하는 메서드
	public void setFlyway(FlyWay flyway) {
		this.flyway = flyway;
		System.out.println(name+"이 날개를 장착함.");
	}
	public void flying() {
		System.out.println(name+"은 !!");
		if(flyway!=null) {
			flyway.fly();
		}else {
			System.out.println("아직 날개가 장착되지 않아 날 수 없습니다.");
		}
	}
}
	//연결하는 껍데기 (인터페이스 선언)
	interface FlyWay {	
		 String NAME="날개인터페이스";
		   void fly();
		}
		class Wing01 implements FlyWay {
		   public void fly() {
		      System.out.println(NAME+"날개 1호로 우리 동네를 나르다!!");
		   }
		}
		class Wing02 implements FlyWay {
		   public void fly() {
		      System.out.println(NAME+"날개 2호로 우리 나라를 나르다!!");
		   }
		}

		// ex1) 날개3호 선언 지구의 하늘을 나르다..
		//   main()에서 할당해서 처리....
		
		class Wing03 implements FlyWay {
			public void fly() {
				System.out.println(NAME+"날개 3호로 지구의 하늘을 나르다!!");
			}
		}

//ex) Duck 클래스 SwimmingWay 필드 선언
//		addSwimFun() : 인터페이스를 통해 실제 객체 할당
//		showSwimming() : 오리가 수영하는 내용 출력
		
		class Duck {
		private String kind;
		private SwimmingWay swimway;
		
		public Duck() {	//void를 빼야 null값으로 안나옴
			kind = "오리!!";
		}
		public void quack() {
			System.out.println(kind+" 꽥꽥하면서 돌아다닌다");
			
		}
		public void setSwimway(SwimmingWay swimway) {
			this.swimway = swimway;
			System.out.println("오리가 수영하는 방법을 배웠습니다");
		}
		public void swimming() {
			System.out.println(kind+"!!!");
			if(swimway!=null) {
				swimway.swimming();
			}else {
				System.out.println("수영하는 방법을 배우지 못했습니다");
		}
	}
	
}	
		
	
//ex) interface SwimmingWay swimming();
//	class RuberDuckSwim : 고무장난감 오리가 목욕탕에서 수영을 하다.
//	class NormalDuckSwim : 동물 오리가 호수에서 수영을 하다.
//	다형성에 의해서 main() 
	
		interface SwimmingWay{
			String NAME = "[수영 인터페이스]";
			void swimming();
		}
		class RuberDuckSwim implements SwimmingWay{
			public void swimming() {
				System.out.println("일반 오리가 목욕탕에서 수영을 한다");
			}
		}
		class NormalDuckSwim implements SwimmingWay{
			public void swimming() {
				System.out.println("동물 오리가 호수에서 수영을 한다");
			}
		}
		
	
	