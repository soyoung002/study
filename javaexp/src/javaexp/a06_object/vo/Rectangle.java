package javaexp.a06_object.vo;

public class Rectangle {

	// 필드 접근 제어 private : 직접 접근 불가.
	private double width;
	private double height;
	
	
	// 생성자를 통해서 초기화 처리 ==> 
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}//get.Area
	public double getArea() {		//==>필드에 입력되 width와 height를 기준으로 면적을 가져오는 메서드
		return width*height;
	}
	//rt.getWidth()
	public double getWidth() {
		return width;
	}
	//rt.getHeigt
	public double getHeight() {
		return height;
	} 
	
	
	
}
