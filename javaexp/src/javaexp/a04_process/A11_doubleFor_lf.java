package javaexp.a04_process;

import java.util.Scanner;

public class A11_doubleFor_lf {

	public static void main(String[] args) {
//		# 중첩if문
//		1. if문 안에 if문을 처리하는 것을 말한다.
//		2. 중첩 if 구문의 경우 &&연산으로 처리 할 수 있다.
		
//		ex)나이와 성별을 입력 받아서 4가지 조건으로 중첩문을 사용하라
		int age = 25;
		String gender ="남";
//		if(age>=18) {							
//			System.out.println("성인입니다.");
//			// if(age>=18 && gender.equals("남"))
//			if(gender.equals("남")) {
//				System.out.println("신사입니다.");
//			}else {
//				System.out.println("숙녀입니다.");
//			}
//		}else {
//			System.out.println("미성년자입니다.");
//			if(gender.equals("남")){
//				System.out.println("소년입니다.");
//			}else{
//				System.out.println("소녀입니다.");
//			}
//		}
//		
//		ex1) 주말여부를 선언, 공휴일 여부를 선언
//			주말이면서 공휴일이 아닌 경우 ==> 휴일
//			주말이면서 공휴일인 경우 ==> 대체휴일
//			그 외는 평일..
//		boolean isWeekend = true;	//주말여부
//		boolean isHoliday = false;	//공휴일여부
//		
//		if(isWeekend) {			//주말.. isWeekend==true로 표시 가능.. 위의 boolean에 포함 되있으므로 생략 가능							
//			if(isHoliday) {								//주말인데 휴일
//				System.out.println("대체휴일 입니다");
//			}else{										//주말 아님
//				System.out.println("휴일입니다");
//			}
//		}else {											//주말아님
//			System.out.println("평일 입니다.");
//			}
			
//		ex) 영화 입장료가 15000일 때,
//			성별과 나이를 입력 받아,
//			여성 25세 이상일 경우 10% 할인, 남성 25세 미만일 경우 5% 할인 후 최종 금액 출력
		Scanner sc = new Scanner(System.in);
		int pay = 15000; //입장료 
		double dis = 0.0; //할인율 
		age = 25;  //위에 이미 선언되있어서 값만 바꿔주기위해 int생략
		gender = "남"; //이하 동일 String 
		
		System.out.println("성별을 입력하세요.");
		String a = sc.nextLine();	
		
		System.out.println("나이를 입력하세요.");
		age = sc.nextInt(); //문자열 숫자를 숫자로 바꿔주는것
		
//		성별 및 나이 입력...
		if(gender.equals("남")) {
//		equals==>두개의 객체가 같은지 비교해주는 변수
			if(age<25) {
				dis=0.05;
			}
			
		}else if(gender.equals("여")) {
			if(age>=25) {
				dis = 0.1;
			}
			
		}
		
		//위의 중첩 if를 다른 방식으로 나타낸 것
		//if(gender.equals("남")&&age<25) dis=0.05;
		//if(gender.equals("여")&&age>=25) dis=0.1;
		
		int result = pay -(int)(pay*dis);
		System.out.println("할인율:"+(int)(dis*100)+"%");
		System.out.println("최종금액:"+result+"원");
		
		
		
//		if(age>=25) {
//			String W = sc.nextLine();
//			System.out.println();
//		}
//		
//		
		
		
		
		
//		
//		# 중첩for문
//		1. for문 안에 for문이 중첩적으로 사용되는 것을 말한다.
		

	}

}
