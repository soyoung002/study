package javaexp.a09_exception;

public class A03_RuntiomeError {
	public static void main(String[] args) {

	/*	# 실행 예외 처리 순서
 		1. 실행 예외 나올 코드 내용 수행
 		2. 해당 에러 코드를 복사 catch문에 예외 처리 */
		for(int cnt=10; cnt>=-10; cnt--) {
			System.out.println("1에서 "+cnt+"를 나눈값");
//			System.out.println((double)1/cnt);
		}
//		 1/0... 이와 같이 런타임 에러는 실행을 하기전까지 에러인지 파악이 안된다.
//		 위와 같이 나누기 값이 0이 될 수도 있고,
//		 그 외에 숫자가 될 수도 있어 실행이 될 때,
//		 예외 처리 되게 하는 것으로 예외가 나올 수 있는 상황을 코드하여 예외를 처리한다.
//		
//		# 반복문의 경우
//			1. try문을 반복문 안에 넣는 경우
//				해당 step에서 예외처리를 하고 다음 step으로 넘어갈 수 있다
//				ex) for(int cnt=10; cnt>=-10; cnt--) {
//						try{
//							System.out.println("1에서 "+cnt+"를 나눈값");
//							System.out.println((double)(1/cnt));
//						}catch(Exception e){
//							System.out.println("예외발생:"+e.getMessage());
//					}
//				}
//			2. try문을 반복문 밖에 감싸는 경우
//				해당 step에서 전체 반복문이 중단이 된다.
//					ex)	try{
//						 for(int cnt=10; cnt>=-10; cnt--) {
//							System.out.println("1에서 "+cnt+"를 나눈값");
//							System.out.println((double)(1/cnt));
//						}catch(Exception e){
//							System.out.println("예외발생:"+e.getMessage());
//					}
//				}
		System.out.println("시작!");
		try {
		System.out.println(1/0);	
		//1에서 0으로 나눈 처리 자체가 잘못 됐다 인식하므로 예외 코드
		}catch(ArithmeticException e){
			System.out.println("실행예외 발생:"+e.getMessage());
		}
		System.out.println("종료!");
		
		
		//ex1) 실행 예외 연습1
		try{
			String s = null;	//null은 아무값도 없으므로
			s.toString();		//s의 객체 값이 없기 때문에 예외발생
//			객체 속성 호출 toString(); 
//			객체가 heap영역이 생성되지 않은 상태에서 메서드를 호출 하니, 
//			주소값이 없습니다. 에러가 나오는데 이것을 처리해주는 예외 처리내용
//			NullPointerException :
//			Pointer : 주소가 Null 없을때, Exception 에러
		}catch(NullPointerException ne) {
		System.out.println("실행예외 발생:"+ne.getMessage());
		}
		//ex2) 실행 예외 연습2
		try{
			args[1].toString();
			//ArrayIndexOutOfBoundsException 
			//배열의 인덱스의 범위를 벗어난 예외
		}catch(ArrayIndexOutOfBoundsException ab){
			System.out.println("# 예외 #");
			System.out.println(ab.getMessage());
		}
		
		//ex3) 실행 예외 연습3
		try {
		Integer.parseInt("하나");
		}catch(NumberFormatException nf) {
			System.out.println("# 예외 #"+nf.getMessage());
		}
	}
}

