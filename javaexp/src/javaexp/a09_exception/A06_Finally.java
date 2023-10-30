package javaexp.a09_exception;

public class A06_Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 # finally
		 1. 예외가 발생하건 발생하지 않건 상관없이,
		 	수행 할 구문이 필요할 때 사용
		 2. 명시적으로 특정한 블럭 구문을 만들어 예외에 상관 없이
		 	처리 할 내용을 나타낼 때 사용
		 * */
		//1번째 try-catch 블록
		try {
		//문자열 변수 str을 null값으로 초기화
		String str=null;
		//null인 str을 소문자로 변환
		System.out.println(str.toLowerCase());
		}catch(NullPointerException ne) {
			//예외 발생
			System.out.println("# 예외 발생 #");
		}finally{
			//예외 발생 여부와 상관없이 처리 할 내용
			System.out.println("# 예외 상관없이 처리 할 내용_1 #");
		}
		//2번째 try-catch 블록
		try {
			//문자열 변수 str을 HIMAN으로 초기화
			String str="HIMAN";
			//str을 소문자로 변환
			System.out.println(str.toLowerCase());
			//toLowerCase : String클래스에서 제공하는 메서드
//							문자열의 모든 문자를 모두 소문자로 변환하여 반환 
			}catch(NullPointerException ne) {
				//예외 발생
				System.out.println("# 예외 발생 #");
			}finally{
				//예외 발생 여부와 상관없이 처리 할 내용
				System.out.println("# 예외 상관없이 처리 할 내용_2 #");
			}
		
		
		
	}

}
