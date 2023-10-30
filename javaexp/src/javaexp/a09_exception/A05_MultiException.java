package javaexp.a09_exception;

public class A05_MultiException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 # 다중예외 처리 #
		 	1. 최하위레벨의 예외부터 처리
		 	2. 마지막에 최상위 예외 처리
		 * */
		try {
			String str = args[0];
			int num01 = Integer.parseInt(str);
			System.out.println("입력한 수 :"+num01);
		}catch(NullPointerException ne){
			System.out.println("ne:"+ne);
		}catch(ArrayIndexOutOfBoundsException ae){
			System.out.println("ae:"+ae);
		}catch(Exception e) {
			System.out.println("최상위 예외:"+e);
		}
		System.out.println("종료");
		//ex) String str = null;
		//	  int num01 = Integer parseInt(str01)
		//	  System.out.println(num01/0);
		//	  위에서 발생할 수 있는 예외 3가지를 이용해서
		//	  최종을 Exception을 계층적으로 처리하세요.
		try {
			String str01 = null;
			System.out.println(str01.toString());
//			str01 = "25";
			int num01 = Integer.parseInt(str01);
			System.out.println(num01/0);
		}catch(NullPointerException ne){
			System.out.println(ne.getMessage());
		}catch(NumberFormatException nfe) {
			System.out.println(nfe.getMessage());
		}catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