/*
 
 # 예외와 예외클래스
 1. 프로그래밍을 하면, 에러나 여러가지 오류로 인하여 
 	처리하는 과정에서 문제가 발생하는 경우가 있다.
 	이러한 문제는 프로그램에 대한 신뢰성에 
 	치명적인 영향을 미치므로 효과적인 대응을 하는 것이 필요하다
 2. 자바는 이러한 프로그래밍의 에러나 예외적인 상황에 대응하기 위해
 	예외 처리 코드를 api로 지원하고 있다.
 	==> Exception(내장된 내용) : 만들어진 것을 활용
 		try{
 			예외가 나올만한 코드1
 			예외가 나올만한 코드2
 			예외가 나올만한 코드3
 		}catch(예외처리 클래스){
 		
 		}
 3. 오류의 종류
 	1) 에러를 처리하려면 우선 자바에서 발생하는 오류의 종류를 알고,
 		해당 사항에 대한 적절한 오류 처리 방법을 코드로 구현하여야 한다.
 	2) 오류는 크게 2가지로 나뉜다.
 		- 에러 : 하드웨어의 잘못된 동작 또는 고장으로 인한 오류
 				에러가 발생되면 프로그램은 종료
 				정상 실행 상태로 돌아갈 수 없음
 		- 예외 : 사용자의 잘못된 조작 또는 개발자의 잘못된 코딩으로 인한 오류
 				예외가 발생되면 프로그램이 종료된다.
 				예외 처리를 추가시 정상 실행 상태로 돌아갈 수 없음
 				==> 예외 처리를 통해, 에러의 내용을 파악하고
 					에러가 발생하여도 프로그램이 멈추지 않고 정상적인 처리를 하는 것으로
 					사용자의 신뢰성 확보를 할 수 있다.
 	3) 프로그래밍 처리 방법으로 인한 구분
 		- 일반(컴파일 체크)예외 : 예외 처리 코드가 없으면 컴파일 오류가 발생하고
 							보통은 컴파일도 안되기에 툴에서 왼쪽에 빨간색으로 표시된다.
 							==> 필수 예외 처리가 필요한 것으로 IO(input output) 처리되는 것과
 								메모리가 로딩되는 것 등이 주로 이 예외 처리의 에러이다
 								ex) IO(파일읽기/쓰기/데이터전송), DB처리, 네트워킹 처리 등
 		- 실행(런타임 에러)예외 : 예외 처리 코드를 생략하더라도 컴파일이 되는 예외로 경험에 따라
 							예외 처리 코드 작성이 필요하다.
 							실행 후, 처리되는 데이터에 대한 예외를 발생하는 경우
 							
 							==>	heap 메모리 호출에러(NullPointerException)
 								배열 에러(ArrayIndexOutOfBoundsException), 
 								0 나누기(ArithMethicsException)
 								
 								등 프로그램에 발생하는 에러 처리이다.
 4. 단계별 예외 처리 형식
 	1) 1단계 기본형식
 		try{
 			1
 			2 예외가 나올만한 코드
 				==> 해당 라인에서 예외 던짐 throw new XXX();
 					사용자 정의 예외 이외는 내부적으로 예외를 던짐
 			3 이후 라인은 수행하지 못 함
 			4
 		}catch(Exception e){
 			Exception 상속 관계의 상위이기에 하위는 모든 예외를 받음
 			예외가 나왔을 때, 처리 할 내용
 			e.기능메서드() : 예외에 대한 정보를 처리 할 수 있는 내용 수행
 			e.getMessage() : 예외의 가장 기본 정보를 가져온다.
 		}
 	2) 2단계 계층적 처리
 		try{
 		
 		}catch(최하위 예외 클래스){
 			메모리가 가장 작고 좁은 범위의 최하위 예외에 대한 처리를 먼저
 		}catch(최상위 예외 클래스){
 		
 		}catch(상위 예외 클래스){
 		
 		}finally{
 		 예외 상관 없이 처리
 		}
 	3) 3단계 예외의 위침
 		- 필요성 : 예외가 나오는 구문을 위 try{}catch{}블럭으로
 				 모든 곳에 메서드별로 처리해야 하는데, 이것을 기능메서드별로 구분하여
 				 처리하지 않고, 이 메서드가 호출할 때 처리하는 것을 에외 위임이라고 한다.
 				 - 코드의 중복성을 줄이고 try{}catch(){}
 				 	블럭 각 메서드별로 try{}catch(){}블럭을 사용하지 않아도 된다.
 				 - 체계적으로 분류하여 예외 처리를 관리하기 위한 목적
 				 	다중 예외 처리를 통해 효과적으로 관리 할 수 있다.
 				 	ex) NullPointer 처리 할 때 예외 블럭 내용 기술 
 				 		==> 수학관련 처리를 할 예외 블럭 내용 기술
 				 		==> 배열관련 처리를 할 예외 블럭 내용 기술
 				 		==> 컴파일 관련 처리를 할 예외 블럭 기술
 				 - 메소드별로 예외를 위임하여 처리 : 2개이상도 예외를 위임 할 수 있다.
 				 	ex) void 메소드명() throws 위임 할 예외 1, 위임할 예외 2...{
 				 
 				 		}try{
 				 			메소드명 예외가 위임되어 호출되는 내용
 				 		}catch(위임된 예외 처리 클래스1){
 				 		
 				 		}catch(위임된 예외 처리 클래스2){
 				 		
 				 		}
 				 
 
 
 */