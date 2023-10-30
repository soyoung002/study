package javaexp.a10_api;

import java.util.ArrayList;

public class A01_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p01 = new Person();
		System.out.println(p01);	//주소값을 불러옴
		//Object는 최상위이므로, 다형성에 의해서
		Object ob1 = new Person();
		Object ob2 = "안녕";
		Object ob3 = new ArrayList();
		
	}

}
//자바의 모든 클래스는 묵시적으로 extends Object로 처리되고 있다.
//Object는 자바의 최상위 부모 클래스
/*
 
 * */
class Person extends Object{

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[비밀은 여기에]" + super.toString();
		
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	
}