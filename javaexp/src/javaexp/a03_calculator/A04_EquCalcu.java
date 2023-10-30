package javaexp.a03_calculator;

import java.util.*;
public class A04_EquCalcu {

	public static void main(String[] args) {
		// 두개이상의 조건이 모두 다 true일 대,
//		// 1) 숫자인 경우 연속된 범위에 있을 때,
//		//	청소년 요금제 범위(14~19세)
//		// 점수의 유효 범위(0~100) ... 0~100은 예시일뿐 정해진게 아님
//		// 2) 입력된 id와 pass가 다 맞을 때 인증 여부가 true 처리
//		//	String 객체 api에서 한번 더 언급(java)
//		
//		int inputAge = 18;
//		boolean isAdolPay = inputAge>=14 && inputAge<=19; //14이상이고 19이하
//		System.out.println("입력한 나이:"+inputAge);
//		System.out.println("청소년 요금제여부:"+isAdolPay);
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("# 로그인 # ");
//		System.out.print("아이디 입력:");
//		String id = sc.nextLine();
//		System.out.println("himan여부:"+(id=="himan")); 오류뜸 
//		System.out.println("himan여부:"+(id.equals("himan"))); //문자열을 비교할 떄
//		
//		// == : stack 영역의 데이터를 비교하는 것
//		// equals() : 문자열을 비교할 때 사용
//		System.out.print("패스워드입력:");
//		String pass = sc.nextLine();
//		System.out.println("입력한 아이디:"+id);
//		System.out.println("입력한 패스워드:"+pass);
//		//himan과 7777 입력시 로그인이 성공된다.
//		boolean isValid = id.equals("himan") && pass.equals("7777");
//		System.out.println("로그인 성공여부:"+isValid);
//		
////		System.out.print("패스워드 입력:");
//		String pass = sc.nextLine();
		
		// 정수의 유형성 범위
//		// ex) 점수를 입력해서 점수가 유효한지 여부를 출력하세요
//		//		유효범위(0~100)
//		System.out.println("# 정수의 유효성 범위 #");
//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수를 입력하세요:");
//		int score = Integer.parseInt(sc.nextLine());
//		boolean yn = score>=0 && score<=100;
//		System.out.println("입력된 점수:"+ score);
////		System.out.println("유효범위여부:"+ yn);
////		
//		# !(not) : 부정연산자
//		1. 논리식을 처리할 때, true이면 false, false이면 true를 처리하는 경우에 사용
//		2. 기본적인 비교연산식을 true <=> false로 처리
//			!(age>=18) ==> age<18 18세 미만
//		3. and, or가 포함된 논리연산자는 !을 통해서 드모르강법칙이 적용된 내용을 처리해준다.
//			조건1 && 조건2 ==> 조건1이 true이고 조건2가 true일 때
//			!(조건1 && 조건2) ==> 드모르강법칙에 의해 !조건 1 || !조건2 로 처리하는 경우이다.
//			ex) himan, 7777이 인증조건이라면 로그인 되지 않을 조건은 himan이지 않거나 7777이 아닌 경우를 말한다.	
//				age>=65 || age<3 : 무료인 조건
//				!(age>=65 || age<3) : 유료인 조건
//				age<65 && age>=3 : 유료
//		
//		
//		int pt = 70;
//		boolean isPass = pt>=70;
//		System.out.println("합격여부:"+isPass);
//		System.out.println("합격여부:"+!isPass);
//		int age = 20;
//		boolean isFree = age>=65 || age<3;
//		System.out.println("무료여부:"+isFree);
//		System.out.println("유료여부:"+!isFree);
//		
		
		// 1~10까지의 임의의 수를 출력하고
		// 점수%2==0 홀수, 점수%3==0
//		1. 홀수이면서 3의 배수인 경우와 
//		2. 짝수이거나 3의 배수가 아닌 경우를 !(not)연산자를 이용해서 출력하세요.
		System.out.println("# 홀/짝 #");
		int num = (int)(Math.random()*10+1); //랜덤 숫자 형성
		System.out.println("임의의 수:"+num); 
		boolean isOdd3Dbl = num%2==1&&num%3==0;
		System.out.println("홀수이면서 3의 배수:"+isOdd3Dbl);
		System.out.println("홀수이면서 2의 배수:"+!isOdd3Dbl);
		
		
		
	}
	

}
