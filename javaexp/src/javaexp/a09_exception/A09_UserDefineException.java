package javaexp.a09_exception;

public class A09_UserDefineException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//반복문에서 짝수 번째 사용자 예외 처리
		for(int cnt=1; cnt<=10; cnt++) {
			System.out.println("번호:"+cnt);
			try {
				if(cnt%2==0) {
					throw new User01Exception(cnt+"번 예외처리");
				}
			}catch(User01Exception ue) {
				//사용자 정의 추가 메서드 처리
				ue.setSerialNum("#"+cnt);
				//재정의 된 메서드 호출
				System.out.println(ue);
				User02 u02 = new User02(null);
				System.out.println(u02);
			}
		}
	}
}

// extends Object 기본적으로 탑재 되어 있기에
// 상속에 의해 포함하는 수성요소를 호출하여 사용하거나
// 아래와 같이 재정의 할 수 있다.

//class Exception{
//	private String msg;
//	Eception(String msg) {
//		this.msg = msg;
//	}
//	String getMessage() {
//		return msg;
//	}
//}

class User02 extends Exception {
	
	public User02(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}

	@Override
	public StackTraceElement[] getStackTrace() {
		// TODO Auto-generated method stub
		return super.getStackTrace();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[재정의추가]"+super.toString();	//객체의 참조할때 사용
	}
	
	
}
class User01Exception extends Exception{
	
	private String serialNum;
	
	public User01Exception(String message) {
		super("[사용자정의 예외]"+message);
		//super.getMessage()처리
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "^^ 안녕하세요 신기하죠!!";
	}
	//기존 메서드 재정의
	@Override
	public String getMessage() {
		
		return super.getMessage()+":메서드 처리(재정의)"+serialNum;
	}

	//추가 메서드 처리
	public String getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}
	
}

/*
 # 사용자 정의 예외 처리
 1. 기본에 있는 Exception의 구성 요소를 사용하면서
 	추가적인 필드나 메서드를 만들어서 사용자 정의 예외 클래스를 선언하고
 	이렇게 선언된 클래스를 객체로 사용할 수 있다.
 2. 사용자 정의 예외 처리 순서
 	1) 사용자 정의 클래스 선언(extends Exception)
 		기본 예외 클래스를 상속하여 처리한다.
 		class UserException extends Exception{
 		
 		}
 	2) 기본 생성자에서 추가할 내용이 필요하면 super()를 활용하여,
 		상위 생성자의 내용을 호출하면서 처리할 수 있다.
 			UserException(String msg){
 				super("[사용자정의 예외]"+msg);
 				}
 	3)클래스 정의할 때, 필요로 하는 필드와 메서드들을 추가하거나 재정의해서 사용할 수 있다
 		class UserException extends Exception{
 			private String name;	//추가필드
 			public void setName(String name){	//추가메서드
 				this.name=name;
 				}
 				public String getMessge(){
 					return "[재정의 메서드]"+super.getMessage()
 				}
 	
 	4) main()이나 다른 클래스의 메서드 호출
 		try{
 			if(조건){
 				throw new UserException();
 			}catch(UserException uesr){
 				System.out.prinln(uesr.getMessage());
 			}
 			
 
 */