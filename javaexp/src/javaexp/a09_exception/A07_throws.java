package javaexp.a09_exception;

import java.io.IOException;

public class A07_throws {
//	main()를 가지고 있는 클래스의 경우 객체 생성 없이 바로 사용할 때, 
//	main()메서드가 static이기에 바로 사용할 수 있도록 하기 위하여 선언한다
//	==> main()
//		static 아닌 경우 A07_throw 	a07= A07_throws();
//					   a07.메서드명();
	
	static void call00() {	//객체생성
		System.out.println("# 메서드 1 #");
		try {
			Class.forName("aaa.bbb.ccc");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//각 메서드 마다 try catch문을 만들어야 하는데
		//이것을 호출하는 곳에서 한꺼번에 처리하고자 할 때
	}
	
	static void call01() throws ClassNotFoundException {	//객체생성
		System.out.println("# 메서드 1 #");
		Class.forName("aaa.bbb.ccc");
	}
	static void call02() throws ClassNotFoundException {	//객체생성
		System.out.println("# 메서드 2 #");
		Class.forName("ddd.eee.fff");
	}
	static void call03() throws IOException {
		//ex)call03(), call04() 메서드를 만들고 필수예외 처리하세요.
			System.out.println(System.in.read());
	}
	static void call04() throws IOException{
			System.out.println(System.in.read());
	}
	
	public static void main(String[] args) {
		try {
			call00();
			call01();
			call02();
			call03();
			call04();
		}catch(Exception e){
			// 최상위 상속 관계에 있기에 모든 위임 예외를 한꺼번에 처리할 수 있다.
			System.out.println(e.getMessage());
		}
		
		
		try {
			// 메서드에서 위임된 예외 처리..
			call03();
			call04();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			call01();	//위임된 예외 처리
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			call02();	//위임된 예외 처리
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			call01();	//위임된 예외 처리
			call02();	//위임된 예외 처리
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		// TODO Auto-generated method stub
		/*
		 
		 # 예외 위임
		 1. 메서드별로 예외를 위임해서 한꺼번에 호출 곳에서 처리하는 것
		 2. 기본 형식
		 	void 메서드명() throws 위임클래스{
		 		예외가 나올만한 코드..
		 	}
		 	
		 	호출하는 곳
		 	try{
		 	메서드명1();
		 	메서드명2 ();
		 	}catch(위임할 클래스){
		 	
		 	}
		  
		 */
		
	}

}
