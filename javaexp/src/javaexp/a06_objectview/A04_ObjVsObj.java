package javaexp.a06_objectview;
import javaexp.a06_objectview.vo.Car;
import javaexp.a06_objectview.CarOwner;

public class A04_ObjVsObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarOwner co01 = new CarOwner("홍길동");
		System.out.println("자동차 할당 없을 때..");
		co01.showMyCarInfo();
		System.out.println("===============");
		Car c01 = new Car("현대","그랜저",0);
		co01.setCar(c01);
		co01.showMyCarInfo();
		System.out.println("===============");
		co01.buyCar(new Car("기아","k7",0));
		co01.showMyCarInfo();
	}

}
