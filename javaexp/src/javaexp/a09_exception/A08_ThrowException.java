package javaexp.a09_exception;

public class A08_ThrowException {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Throws랑 Throw랑 다름
		//Throw은 강제 위임
		
		//# throw :	특정한 조건이나 코드에서 강제 예외처리
		//1. 기본코드 : throw new 강제 예외 Exception(); 
//					 호출..
		try {
		System.out.println("# 강제 예외 처리 #");
		System.out.println("프로세스1");
		System.out.println("프로세스1");
		System.out.println("프로세스2");
		System.out.println("프로세스3");
		//특정 라인에서 예외를 던지기 처리
		//생성자로 넘겨준 문자열 내용은
		//e.getMessage()로 해당 값을 리턴할  수 있다.
		throw new Exception("강제예외 입니다.");
		
		}catch(Exception e){
			System.out.println("강제 예외 처리 결과:"+e.getMessage());
		}
		
		try {
			System.out.println("# 강제 예외 처리(for문) #");
			for(int cnt=1; cnt<10; cnt++) {
				System.out.println(cnt+"번째");
				if(cnt==5) {
					throw new Exception(cnt+"강제예외 입니다.");
			
				}
			}
			
		}catch(Exception e){
				System.out.println("강제 예외 처리 결과:"+e.getMessage());
				e.getMessage();	
		}
		
		
		//ex) 1~10까지 반복문에서 짝수번째에 NullPointerException를
//				강제예외 처리하세요
			System.out.println("# 1부터 10까지 짝수번째 강제예외 처리 #");
			
			for(int cnt=1; cnt<10; cnt++) {
				System.out.println(cnt+"번째");
				try {
				if(cnt%2==0){
					throw new NullPointerException(cnt+"는 짝수^^");
				}
		}catch(NullPointerException npe) {
			System.out.println("# 짝수번째 예외 발생 #");
			System.out.println(npe.getMessage());
			}		
	
		}
	}

}
