package javaexp.a06_object.vo;

public class Circle {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}
	// 면적을 리턴하는 메서드..
	public double getArea() {
		return Math.PI*radius*radius;
	}
	// 저장된 반지름을 가져오는 메서드
	public double getRadius() {
		return radius;
	}
	// 저장된 반지름을 변경하는 메서드.
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	

}
