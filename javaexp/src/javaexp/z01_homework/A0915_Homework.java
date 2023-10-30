package javaexp.z01_homework;

import java.util.*;

public class A0915_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 ## 문제 1 두 수 비교하기**(3항연산자활용) 
		 두 숫자를 입력받아 크거나 같은 수를 출력하십시오. 
		 */
		//System.out.println("두 수 비교하기");
		
		
		/*
		 ### 문제 2 최대값 찾기**
		 임의의 세 수를 변수에 할당하여 최대값을 출력하십시오. */
//		int num1 = 3;
//		int num2 = 6;
//		int num3 = 10;
//		System.out.println("최대값 찾기");
//		int num = 
				 
		 //문제 3 등급 판별하기** 점수를 입력받아 등급을 출력하십시오. 
		System.out.print("문제3)0~100점 점수 등급 \n점수:"); //추가로 할수있는거 텍스트 추가\t으로 점수별 등급 설명
		Scanner sc = new Scanner(System.in);
		
		int score = Integer.parseInt(sc.nextLine()); 
		if(score>=100) {
			System.out.println("1등급 입니다");
		}else if(score>=80){
			System.out.println("2등급 입니다");
		}else if(score>=60) {
			System.out.println("3등급 입니다");
		}else if(score>=40) {
			System.out.println("4등급 입니다");
		}else if(score>=20) {
			System.out.println("5등급 입니다");
		}else {
			System.out.println("6등급 입니다");
		}
		
		/* 
		 * ### 문제4 도시의 온도가 20도를 넘으면 아이스크림을 먹으러 갑니다. 
		 * 그렇지 않으면 핫초코를 마십니다. 온도가 20도일 때는 뭐를 해야할지 선택하세요. 
		 * 온도를 `int temperature`로 가정하고, 뭐를 할지를 삼항 연산자를 이용하여 결정하세요. 
		 */ 
		int temperature = 20;
		System.out.print("문제4)온도가 "+temperature+"이므로,");
		if(temperature>=20) {
			System.out.println("아이스크림을 먹습니다.");
		}else {
			System.out.println("핫초코를 마십니다.");
		}
		
		 /* ### 문제 5 어떤 학생의 수학 점수는 85점, 과학 점수는 90점입니다. 
		 * 이 학생의 수학 점수가 80점 이상이고 과학 점수가 85점 이상이면 '합격'이라는
		 * 메시지를 출력하고, 그렇지 않으면 '불합격'이라는 메시지를 출력하세요. 
		 * 점수는 `int mathScore = 85, 
		 * scienceScor= 90;`로 가정합니다. */
		System.out.print("문제5)합격 여부:");
		int mathScore = 85;
		int scienceScore = 90;
		boolean isScore = mathScore>=80&&scienceScore>=85;
		if(isScore) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		 /* ### 문제 6 두 숫자 `a`와 `b`가 있습니다. 두 숫자의 평균이 50 이상이면 "평균 이상", 그렇지
		 * 않으면 "평균 미만"이라는 메시지를 출력하세요. 숫자는 `int a = 40, b = 60;`으로 가정합니다. */
		int a = 40;
		int b = 60;
		int c = (a+b)/2;
		System.out.print("문제6)두 숫자의 평균:");
		if(c>=50) {
			System.out.println("평균 이상");
		}else {
			System.out.println("평균 미만");
		}
		
		 /* ### 문제7(3항연산자활용) 변수 `hoursWorked`가 임의로 주어지고, 40시간을 초과하면 "과로하세요", 그렇지 않으면
		 * "정상 근무 시간입니다"라는 메시지를 출력하세요. 
		 * 
		 * 
		 * ### 문제 8 변수 `day`에 요일을 입력하고 "일요일"나 "토요일"이면
		 * "주말입니다", 그렇지 않으면 "평일입니다"라는 메시지를 출력하세요. 
		 */ 
////		int day;
////		 System.out.print("해당 요일은" + day);
////		 switch(day) {
////		 case "토요일" :
////		 case "일요일" :
////		 		+ System.out.println(); 
//		 }
		 
		 
		 /* 
		 * 
		 * ### 문제 9 변수 `height`의 값이 150cm 미만이면
		 * "놀이기구를 이용할 수 없습니다", 그렇지 않으면 "놀이기구를 이용하세요"라는 메시지를 출력하세요. 물론이죠! `if`와 `if-else`
		 * 문을 활용한 재미있는 자바 연습문제와 정답을 제공하겠습니다. 
		 * 
		 * 
		 * ### 문제 10: 기본 요금 계산기 요일별로 다른 교통비 요금을 계산하는
		 * 프로그램을 작성하세요. 월요일부터 금요일까지는 1200원, 주말(토요일, 일요일)은 800원입니다. ```java String
		 * dayOfWeek = "토요일"; // 사용자로부터 입력 받은 요일 int fare; ``` 
		 * 
		 * 
		 * ### 문제 11: 영화 추천 프로그램
		 * 사용자의 연령에 따라 영화 장르를 추천해주는 프로그램을 작성하세요. 
		 * 13세 미만은 "애니메이션", 13세 이상 19세 이하는
		 * "로맨틱 코미디", 20세 이상은 "액션" 장르를 추천합니다. 
		 * ```java int age = 25; // 사용자로부터 입력 받은 나이
		 * String movieRecommendation; ``` 
		 * 
		 * ### 문제 12: 계절 확인 프로그램 달을 입력 받아 
		 * 해당 계절을 출력하는 프로그램을 작성하세요. 
		 * 3~5월은 봄, 6~8월은 여름, 9~11월은 가을, 12~2월은 겨울입니다. 
		 * ```java int month =
		 * 10; // 사용자로부터 입력 받은 월 String season; ```
		 * 
		 */
		
		
		 
		 
	}
}
