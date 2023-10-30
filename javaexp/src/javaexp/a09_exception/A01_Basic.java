package javaexp.a09_exception;

public class A01_Basic{
	public static void main(String[] args) {
	
	/*
	 * 위에서 아래로, 왼쪽에서 오른쪽으로
	 대입연산자(오른쪽에서 왼쪽으로 대입 처리)
	 프로그램 에러발생 : 일단 프로세서를 중단하고 더 이상 진행하지 않는다.
	 				이 때 에러가 발생하더라도 정상적으로 진행은 하게 처리하는 것이 
	 				예외 처리이다
	 try{
	 	처리1
	 	처리2
	 	에러가 발생할 가능성 있는 코드
	 	}catch(Exception e){
	 	처리3
	 	}
	 	처리4 : 계숙 수행해서 마무리 처리가 가능

	 * */
	try {	//실제 프로그램
	System.out.println("라인1");
	System.out.println("라인2");
	System.out.println("라인3");
	System.out.println("라인4");
	
	//예외 처리를 하지 않으면 프로그램이 중단
	//throw new 예외 클래스()
	System.out.println("라인5"+1/0);	//에러발생으로 중단
	
	System.out.println("라인6");
	System.out.println("라인7");
	
	}catch(Exception e) {	
		//상위(Exception e) = 하위(Exception 상위 받은 하위)
		//예외에 대한 코드 처리
		//1. 화면 : 에러발생에 대한 메세지처리/기타 정보
		//2. 로그파일 저장(log) ==> 에러 관리 효율
		//3. 에러에 대한 시간별 DB 저장 ==> 에러 관리 효율
		System.out.println("에러발생:"+e.getLocalizedMessage());
		e.getMessage();
	}
	//catch문에서 처리해주고, 다음 진행이 가능
	
	System.out.println("라인8");
	System.out.println("라인9");
	System.out.println("라인10");
	
	}
}



	
