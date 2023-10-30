package javaexp.a06_object;

import javaexp.a06_object.vo.Calculator;
import javaexp.a06_object.vo.Circle;
import javaexp.a06_object.vo.Person;
import javaexp.a06_object.vo.Product;
import javaexp.a06_object.vo.Rectangle;
import javaexp.a06_object.vo.Student;

public class A08_ObjectUsing {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Rectangle 클래스의 생성자를 통해서 넓이와 높이 할당
		Rectangle rt = new Rectangle(10, 20);
		System.out.println("높이:"+rt.getHeight());
		System.out.println("폭:"+rt.getWidth());
		System.out.println("면적:"+rt.getArea());
		
		Circle c1 = new Circle(10);
		System.out.println("반지름:"+c1.getRadius());
		System.out.println("면적:"+c1.getArea());
		c1.setRadius(15); // 반지름 변경
		System.out.println("변경후, 면적:"+c1.getArea());
		Circle c2 = new Circle(20);
		System.out.println("반지름:"+c2.getRadius());
		System.out.println("면적:"+c2.getArea());
		c2.setRadius(25);
		System.out.println("변경후면적:"+c2.getArea());
		
		
		
		Person p01 = new Person("홍길동",25);
		p01.showInf();
		p01.setName("마길동");
		p01.setAge(30);
		p01.showInf();
		// ex1) Product 생성자로 물건명, 가격, 재고수량을 저장
		//     public void showInfo() 메서드를 통해서 출력.
		//     get/set메서드 추가..
		Product pro = new Product("사과",3000,5);
		pro.showInfo();
		pro.setName("오렌지");
		pro.setPrice(5000);
		pro.showInfo();
		// ex2) Student 생성자로 학생번호, 이름, 학년 할당.
		//     public void studentInfo() 로 출력..
		//     get/set메서드로 추가.
		Student st = new Student(1,"홍길동",3);
		st.studentInfo();
		st.setName("마길동");
		st.setNo(5);
		st.studentInfo();
		Calculator cal1 = new Calculator(10,5);
		System.out.println(cal1.plus());
		System.out.println(cal1.minus());
		System.out.println(cal1.multi());
		System.out.println(cal1.divide());
		// ex) Car 초기속도, 자동종류
		//    public void speedUp()  
		//         @@가 속도가 올라 @@km/h 이다 출력
		//    public void speedDown()  
		//         @@가 속도가 내려 @@km/h 이다 출력
		
		
		
	}

}
