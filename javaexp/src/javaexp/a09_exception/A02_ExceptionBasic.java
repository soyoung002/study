package javaexp.a09_exception;

public class A02_ExceptionBasic {
	public static void main(String[] args) {
	//1~100까지 출력하는 코딩을 하되
		//cnt 10일 때 1/0을 위와 같이 하며, 예외를 발생하여 
		//예외가 처리되는 코드를 위와같이 처리해보세요
		//A02_ExceptionBasic.java 만들어서
	try { 
	for(int cnt=1;cnt<=100;cnt++) {
		System.out.println(cnt+"번째!");
		if(cnt==10) {
			System.out.println(1/0);
			}
		}
	}catch(Exception e) {
		System.out.println("예외발생");
			System.out.println(e.getLocalizedMessage());
		}
		System.out.println("프로그램 종료");
		
		}
}
		
