package javaexp.a06_object.vo;

public class Bus {
	// 필드 : 데이터
	private int speed;	//속도
	private String bno;	//버스번호
	private String target;	//노선
	private int pCount;	//탑승자수
	/**
	 * 
	 */
	public Bus() {
		
	}
	//2. 필요한 필드값의 초기화(객체 생성)
	//		숫자데이터는 기본적으로 0을 초기화 해준다.
	//		main()에서 객체가 생성될 때, 초기화된다.
	//		Bus p01 = new Bus("8001", "서울~인천");
	//		Bus p02 = new Bus("8002", "서울~평택");

	public Bus(String bno, String target) {
		this.bno = bno;
		this.target = target;
	}
	//3. 기능 메서드
	//		1) 데이터를 직접적으로 호출해서 사용할 수 없지만
	//			간접적으로 특정한 기능에 의해서 처리할 수 있게 한다.
	//			변경/수정 가능..
	//			Bus p03 = new Bus();
	//			p03.setBno("9999");
	//			p03.setTarget("서울~오산");
	//			p03.getSpeed() 현재 속도 확인
	//			p03.setSpeed(10);
	//			p03.speedUp();
	//			p03.speedUp();
	//			p03.speedUp();
	//			p03.speedUp();
	//		2) 특정 기능 수행에 의해서 출력 및 특정 형식으로 처리
	public void speedUp() {
		speed+=10;	//속도를 해당 메서드가 호출시 10마다 올려줌
		//출력 메서드에 의해 출력 처리
		if(speed>=200) {
			speed = 200; //속도가 200이상이면 더 이상 증가 못하게 처리
		}
		System.out.print("속도 증가");
		showSpeed();
	}
	//속도 줄이기..메서드 선언 및 출력, 0 미만시는 0으로 처리
	public void speedDown() {
		speed-=10;	//속도를 해당 메서드가 호출시 10마다 줄여줌
		if(speed<0) {
			speed = 0;
		}
		System.out.print("속도 감소");
		showSpeed();
	}	
	//외부에서 호출하지 않고, 현재 클래스 내부에서만 재활용 할 때
	//private로 선언하여 처리
	private void showSpeed() {
		System.out.println("현재속도:"+speed+"km/h");	
		//출력 메시더에 의한 출력 처리
	}
	
	public int getSpeed() {
		return speed;	//직접적인 접근은 불가하지만 간접적으로 접근 가능
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getBno() {
		return bno;
	}

	public void setBno(String bno) {
		this.bno = bno;
	}

	public int getpCount() {
		return pCount;
	}

	public void setpCount(int pCount) {
		this.pCount = pCount;
	}
	
	
	// 생성 : 필드의 초기화
	
	// 메서드 : 객체를 통해서 처리하는 기능적인 수행
	//			1) 필르 저장
	//			2) 필르 호출
	//			3) 기능적인 내용에 따라서 필드값을 변경 
}
