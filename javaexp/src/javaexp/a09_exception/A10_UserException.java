package javaexp.a09_exception;

public class A10_UserException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 		# 처리 순서
 			1. 사용자 정의 예외 처리 클래스 선언
 				class XXX extends Exception{}
 			2. main()에서 호출하는 처리
 	
 			
 	ex) 사용자 정의 예외 클래스 UserExpt 선언하고,
 		기능메서드로 void call()를 "사용자 정의 예외 출력"의 출력을 추가 메서드를 정의하세요.
 		또한, 반복문에서 이번에는 3의 배수일때, 호출되게 하세요
 * */
		for(int cnt=1; cnt<=20;cnt++) {
			System.out.println("카운트:"+cnt);
			try {
				if(cnt%3==0) {
					throw new UserExpt();
				}
				if(cnt%3==1) {
					throw new UserExpt("3의 배수에서 1이 나머지인 경우");
				}
			}catch(UserExpt ue2) {
				ue2.call();
				if(ue2.getMessage()!=null)
					System.out.println(ue2.getMessage());
//				System.out.println("[사용자 정의 예외출력(3의배수)]:"+cnt);
			}
		}
		
	}

}
class UserExpt extends Exception{
	public UserExpt() {
		
	}
	public UserExpt(String msg) {
		super(msg); // ==> e.getMessage();
	}
	public void call() {
		System.out.println("사용자 정의 예외 출력(3의 배수)");
	}
}	
