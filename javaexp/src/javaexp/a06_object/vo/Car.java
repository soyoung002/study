package javaexp.a06_object.vo;

public class Car {
	private String kind;
	private int speed;
	public Car(String kind, int speed) {
		this.kind = kind;
		this.speed = speed;
	}
	public void showInf() {
		System.out.println(kind+"가 속도가 올라 "+
				speed+"km/h 이다");
	}
	public void speedUp() {
		speed+=10;
		showInf();	//선언된 메서드 호출
	}
	public void speedDown() {
		speed-=10;
		showInf();
		
	}
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	
	}
	
}
