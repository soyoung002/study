package javaexp.z01_homework;

public class A0922 {

public static void main(String[] args) {
		
//[1단계:코드] 1. 변수명과 타입을 적절하게 선언하여 아래와 같이 선언하고 출력하세요
//		  - 이름, 나이, 키  
//		  - 좋아하는 음악명, 발매연도
//		  - 지출금액 목록,지출 비용, 합산
		System.out.println("[1-1] 변수명과 변수타입");
		String name = "홍길동";
		int age = 20;
		double cm = 165.5;
/////////////////////////////////////////////////////////////		
		String music = "라일락";
		int year = 2018;
		System.out.println("이름:"+name+"\n나이:"+age+"\n키:"+cm);
		System.out.println("좋아하는 음악명:"+music+"\n발매연도:"+year+"년");

////////////////////////////////////////////////////////////		
		String[] list = {"강아지간식","도시락","안경"};	//배열 사용
		int[] buy = {1000,2000,3000};
		int tot=0;	//처음 값을 주는것 : 초기화..tot은 초기화 값 0으로 줬음
	
//		* for(조건){조건에따라 반복할 수행문} 
		for(int i=0; i<list.length; i++) { //length 배열의 크기나 수를 세주는것
			tot+=buy[i];
			System.out.print("지출목록:"+buy[i]+"원"+"\t지출비용:"+list[i]+"\n");
//			System.out.println(tot); => for는 중괄호{} 안에서까지만 적용되므로 
//										{}에 기입시 지출목록 지출비용 한번씩 나올때마다 합계가 반복되서 나옴
//										ex) 강아지간식 1000 6000, 도시락 2000 6000...
		}System.out.println("합계:"+tot+"원");
		
//[1단계:개념] 2. 기본 출력형식과 특수문자에 대하여 예제를 통해 기술하세요
		System.out.println("\n[1-2] 변수명과 변수타입");
//		기본 출력형식
		System.out.println("1-2.기본출력 형식입니다.");
//		특수문자 출력형식 : \n을 통해 한 출력문에 줄바꿈과 \t를 통한 텝간격 띄우기
		System.out.println("1-2.특수문자를\n쓴\t출력형식");
		
//[1단계:개념] 3. 변수명의 선언 규칙을 예제를 통하여 기술하세요.
		System.out.println("\n[1-3] 예제문제 없음\n");
//		사용 가능
		int a=0;	//선언과 동시에 할당하고 초기화
		int A=1;	//영어는 소문자, 대문자 모두 가능하며
		String 가;	//한글 또한 가능하다	==> 문자열로 시작
		int 나;		//변수의 타입 상관없이 "변수명"은 모두 가능하며
//		int 나=가;	//단, int는 정수형 타입이기 때문에 변수명은 문자열 상관없으나 
//					//할당시에는 int에 맞는 값을 줘야함.
		int 다=1;	//ex
//		int 2;		//또한, 숫자로는 시작 할 수 없으며
		int a1;		//숫자를 사용할시엔 문자열을 먼저 사용하고 쓸 수 있다
		int _$;		//특수문자는 _와 $만 가능하다.
		int $1;		//특수문자는 숫자와 다르게 맨앞에서도 쓸 수 있다
//		int @;		//그 외, 특수문자는 오류
		
//[1단계:개념] 4. 기본 데이터 유형을 나열하고, 해당 데이터를 할당하여 출력하는 예제를 만드세요
		System.out.println("[1-4] 기본데이터"); //1byte=8bit
//		* 정수형 
		byte byte1 = 127;	//byte 범위 -128~127 (128까지이고 0포함이라 127임) 1byte=8bit
		System.out.println(byte1);
		
		short short1 = 32767;	//4byte=16bit	-32768~32767
		
		int int1 = 2147483647;	//8byte=32bit	대략 21억..-2147483647~2147483647
		System.out.println(int1);
		
		long long1 = 100000000000000000L;	//16byte=64bit
		System.out.println(long1);	//단 뒤에 L을 붙여줘야함. 약922경
//		*실수형
		double double1 = 1.5;	//double은 d생략 가능=>1.5d;	16byte=64bit
		float float1 = 1.0f;	//float는 f를 꼭 붙여줘야함..대소문자 모두 가능
//		*논리형
		boolean true1 = true;	//참
		boolean false1 = false;	//거짓
		System.out.println(true1);
		System.out.println(false1);
//		*문자형 .. 문자열 String과 다른것임
		char char1 = '문'; 		//한글자만 가능
		char char2 = 'a';		//대소문자 상관 없음
//		char char1 = '문자형입니당~' //이런 경우 문자형(또는 문자)이 아닌 
		String char3 = "문자형입니당~";	//문자열 String()=""; 처리 해야함.
		
//[1단계:개념] 5. 형변환이란 무엇인가 예제를 통해서 기술하세요.
//		서로 다른 변수타입을 변환시켜 사용..
		int int01 = 10;	//정수
		String str = "10";	//문자열
		double db = 1.55;	//실수
//		1. 문자->정수
		int strInt=Integer.parseInt(str);	//"10" 문자열 -> 10 정수 변환 
		System.out.println(strInt+10);		//10 + 10 = 20
//		2. 정수->문자
		String intStr=String.valueOf(int01);//10 정수형 -> "10" 문자열 변환
		System.out.println(intStr+10);		//"10"+"10" = 1010..."10""10"
//		3. 실수->정수
		int doubleInt = (int)db;
		System.out.println(doubleInt);		//강제형변환
		
				//[1단계:코드] 6. 21억, 15억 데이터를 int에 할당하고, 합산결과를 변수를 선언하여 할당 출력하세요
				//[1단계:개념] 7. char유형과 code값의 관계에 대하여 기술하세요.
				//[1단계:코드] 8. 알파벳의 코드값 범위와 문자 0부터 9까지 범위의 코드값 범위를 확인하고 출력하세요.
				//[1단계:개념] 9. 연산자, 피연산자, 연산식을 예제로 만들어, 해당 내용을 구분하여 설명하세요
				//[1단계:개념] 10. 산술연산자의 종류와 그 특징을 예제를 통하여 설명하세요.
				//[1단계:코드] 11. 500cc의 오렌지쥬스를 3잔에 나누어 할당할려고 한다. 소숫점 이하가 처리된 경우와
//				        소숫점 이하가 처리되지 않는 경우를 나누어 코딩하세요
				//[1단계:개념] 12. 증감연산식의 앞에 ++, 뒤에 ++의 차이점을 예제를 통하여 기술하세요.
				//[1단계:개념] 13. 증감대입연산자의 종류를 기술하고 예제를 통하여 설명하세요. 
				//[2단계:코드] 14.구매하는 김밥의 갯수를 선언하고, 1씩 증가하여 김밥의 단가(2500) 아래와 같이 출력
//							김밥 1개 구매  2500 
//							김밥 2개 구매  5000
//							김밥 3개 구매  7500
				//[1단계:개념] 15. 문자열의 비교연산자 사용에서 ==, equals()의 차이점을 기술하세요.
				//[1단계:개념] 16. main()의 args[]의 처리 내용방법 자바 코드를 통한 처리와 함께 기술하세요. 
				//[2단계:코드] 17. args로 물건명1 가격1 갯수1 물건명2 가격2 갯수2로 입력받아 계산서(전체 총계포함)를 출력하세요.
				//[1단계:개념] 18. Scanner의 처리방법을 간단한 예제와 함께 기술하세요.
				//[1단계:코드] 19. Scanner객체를 활용하여 타율계산방법을 확인(검색)하고, 선수명, 타석수, 안타수를 입력 받아 해당 타자의 타율을 출력하세요.
				//[1단계:개념] 20. 비교연산자의 종류를 예시와 함께 기술하세요.
				//[1단계:코드] 21. Scanner를 활용하여 나이를 입력 받아 성인(18이상)여부를 출력하세요 
				//[1단계:개념] 22. 논리연산자의 종류를 예제와 함께 기술하세요.
				//[1단계:개념] 23. for문의 기본 구성요소를 기본 예제를 통하여 특징을 기술하세요.
				//[1단계:코드] 24. for(기본) 기본 형식을 활용해서 아래 데이터를 출력하세요
//					              1) 200~300 10단위 출력, 2) 1000~950 3단위 감소, 3) 100~0까지 2로 나눈값
				//[1단계:개념] 25. for문의 지역변수와 전역변수의 개념을 예제를 통해서 설명하세요
				//[1단계:개념] 26. for문의 전역변수를 활용한 출력형태를 예제를 통해 설명하세요              
				//[1단계:코드] 27. 입력할 과일의 3개의  과일명과 과일가격을 입력받아, 아래 형식으로 출력하되 총비용을 출력 하세요
//					                no 과일명  가격
//					                 1 사과    3000            
//					                 2 바나나   4000           
//					                 3 딸기    12000
//					                   총계    19000            
				//[1단계:코드] 28. for(지역/전역) - 곰돌이가 하루 빵을 2개씩 증가해서 먹어(첫째날 2개, 둘째날 4개, 셋째날 6개 ...) 총 10일 동안 먹은 빵의 갯수를 누적하여 아래와 같이 출력하세요
//						            # 출력 형식
//						            날짜  갯수 누적
//						            1일차 2개  2개
//						            2일차 4개  6개
//						            3일차 6개 12개
				//[1단계:코드] 29. for을 이용하여 100까지 4의 배수만 # 표시 및 합산,그 외는 숫자 표시, 하단에 4의 배수 합산표시.
				//[2단계:코드] 30. for을 이용하여 3,6,9게임을 출력하세요(20까지)- 마지막에 3이 포함될 때 처리
				//[1단계:개념] 31. 2중 for문을 기본형식을 예제를 통하여 설명하세요.
				//[1단계:코드] 32. 아래 내용을 2중 for문을 활용하여
//					1) 2X2(행X열)로 ♥를 표시 2) 3X2(행X열)로 ★표시 3) 입력한 행/열로 입력한 기호표시
				//[1단계:개념] 33. while문의 기본 형식을 예제를 통해 설명하세요.
				//[1단계:개념] 34. while문을 이용하여 100~90까지 출력하고, 합산결과를 출력하세요.
				//[1단계:코드] 35. while문을 이용해서 학생의 점수를 등록하고 총점과 평균을 출력하되, 등록을 종료시 -1를 입력해서 처리하세요.
				//[1단계:개념] 36. 반복문에서 break와 continue의 차이점을 기본 예제를 통하여 기술하세요
				//[1단계:개념] 37. 자바의 주요 메모리 2개의 유형에 따른 활용 내용을 기술하세요.
				//[1단계:개념] 38. 배열의 구성요소를 예제를 통해서 기술하세요
				//[1단계:개념] 39. 배열의 선언, 할당, 사용 형식을 여러가지 데이터 유형에 따라 구분하여 출력하세요.
				//[1단계:개념] 40. 배열의 전체 데이터를 처리할 때 for문을 사용한다. 배열의 속성에 따라서 어떻게 활용되는지 예제를 통해 기술하세요.
				//[1단계:코드] 41. 배열로 점수를 3개를 초기화하여, 반복문과 Scanner를 통해서 데이터를 입력되게 하고, 총계과 평균을 출력하세요.
				//[1단계:개념] 42. 클래스와 객체의 차이점을 예제를 통하여 기술하세요
				//[1단계:개념] 43. 필드의 특성을 예제를 통해 기술하세요
				//[1단계:개념] 44. 생성자와 일반 메서드의 기능적 차이점을 기술하세요
				//[1단계:개념] 45. 메서드의 여러가지 처리형태(입력,로직,리턴,복합형태)를 기술하고 간단한 예제로 구현하세요
				//[1단계:개념] 46. 생성자로 데이터를 사용할 때와 메서드를 데이터를 사용할 때, 어떤 차이점이 있는지 예제로 기술하세요.
				//[1단계:확인] 47. 메서드(입력+로직) 선언 예제
				//1) 3개에 입력값 중에 가장 큰수 출력
				//2) 1개의 입력값으로 70이상과 미만으로 합격/불합격 출력
				//3) 배열로 파는 물건들을 3개의 문자열 배열로 선언하고, 입력으로 물건명으로 파는 물건 여부를 출력 표시.
				//[1단계:확인] 48. 메서드(입력+로직+리턴) 선언  예제
				//1) 놀이공원 클래스에서 나이를 입력해서 무료/유료 구분해서 리턴 메서드(5세미만 65이상 무료)
				//2) 놀이공원 클래스에서 나이에 따라 입장료 10%, 15%, 20% 처리(나이구간 임의 적용)
				//3) 배열로 등록된 회원 선언하고, 입력된 회원명에 따라 등록여부를 리턴하여 처리하세요.
				//[1단계:확인] 49. 클래스(필드,생성자,메서드) 선언  예제
				//1) 버스클래스로 필드(버스번호,탑승자수) 버스번호 생성자 선언, 탑승자인원수 누적메서드 리턴 현재 총탑승자수
				// 탑승메서드(매개변수 탑승자인원, 리턴 현재 총탑승자수) 
//					버스번호 @@번 @@명이 탑승했습니다. 

//						**[1단계:코드] 1.** 
//						```java
//						public class PersonalInfo {
//						    public static void main(String[] args) {
//						        String name = "Kim";
//						        int age = 25;
//						        double height = 175.5;
//						        
//						        String favoriteMusic = "Shape of You";
//						        int releaseYear = 2017;
//						        
//						        String[] expenseList = {"Lunch", "Taxi", "Coffee"};
//						        double[] costs = {10.5, 15, 3.5};
//						        double totalExpense = costs[0] + costs[1] + costs[2];
//						        
//						        System.out.println("Name: " + name + ", Age: " + age + ", Height: " + height);
//						        System.out.println("Favorite Music: " + favoriteMusic + ", Released in: " + releaseYear);
//						        System.out.println("Total Expense for Today: " + totalExpense);
//						    }
//						}
//						```
				//
//						**[1단계:개념] 2.** 
//						기본 출력 형식은 `System.out.println()`를 사용하며, 문자열 내에서 특수 문자를 표시하기 위해 역슬래시 `\`를 사용합니다. 예를 들어, 줄바꿈을 위해 `\n`, 탭을 위해 `\t`, 따옴표를 출력하기 위해 `\"` 등을 사용합니다.
				//
//						**[1단계:개념] 3.** 
//						변수명의 선언 규칙은 다음과 같습니다:
//						- 변수명은 숫자로 시작할 수 없습니다.
//						- 변수명은 알파벳, 숫자, 그리고 밑줄(_)로 구성됩니다.
//						- Java는 대소문자를 구별하므로 `height`와 `Height`는 다른 변수입니다.
//						- 예약어는 변수명으로 사용할 수 없습니다. (예: `int`, `for`, `if` 등)
				//
//						**[1단계:개념] 4.** 
//						기본 데이터 유형:
//						```java
//						int number = 10;
//						double decimal = 10.5;
//						char letter = 'A';
//						boolean flag = true;
				//
//						System.out.println(number);
//						System.out.println(decimal);
//						System.out.println(letter);
//						System.out.println(flag);
//						```
				//
//						**[1단계:개념] 5.** 
//						형변환은 한 데이터 유형에서 다른 데이터 유형으로 값을 변환하는 과정입니다. 
//						```java
//						double myDouble = 2.5;
//						int myInt = (int) myDouble;  // 형변환. myInt는 2가 됩니다.
//						```
				//
//						**[1단계:코드] 6.** 
//						```java
//						long num1 = 2100000000L;
//						long num2 = 1500000000L;
//						long sum = num1 + num2;
//						System.out.println("Total: " + sum);
//						```
				//
//						**[1단계:개념] 7.** 
//						`char` 유형은 단일 문자를 저장합니다. 각 문자에는 특정한 정수 값이 있으며, 이를 '코드 값' 또는 '유니코드'라고 합니다.
				//
//						**[1단계:코드] 8.** 
//						```java
//						System.out.println((int) 'A' + " to " + (int) 'Z'); 
//						System.out.println((int) '0' + " to " + (int) '9'); 
//						```
				//
//						**[1단계:개념] 9.** 
//						연산자는 값(피연산자)에 대한 작업을 수행하는 기호입니다. `5 + 3`에서 `+`는 연산자이며, `5`와 `3`은 피연산자입니다. 전체 `5 + 3`은 연산식입니다.
				//
//						**[1단계:개념] 10.** 
//						산술 연산자는 수학적 연산을 수행하는 연산자입니다. 예: `+`, `-`, `*`, `/`, `%` (나머지 연산자). `%` 연산자는 나눗셈 후의 나머지를 반환합니다. 예를 들어, `7 % 3`은 1을 반환합니다.		
//						**[1단계:코드] 11.** 
//						```java
//						public class JuiceDivision {
//						    public static void main(String[] args) {
//						        double totalJuice = 500;
//						        double dividedJuice = totalJuice / 3;
//						        int dividedJuiceWithoutDecimal = (int) dividedJuice;
				//
//						        System.out.println("Divided Juice with Decimal: " + dividedJuice + "cc");
//						        System.out.println("Divided Juice without Decimal: " + dividedJuiceWithoutDecimal + "cc");
//						    }
//						}
//						```
				//
//						**[1단계:개념] 12.** 
//						`++`가 앞에 올 때는 전위 증가로, 해당 변수의 값을 증가시킨 후 연산이 이루어집니다.
//						`++`가 뒤에 올 때는 후위 증가로, 연산이 이루어진 후 해당 변수의 값을 증가시킵니다.
				//
//						```java
//						int x = 5;
//						System.out.println(++x);  // 6
//						System.out.println(x++);  // 6 (but x becomes 7 afterwards)
//						```
				//
//						**[1단계:개념] 13.** 
//						증감대입연산자는 변수의 값을 증가하거나 감소시키는 연산자입니다. 예: `+=`, `-=`, `*=`, `/=`, `%=`.
				//
//						```java
//						int y = 10;
//						y += 5;  // y becomes 15
//						```
				//
//						**[2단계:코드] 14.** 
//						```java
//						public class GimbapCost {
//						    public static void main(String[] args) {
//						        int gimbapPrice = 2500;
//						        for (int i = 1; i <= 3; i++) {
//						            System.out.println("김밥 " + i + "개 구매 " + (gimbapPrice * i));
//						        }
//						    }
//						}
//						```
				//
//						**[1단계:개념] 15.** 
//						`==`는 메모리의 주소를 비교합니다. `equals()`는 문자열의 내용을 비교합니다. 따라서 문자열의 내용을 확인하려면 `equals()`를 사용해야 합니다.
				//
//						**[1단계:개념] 16.** 
//						`main()`의 `args[]`는 프로그램 시작 시 입력된 명령행 인수를 문자열 배열로 받습니다.
				//
//						```java
//						public class ArgsExample {
//						    public static void main(String[] args) {
//						        for (String arg : args) {
//						            System.out.println(arg);
//						        }
//						    }
//						}
//						```
				//
//						**[2단계:코드] 17.** 
//						```java
//						public class Invoice {
//						    public static void main(String[] args) {
//						        String itemName1 = args[0];
//						        int price1 = Integer.parseInt(args[1]);
//						        int quantity1 = Integer.parseInt(args[2]);
				//
//						        String itemName2 = args[3];
//						        int price2 = Integer.parseInt(args[4]);
//						        int quantity2 = Integer.parseInt(args[5]);
				//
//						        int total1 = price1 * quantity1;
//						        int total2 = price2 * quantity2;
//						        int grandTotal = total1 + total2;
				//
//						        System.out.println(itemName1 + " x " + quantity1 + " = " + total1);
//						        System.out.println(itemName2 + " x " + quantity2 + " = " + total2);
//						        System.out.println("Total = " + grandTotal);
//						    }
//						}
//						```
				//
//						**[1단계:개념] 18.** 
//						`Scanner` 클래스는 입력을 위한 클래스로, 사용자의 입력을 받아들입니다.
				//
//						```java
//						import java.util.Scanner;
				//
//						public class ScannerExample {
//						    public static void main(String[] args) {
//						        Scanner sc = new Scanner(System.in);
//						        System.out.print("Enter your name: ");
//						        String name = sc.nextLine();
//						        System.out.println("Hello, " + name + "!");
//						    }
//						}
//						```
				//
//						**[1단계:코드] 19.**
//						```java
//						import java.util.Scanner;
				//
//						public class BattingAverageCalculator {
//						    public static void main(String[] args) {
//						        Scanner sc = new Scanner(System.in);
//						        
//						        System.out.print("선수명: ");
//						        String playerName = sc.nextLine();
				//
//						        System.out.print("타석수: ");
//						        int atBats = sc.nextInt();
				//
//						        System.out.print("안타수: ");
//						        int hits = sc.nextInt();
				//
//						        double battingAverage = (double) hits / atBats;
//						        System.out.println(playerName + "의 타
				//
//						율은 " + battingAverage + "입니다.");
//						    }
//						}
//						```
				//
//						**[1단계:개념] 20.** 
//						비교연산자는 두 값을 비교하는 연산자입니다. 종류: `==`, `!=`, `<`, `<=`, `>`, `>=`. 예) `if (a > b) {...}`
				//
//						**[1단계:코드] 21.**
//						```java
//						import java.util.Scanner;
				//
//						public class AdultChecker {
//						    public static void main(String[] args) {
//						        Scanner sc = new Scanner(System.in);
//						        
//						        System.out.print("나이를 입력하세요: ");
//						        int age = sc.nextInt();
//						        if (age >= 18) {
//						            System.out.println("성인입니다.");
//						        } else {
//						            System.out.println("성인이 아닙니다.");
//						        }
//						    }
//						}
//						```
				//
//						**[1단계:개념] 22.** 
//						논리 연산자는 여러 조건을 비교하는 연산자입니다. 종류: `&&`(AND), `||`(OR), `!`(NOT).
				//
//						```java
//						if (x > 10 && y < 5) {...}
//						```
				//
//						**[1단계:개념] 23.** 
//						for문의 기본 구성 요소는 (초기식; 조건식; 증감식)입니다. 
//						```java
//						for (int i = 0; i < 10; i++) {
//						    System.out.println(i);
//						}
//						```
				//
//						**[1단계:코드] 24.**
//						```java
//						// 1) 200~300 10단위 출력
//						for (int i = 200; i <= 300; i += 10) {
//						    System.out.println(i);
//						}
				//
//						// 2) 1000~950 3단위 감소
//						for (int i = 1000; i >= 950; i -= 3) {
//						    System.out.println(i);
//						}
				//
//						// 3) 100~0까지 2로 나눈값
//						for (int i = 100; i >= 0; i--) {
//						    System.out.println(i / 2.0);
//						}
//						```
				//
//						**[1단계:개념] 25.** 
//						지역변수는 특정 영역(블록) 내에서만 사용되는 변수이며, 그 영역을 벗어나면 사용할 수 없습니다. for문 내의 변수 i는 지역변수입니다. 전역변수는 클래스 레벨에서 선언되는 변수로 클래스 내의 모든 메서드에서 접근 가능합니다.
				//
//						**[1단계:개념] 26.** 
//						전역변수는 for문 안과 밖에서 모두 접근할 수 있으므로 for문에서 전역변수의 값을 변경하면, for문 이후에도 그 변경된 값을 사용할 수 있습니다.
				//
//						**[1단계:코드] 27.**
//						```java
//						import java.util.Scanner;
				//
//						public class FruitPriceCalculator {
//						    public static void main(String[] args) {
//						        Scanner sc = new Scanner(System.in);
//						        int total = 0;
				//
//						        System.out.println("no 과일명  가격");
//						        for (int i = 1; i <= 3; i++) {
//						            System.out.print(i + " ");
//						            String fruitName = sc.next();
//						            int fruitPrice = sc.nextInt();
				//
//						            System.out.println(fruitName + "   " + fruitPrice);
//						            total += fruitPrice;
//						        }
				//
//						        System.out.println("총계    " + total);
//						    }
//						}
//						```
				//
//						**[1단계:코드] 28.**
//						```java
//						public class BreadCounter {
//						    public static void main(String[] args) {
//						        int totalBread = 0;
				//
//						        System.out.println("날짜  갯수 누적");
//						        for (int i = 1; i <= 10; i++) {
//						            int breadToday = i * 2;
//						            totalBread += breadToday;
				//
//						            System.out.println(i + "일차 " + breadToday + "개  " + totalBread + "개");
//						        }
//						    }
//						}
//						```
				//
//						**[1단계:코드] 29.**
//						```java
//						public class MultipleOfFour {
//						    public static void main(String[] args) {
//						        int sum = 0;
				//
//						        for (int i = 1; i <= 100; i++) {
//						            if (i % 4 == 0) {
//						                System.out.print("# ");
//						                sum += i;
//						            } else {
//						                System.out.print(i + " ");
//						            }
//						        }
				//
//						        System.out.println("\n4의 배수 합계: " + sum);
//						    }
//						}
//						```
				//
//						**[2단계:코드] 30.**
//						```java
//						public class ThreeSixNineGame {
//						    public static void main(String[] args) {
//						        for (int i = 1; i <= 20; i++) {
									//10 20 30 40 범위 제외
									//13 ==> 
									//i%10(3) ==> 3 ==> 0 
//						            if (i % 3 == 0 || Integer.toString(i).contains("3")) {
//						                System.out.println(i + " 짝!");
//						            } else {
//						                System.out.println(i);
//						            }
//						        }
//						    }
//						}
//						```
					
//						**[1단계:개념] 31.** 
//						2중 for문은 for문 안에 또 다른 for문이 있는 구조입니다. 이 구조를 사용하면 행과 열 형태의 반복 작업을 할 수 있습니다. 주로 행렬이나 2차원 배열을 다룰 때 사용됩니다.
				//
//						**[1단계:코드] 32.**
//						```java
//						// 1) 2X2(행X열)로 ♥를 표시
//						for (int i = 0; i < 2; i++) {
//						    for (int j = 0; j < 2; j++) {
//						        System.out.print("♥ ");
//						    }
//						    System.out.println();
//						}
				//
//						// 2) 3X2(행X열)로 ★표시
//						for (int i = 0; i < 3; i++) {
//						    for (int j = 0; j < 2; j++) {
//						        System.out.print("★ ");
//						    }
//						    System.out.println();
//						}
				//
//						// 3) 입력한 행/열로 입력한 기호표시
//						import java.util.Scanner;
//						Scanner scanner = new Scanner(System.in);
//						System.out.println("행을 입력하세요: ");
//						int rows = scanner.nextInt();
//						System.out.println("열을 입력하세요: ");
//						int cols = scanner.nextInt();
//						System.out.println("기호를 입력하세요: ");
//						String symbol = scanner.next();
				//
//						for (int i = 0; i < rows; i++) {
//						    for (int j = 0; j < cols; j++) {
//						        System.out.print(symbol + " ");
//						    }
//						    System.out.println();
//						}
//						```
				//
//						**[1단계:개념] 33.** 
//						while문은 조건식이 참인 경우 반복을 수행하는 반복문입니다. 
//						```java
//						while(조건식) {
//						    // 반복할 코드
//						}
//						```
				//
//						**[1단계:개념] 34.** 
//						while문을 사용하여 100부터 90까지 출력하는 코드는 아래와 같습니다.
//						```java
//						int num = 100;
//						int sum = 0;
//						while(num >= 90) {
//						    System.out.println(num);
//						    sum += num;
//						    num--;
//						}
//						System.out.println("합산 결과: " + sum);
//						```
				//
//						**[1단계:코드] 35.**
//						```java
//						import java.util.Scanner;
//						Scanner scanner = new Scanner(System.in);
				//
//						int total = 0;
//						int count = 0;
//						while(true) {
//						    System.out.println("학생의 점수를 입력하세요. (-1로 종료)");
//						    int score = scanner.nextInt();
//						    if(score == -1) break;
				//
//						    total += score;
//						    count++;
//						}
//						System.out.println("총점: " + total);
//						System.out.println("평균: " + (double)total/count);
//						```
				//
//						**[1단계:개념] 36.** 
//						`break`는 반복문을 완전히 종료하는 명령어입니다. 반면, `continue`는 현재 반복을 중단하고 다음 반복을 시작하는 명령어입니다.
//						```java
//						// break 예제
//						for(int i = 0; i < 10; i++) {
//						    if(i == 5) break;
//						    System.out.println(i);
//						}
				//
//						// continue 예제
//						for(int i = 0; i < 10; i++) {
//						    if(i % 2 == 0) continue;
//						    System.out.println(i);
//						}
//						```
				//
//						**[1단계:개념] 37.** 
//						자바의 주요 메모리 2가지 유형은 스택 메모리와 힙 메모리입니다.
//						- **스택 메모리:** 지역 변수와 메서드 호출 정보가 저장되는 영역입니다. 변수가 선언될 때 할당되고, 메서드가 종료될 때 해제됩니다.
//						- **힙 메모리:** new 연산자로 생성된 객체나 배열이 저장되는 영역입니다. 가비지 컬렉터에 의해 불필요한 객체가 자동으로 해제됩니다.
				//
//						**[1단계:개념] 38.** 
//						배열은 동일한 타입의 여러 변수를 하나의 이름으로 그룹화해서 관리하는 것입니다. 배열의 각 요소는 인덱스 번호로 참조됩니다.
				//
//						**[1단계:개념] 39.** 
//						배열은 선언, 할당, 사용의 세 단계로 활용됩니다.
//						```java
//						// 선언
//						int[] arr;
				//
//						// 할당
//						arr = new int[5];
				//
//						// 사용
//						arr[0] = 1;
//						```
				//
//						**[1단계:개념] 40.** 
//						배열의 전체 데이터를 처리할 때 for문을 사용하는 것이 일반적입니다. 배열의 length 속성을 활용하여 배열의 크기를 얻을 수 있습니다.
//						```java
//						int[] arr = {10, 20, 30, 40, 50};
//						for(int i = 0; i < arr.length; i++) {
//						    System.out.println(arr[i]);
//						}
//						```
				//
//						**[1단계:코드] 41.**
//						```java
//						import java.util.Scanner;
				//
//						int[] scores = new int[3];
//						Scanner scanner = new Scanner(System.in);
//						int total = 0;
				//
//						for(int i = 0; i < scores.length; i++) {
//						    System.out.println((i+1) + "번째 점수 입력: ");
//						    scores[i] = scanner.nextInt();
//						    total += scores[i];
//						}
//						System.out.println("총계: " + total);
//						System.out.println("평균: " + (double)total/scores.length);
//						```
				//
//						**[1단계:개념] 42.** 
//						클래스는 객체의 설계도 또는 템플릿으로서, 객체의 속성과 기능을 정의합니다. 객체는 클래스를 기반으로 메모리에 할당된 실체입니다.
//						예) `Car` 클래스가 있을 때, 실제로 메모리에 할당하여 사용하는 
//							`myCar`, `yourCar` 등은 객체입니다.
				//
//						**[1단계:개념] 43.** 
//						필드는 클래스의 속성 또는 상태를 나타내는 변수입니다. 클래스 내에서 선
				//
//						언되며, 해당 클래스의 객체들이 공통으로 가지는 속성을 나타냅니다.
//						예) `Car` 클래스에서 `color`, `speed` 등은 필드입니다.
				//
//						**[1단계:개념] 44.** 
//						생성자는 객체가 생성될 때 자동으로 호출되어 객체의 초기화를 담당하는 특별한 메서드입니다. 일반 메서드는 객체의 행위나 동작을 정의하며, 원하는 시점에 호출하여 사용할 수 있습니다.
				//
//						**[1단계:개념] 45.** 
//						- **입력:** 메서드에 전달되는 값을 받는 부분 (매개변수)
//						```java
//						void printName(String name) {
//						    System.out.println(name);
//						}
//						```
//						- **로직:** 메서드의 주요 기능을 담당하는 부분
//						```java
//						void calculateArea(int width, int height) {
//						    int area = width * height;
//						    System.out.println(area);
//						}
//						```
//						- **리턴:** 메서드가 처리한 결과를 호출한 곳으로 반환하는 부분
//						```java
//						int add(int a, int b) {
//						    return a + b;
//						}
//						```
//						- **복합형태:** 입력, 로직, 리턴을 모두 포함한 형태
//						```java
//						int multiply(int a, int b) {
//						    return a * b;
//						}
//						```
				//
//						**[1단계:개념] 46.** 
//						생성자는 객체가 생성될 때 한 번만 호출되며, 초기화 작업을 주로 담당합니다. 일반 메서드는 객체가 생성된 이후에 필요할 때마다 여러 번 호출될 수 있습니다. 
//						예) `Car` 클래스에 `Car()` 생성자와 `drive()` 메서드가 있을 때, 객체가 생성될 때 `Car()` 생성자가 호출되고, 필요에 따라 `drive()` 메서드를 여러 번 호출할 수 있습니다.
				//
//						**[1단계:확인] 47.**
//						```java
//						// 1) 3개에 입력값 중에 가장 큰수 출력
//						void printLargest(int a, int b, int c) {
//						    int largest = a;
//						    if(b > largest) largest = b;
//						    if(c > largest) largest = c;
//						    System.out.println("가장 큰 수: " + largest);
//						}
				//
//						// 2) 1개의 입력값으로 70이상과 미만으로 합격/불합격 출력
//						void checkPass(int score) {
//						    if(score >= 70) System.out.println("합격");
//						    else System.out.println("불합격");
//						}
				//
//						// 3) 배열로 파는 물건들을 3개의 문자열 배열로 선언하고, 입력으로 물건명으로 파는 물건 여부를 출력 표시.
//						String[] items = {"apple", "banana", "orange"};
//						void checkItem(String itemName) {
//						    for(String item : items) {
//						        if(item.equals(itemName)) {
//						            System.out.println(itemName + "은(는) 판매중입니다.");
//						            return;
//						        }
//						    }
//						    System.out.println(itemName + "은(는) 판매하지 않습니다.");
//						}
//						```
				//
//						**[1단계:확인] 48.**
//						```java
//						class AmusementPark {
//						    // 1) 놀이공원 클래스에서 나이를 입력해서 무료/유료 구분해서 리턴 메서드(5세미만 65이상 무료)
//						    String checkFreeOrPaid(int age) {
//						        if(age < 5 || age >= 65) return "무료";
//						        else return "유료";
//						    }
				//
//						    // 2) 놀이공원 클래스에서 나이에 따라 입장료 10%, 15%, 20% 처리(나이구간 임의 적용)
//						    double getDiscountedPrice(int age, double originalPrice) {
//						        if(age < 10) return originalPrice * 0.9;
//						        else if(age < 20) return originalPrice * 0.85;
//						        else return originalPrice * 0.8;
//						    }
				//
//						    // 3) 배열로 등록된 회원 선언하고, 입력된 회원명에 따라 등록여부를 리턴하여 처리하세요.
//						    String[] members = {"John", "Jane", "Doe"};
//						    boolean isMember(String name) {
//						        for(String member : members) {
//						            if(member.equals(name)) return true;
//						        }
//						        return false;
//						    }
//						}
//						```
				//
//						**[1단계:확인] 49.**
//						```java
//						class Bus {
//						    private int busNumber;
//						    private int passengers;
				//
//						    // 생성자
//						    public Bus(int busNumber) {
//						        this.busNumber = busNumber;
//						    }
				//
//						    // 탑승자 수 누적 메서드
//						    public int board(int count) {
//						        passengers += count;
//						        System.out.println("버스번호 " + busNumber + "번 " + count + "명이 탑승했습니다.");
//						        return passengers;
						    }
				//
//						    // 현재 총 탑승자 수 리턴 메서드
//						    public int getTotalPassengers() {
//						        return passengers;
//						    }
//						}

						
//					}

//				}

				// TODO Auto-generated method stub
//				[1단계:코드] 1. 변수명과 타입을 적절하게 선언하여 아래와 같이 선언하고 출력하세요
//				  - 이름, 나이, 키 
//				  - 좋아하는 음악명, 발매연도
//				  - 오늘 지출금액 목록과 비용, 합산
		//[1단계:개념] 2. 기본 출력형식과 특수문자에 대하여 예제를 통해 기술하세요
		//[1단계:개념] 3. 변수명의 선언 규칙을 예제를 통하여 기술하세요.
		//[1단계:개념] 4. 기본 데이터 유형을 나열하고, 해당 데이터를 할당하여 출력하는 예제를 만드세요
		//[1단계:개념] 5. 형변환이란 무엇인가 예제를 통해서 기술하세요.
		//[1단계:코드] 6. 21억, 15억 데이터를 int에 할당하고, 합산결과를 변수를 선언하여 할당 출력하세요
		//[1단계:개념] 7. char유형과 code값의 관계에 대하여 기술하세요.
		//[1단계:코드] 8. 알파벳의 코드값 범위와 문자 0부터 9까지 범위의 코드값 범위를 확인하고 출력하세요.
		//[1단계:개념] 9. 연산자, 피연산자, 연산식을 예제로 만들어, 해당 내용을 구분하여 설명하세요
		//[1단계:개념] 10. 산술연산자의 종류와 그 특징을 예제를 통하여 설명하세요.
		//[1단계:코드] 11. 500cc의 오렌지쥬스를 3잔에 나누어 할당할려고 한다. 소숫점 이하가 처리된 경우와
//		        소숫점 이하가 처리되지 않는 경우를 나누어 코딩하세요
		//[1단계:개념] 12. 증감연산식의 앞에 ++, 뒤에 ++의 차이점을 예제를 통하여 기술하세요.
		//[1단계:개념] 13. 증감대입연산자의 종류를 기술하고 예제를 통하여 설명하세요. 
		//[2단계:코드] 14.구매하는 김밥의 갯수를 선언하고, 1씩 증가하여 김밥의 단가(2500) 아래와 같이 출력
//					김밥 1개 구매  2500 
//					김밥 2개 구매  5000
//					김밥 3개 구매  7500
		//[1단계:개념] 15. 문자열의 비교연산자 사용에서 ==, equals()의 차이점을 기술하세요.
		//[1단계:개념] 16. main()의 args[]의 처리 내용방법 자바 코드를 통한 처리와 함께 기술하세요. 
		//[2단계:코드] 17. args로 물건명1 가격1 갯수1 물건명2 가격2 갯수2로 입력받아 계산서(전체 총계포함)를 출력하세요.
		//[1단계:개념] 18. Scanner의 처리방법을 간단한 예제와 함께 기술하세요.
		//[1단계:코드] 19. Scanner객체를 활용하여 타율계산방법을 확인(검색)하고, 선수명, 타석수, 안타수를 입력 받아 해당 타자의 타율을 출력하세요.
		//[1단계:개념] 20. 비교연산자의 종류를 예시와 함께 기술하세요.
		//[1단계:코드] 21. Scanner를 활용하여 나이를 입력 받아 성인(18이상)여부를 출력하세요 
		//[1단계:개념] 22. 논리연산자의 종류를 예제와 함께 기술하세요.
		//[1단계:개념] 23. for문의 기본 구성요소를 기본 예제를 통하여 특징을 기술하세요.
		//[1단계:코드] 24. for(기본) 기본 형식을 활용해서 아래 데이터를 출력하세요
//			              1) 200~300 10단위 출력, 2) 1000~950 3단위 감소, 3) 100~0까지 2로 나눈값
		//[1단계:개념] 25. for문의 지역변수와 전역변수의 개념을 예제를 통해서 설명하세요
		//[1단계:개념] 26. for문의 전역변수를 활용한 출력형태를 예제를 통해 설명하세요              
		//[1단계:코드] 27. 입력할 과일의 3개의  과일명과 과일가격을 입력받아, 아래 형식으로 출력하되 총비용을 출력 하세요
//			                no 과일명  가격
//			                 1 사과    3000            
//			                 2 바나나   4000           
//			                 3 딸기    12000
//			                   총계    19000            
		//[1단계:코드] 28. for(지역/전역) - 곰돌이가 하루 빵을 2개씩 증가해서 먹어(첫째날 2개, 둘째날 4개, 셋째날 6개 ...) 총 10일 동안 먹은 빵의 갯수를 누적하여 아래와 같이 출력하세요
//				            # 출력 형식
//				            날짜  갯수 누적
//				            1일차 2개  2개
//				            2일차 4개  6개
//				            3일차 6개 12개
		//[1단계:코드] 29. for을 이용하여 100까지 4의 배수만 # 표시 및 합산,그 외는 숫자 표시, 하단에 4의 배수 합산표시.
		//[2단계:코드] 30. for을 이용하여 3,6,9게임을 출력하세요(20까지)- 마지막에 3이 포함될 때 처리
		//[1단계:개념] 31. 2중 for문을 기본형식을 예제를 통하여 설명하세요.
		//[1단계:코드] 32. 아래 내용을 2중 for문을 활용하여
//			1) 2X2(행X열)로 ♥를 표시 2) 3X2(행X열)로 ★표시 3) 입력한 행/열로 입력한 기호표시
		//[1단계:개념] 33. while문의 기본 형식을 예제를 통해 설명하세요.
		//[1단계:개념] 34. while문을 이용하여 100~90까지 출력하고, 합산결과를 출력하세요.
		//[1단계:코드] 35. while문을 이용해서 학생의 점수를 등록하고 총점과 평균을 출력하되, 등록을 종료시 -1를 입력해서 처리하세요.
		//[1단계:개념] 36. 반복문에서 break와 continue의 차이점을 기본 예제를 통하여 기술하세요
		//[1단계:개념] 37. 자바의 주요 메모리 2개의 유형에 따른 활용 내용을 기술하세요.
		//[1단계:개념] 38. 배열의 구성요소를 예제를 통해서 기술하세요
		//[1단계:개념] 39. 배열의 선언, 할당, 사용 형식을 여러가지 데이터 유형에 따라 구분하여 출력하세요.
		//[1단계:개념] 40. 배열의 전체 데이터를 처리할 때 for문을 사용한다. 배열의 속성에 따라서 어떻게 활용되는지 예제를 통해 기술하세요.
		//[1단계:코드] 41. 배열로 점수를 3개를 초기화하여, 반복문과 Scanner를 통해서 데이터를 입력되게 하고, 총계과 평균을 출력하세요.
		//[1단계:개념] 42. 클래스와 객체의 차이점을 예제를 통하여 기술하세요
		//[1단계:개념] 43. 필드의 특성을 예제를 통해 기술하세요
		//[1단계:개념] 44. 생성자와 일반 메서드의 기능적 차이점을 기술하세요
		//[1단계:개념] 45. 메서드의 여러가지 처리형태(입력,로직,리턴,복합형태)를 기술하고 간단한 예제로 구현하세요
		//[1단계:개념] 46. 생성자로 데이터를 사용할 때와 메서드를 데이터를 사용할 때, 어떤 차이점이 있는지 예제로 기술하세요.
		//[1단계:확인] 47. 메서드(입력+로직) 선언 예제
		//1) 3개에 입력값 중에 가장 큰수 출력
		//2) 1개의 입력값으로 70이상과 미만으로 합격/불합격 출력
		//3) 배열로 파는 물건들을 3개의 문자열 배열로 선언하고, 입력으로 물건명으로 파는 물건 여부를 출력 표시.
		//[1단계:확인] 48. 메서드(입력+로직+리턴) 선언  예제
		//1) 놀이공원 클래스에서 나이를 입력해서 무료/유료 구분해서 리턴 메서드(5세미만 65이상 무료)
		//2) 놀이공원 클래스에서 나이에 따라 입장료 10%, 15%, 20% 처리(나이구간 임의 적용)
		//3) 배열로 등록된 회원 선언하고, 입력된 회원명에 따라 등록여부를 리턴하여 처리하세요.
		//[1단계:확인] 49. 클래스(필드,생성자,메서드) 선언  예제
		//1) 버스클래스로 필드(버스번호,탑승자수) 버스번호 생성자 선언, 탑승자인원수 누적메서드 리턴 현재 총탑승자수
		// 탑승메서드(매개변수 탑승자인원, 리턴 현재 총탑승자수) 
//			버스번호 @@번 @@명이 탑승했습니다. 

//				**[1단계:코드] 1.** 
//				```java
//				public class PersonalInfo {
//				    public static void main(String[] args) {
//				        String name = "Kim";
//				        int age = 25;
//				        double height = 175.5;
//				        
//				        String favoriteMusic = "Shape of You";
//				        int releaseYear = 2017;
//				        
//				        String[] expenseList = {"Lunch", "Taxi", "Coffee"};
//				        double[] costs = {10.5, 15, 3.5};
//				        double totalExpense = costs[0] + costs[1] + costs[2];
//				        
//				        System.out.println("Name: " + name + ", Age: " + age + ", Height: " + height);
//				        System.out.println("Favorite Music: " + favoriteMusic + ", Released in: " + releaseYear);
//				        System.out.println("Total Expense for Today: " + totalExpense);
//				    }
//				}
//				```
		//
//				**[1단계:개념] 2.** 
//				기본 출력 형식은 `System.out.println()`를 사용하며, 문자열 내에서 특수 문자를 표시하기 위해 역슬래시 `\`를 사용합니다. 예를 들어, 줄바꿈을 위해 `\n`, 탭을 위해 `\t`, 따옴표를 출력하기 위해 `\"` 등을 사용합니다.
		//
//				**[1단계:개념] 3.** 
//				변수명의 선언 규칙은 다음과 같습니다:
//				- 변수명은 숫자로 시작할 수 없습니다.
//				- 변수명은 알파벳, 숫자, 그리고 밑줄(_)로 구성됩니다.
//				- Java는 대소문자를 구별하므로 `height`와 `Height`는 다른 변수입니다.
//				- 예약어는 변수명으로 사용할 수 없습니다. (예: `int`, `for`, `if` 등)
		//
//				**[1단계:개념] 4.** 
//				기본 데이터 유형:
//				```java
//				int number = 10;
//				double decimal = 10.5;
//				char letter = 'A';
//				boolean flag = true;
		//
//				System.out.println(number);
//				System.out.println(decimal);
//				System.out.println(letter);
//				System.out.println(flag);
//				```
		//
//				**[1단계:개념] 5.** 
//				형변환은 한 데이터 유형에서 다른 데이터 유형으로 값을 변환하는 과정입니다. 
//				```java
//				double myDouble = 2.5;
//				int myInt = (int) myDouble;  // 형변환. myInt는 2가 됩니다.
//				```
		//
//				**[1단계:코드] 6.** 
//				```java
//				long num1 = 2100000000L;
//				long num2 = 1500000000L;
//				long sum = num1 + num2;
//				System.out.println("Total: " + sum);
//				```
		//
//				**[1단계:개념] 7.** 
//				`char` 유형은 단일 문자를 저장합니다. 각 문자에는 특정한 정수 값이 있으며, 이를 '코드 값' 또는 '유니코드'라고 합니다.
		//
//				**[1단계:코드] 8.** 
//				```java
//				System.out.println((int) 'A' + " to " + (int) 'Z'); 
//				System.out.println((int) '0' + " to " + (int) '9'); 
//				```
		//
//				**[1단계:개념] 9.** 
//				연산자는 값(피연산자)에 대한 작업을 수행하는 기호입니다. `5 + 3`에서 `+`는 연산자이며, `5`와 `3`은 피연산자입니다. 전체 `5 + 3`은 연산식입니다.
		//
//				**[1단계:개념] 10.** 
//				산술 연산자는 수학적 연산을 수행하는 연산자입니다. 예: `+`, `-`, `*`, `/`, `%` (나머지 연산자). `%` 연산자는 나눗셈 후의 나머지를 반환합니다. 예를 들어, `7 % 3`은 1을 반환합니다.		
//				**[1단계:코드] 11.** 
//				```java
//				public class JuiceDivision {
//				    public static void main(String[] args) {
//				        double totalJuice = 500;
//				        double dividedJuice = totalJuice / 3;
//				        int dividedJuiceWithoutDecimal = (int) dividedJuice;
		//
//				        System.out.println("Divided Juice with Decimal: " + dividedJuice + "cc");
//				        System.out.println("Divided Juice without Decimal: " + dividedJuiceWithoutDecimal + "cc");
//				    }
//				}
//				```
		//
//				**[1단계:개념] 12.** 
//				`++`가 앞에 올 때는 전위 증가로, 해당 변수의 값을 증가시킨 후 연산이 이루어집니다.
//				`++`가 뒤에 올 때는 후위 증가로, 연산이 이루어진 후 해당 변수의 값을 증가시킵니다.
		//
//				```java
//				int x = 5;
//				System.out.println(++x);  // 6
//				System.out.println(x++);  // 6 (but x becomes 7 afterwards)
//				```
		//
//				**[1단계:개념] 13.** 
//				증감대입연산자는 변수의 값을 증가하거나 감소시키는 연산자입니다. 예: `+=`, `-=`, `*=`, `/=`, `%=`.
		//
//				```java
//				int y = 10;
//				y += 5;  // y becomes 15
//				```
		//
//				**[2단계:코드] 14.** 
//				```java
//				public class GimbapCost {
//				    public static void main(String[] args) {
//				        int gimbapPrice = 2500;
//				        for (int i = 1; i <= 3; i++) {
//				            System.out.println("김밥 " + i + "개 구매 " + (gimbapPrice * i));
//				        }
//				    }
//				}
//				```
		//
//				**[1단계:개념] 15.** 
//				`==`는 메모리의 주소를 비교합니다. `equals()`는 문자열의 내용을 비교합니다. 따라서 문자열의 내용을 확인하려면 `equals()`를 사용해야 합니다.
		//
//				**[1단계:개념] 16.** 
//				`main()`의 `args[]`는 프로그램 시작 시 입력된 명령행 인수를 문자열 배열로 받습니다.
		//
//				```java
//				public class ArgsExample {
//				    public static void main(String[] args) {
//				        for (String arg : args) {
//				            System.out.println(arg);
//				        }
//				    }
//				}
//				```
		//
//				**[2단계:코드] 17.** 
//				```java
//				public class Invoice {
//				    public static void main(String[] args) {
//				        String itemName1 = args[0];
//				        int price1 = Integer.parseInt(args[1]);
//				        int quantity1 = Integer.parseInt(args[2]);
		//
//				        String itemName2 = args[3];
//				        int price2 = Integer.parseInt(args[4]);
//				        int quantity2 = Integer.parseInt(args[5]);
		//
//				        int total1 = price1 * quantity1;
//				        int total2 = price2 * quantity2;
//				        int grandTotal = total1 + total2;
		//
//				        System.out.println(itemName1 + " x " + quantity1 + " = " + total1);
//				        System.out.println(itemName2 + " x " + quantity2 + " = " + total2);
//				        System.out.println("Total = " + grandTotal);
//				    }
//				}
//				```
		//
//				**[1단계:개념] 18.** 
//				`Scanner` 클래스는 입력을 위한 클래스로, 사용자의 입력을 받아들입니다.
		//
//				```java
//				import java.util.Scanner;
		//
//				public class ScannerExample {
//				    public static void main(String[] args) {
//				        Scanner sc = new Scanner(System.in);
//				        System.out.print("Enter your name: ");
//				        String name = sc.nextLine();
//				        System.out.println("Hello, " + name + "!");
//				    }
//				}
//				```
		//
//				**[1단계:코드] 19.**
//				```java
//				import java.util.Scanner;
		//
//				public class BattingAverageCalculator {
//				    public static void main(String[] args) {
//				        Scanner sc = new Scanner(System.in);
//				        
//				        System.out.print("선수명: ");
//				        String playerName = sc.nextLine();
		//
//				        System.out.print("타석수: ");
//				        int atBats = sc.nextInt();
		//
//				        System.out.print("안타수: ");
//				        int hits = sc.nextInt();
		//
//				        double battingAverage = (double) hits / atBats;
//				        System.out.println(playerName + "의 타
		//
//				율은 " + battingAverage + "입니다.");
//				    }
//				}
//				```
		//
//				**[1단계:개념] 20.** 
//				비교연산자는 두 값을 비교하는 연산자입니다. 종류: `==`, `!=`, `<`, `<=`, `>`, `>=`. 예) `if (a > b) {...}`
		//
//				**[1단계:코드] 21.**
//				```java
//				import java.util.Scanner;
		//
//				public class AdultChecker {
//				    public static void main(String[] args) {
//				        Scanner sc = new Scanner(System.in);
//				        
//				        System.out.print("나이를 입력하세요: ");
//				        int age = sc.nextInt();
//				        if (age >= 18) {
//				            System.out.println("성인입니다.");
//				        } else {
//				            System.out.println("성인이 아닙니다.");
//				        }
//				    }
//				}
//				```
		//
//				**[1단계:개념] 22.** 
//				논리 연산자는 여러 조건을 비교하는 연산자입니다. 종류: `&&`(AND), `||`(OR), `!`(NOT).
		//
//				```java
//				if (x > 10 && y < 5) {...}
//				```
		//
//				**[1단계:개념] 23.** 
//				for문의 기본 구성 요소는 (초기식; 조건식; 증감식)입니다. 
//				```java
//				for (int i = 0; i < 10; i++) {
//				    System.out.println(i);
//				}
//				```
		//
//				**[1단계:코드] 24.**
//				```java
//				// 1) 200~300 10단위 출력
//				for (int i = 200; i <= 300; i += 10) {
//				    System.out.println(i);
//				}
		//
//				// 2) 1000~950 3단위 감소
//				for (int i = 1000; i >= 950; i -= 3) {
//				    System.out.println(i);
//				}
		//
//				// 3) 100~0까지 2로 나눈값
//				for (int i = 100; i >= 0; i--) {
//				    System.out.println(i / 2.0);
//				}
//				```
		//
//				**[1단계:개념] 25.** 
//				지역변수는 특정 영역(블록) 내에서만 사용되는 변수이며, 그 영역을 벗어나면 사용할 수 없습니다. for문 내의 변수 i는 지역변수입니다. 전역변수는 클래스 레벨에서 선언되는 변수로 클래스 내의 모든 메서드에서 접근 가능합니다.
		//
//				**[1단계:개념] 26.** 
//				전역변수는 for문 안과 밖에서 모두 접근할 수 있으므로 for문에서 전역변수의 값을 변경하면, for문 이후에도 그 변경된 값을 사용할 수 있습니다.
		//
//				**[1단계:코드] 27.**
//				```java
//				import java.util.Scanner;
		//
//				public class FruitPriceCalculator {
//				    public static void main(String[] args) {
//				        Scanner sc = new Scanner(System.in);
//				        int total = 0;
		//
//				        System.out.println("no 과일명  가격");
//				        for (int i = 1; i <= 3; i++) {
//				            System.out.print(i + " ");
//				            String fruitName = sc.next();
//				            int fruitPrice = sc.nextInt();
		//
//				            System.out.println(fruitName + "   " + fruitPrice);
//				            total += fruitPrice;
//				        }
		//
//				        System.out.println("총계    " + total);
//				    }
//				}
//				```
		//
//				**[1단계:코드] 28.**
//				```java
//				public class BreadCounter {
//				    public static void main(String[] args) {
//				        int totalBread = 0;
		//
//				        System.out.println("날짜  갯수 누적");
//				        for (int i = 1; i <= 10; i++) {
//				            int breadToday = i * 2;
//				            totalBread += breadToday;
		//
//				            System.out.println(i + "일차 " + breadToday + "개  " + totalBread + "개");
//				        }
//				    }
//				}
//				```
		//
//				**[1단계:코드] 29.**
//				```java
//				public class MultipleOfFour {
//				    public static void main(String[] args) {
//				        int sum = 0;
		//
//				        for (int i = 1; i <= 100; i++) {
//				            if (i % 4 == 0) {
//				                System.out.print("# ");
//				                sum += i;
//				            } else {
//				                System.out.print(i + " ");
//				            }
//				        }
		//
//				        System.out.println("\n4의 배수 합계: " + sum);
//				    }
//				}
//				```
		//
//				**[2단계:코드] 30.**
//				```java
//				public class ThreeSixNineGame {
//				    public static void main(String[] args) {
//				        for (int i = 1; i <= 20; i++) {
//				            if (i % 3 == 0 || Integer.toString(i).contains("3")) {
//				                System.out.println(i + " 짝!");
//				            } else {
//				                System.out.println(i);
//				            }
//				        }
//				    }
//				}
//				```
			
//				**[1단계:개념] 31.** 
//				2중 for문은 for문 안에 또 다른 for문이 있는 구조입니다. 이 구조를 사용하면 행과 열 형태의 반복 작업을 할 수 있습니다. 주로 행렬이나 2차원 배열을 다룰 때 사용됩니다.
		//
//				**[1단계:코드] 32.**
//				```java
//				// 1) 2X2(행X열)로 ♥를 표시
//				for (int i = 0; i < 2; i++) {
//				    for (int j = 0; j < 2; j++) {
//				        System.out.print("♥ ");
//				    }
//				    System.out.println();
//				}
		//
//				// 2) 3X2(행X열)로 ★표시
//				for (int i = 0; i < 3; i++) {
//				    for (int j = 0; j < 2; j++) {
//				        System.out.print("★ ");
//				    }
//				    System.out.println();
//				}
		//
//				// 3) 입력한 행/열로 입력한 기호표시
//				import java.util.Scanner;
//				Scanner scanner = new Scanner(System.in);
//				System.out.println("행을 입력하세요: ");
//				int rows = scanner.nextInt();
//				System.out.println("열을 입력하세요: ");
//				int cols = scanner.nextInt();
//				System.out.println("기호를 입력하세요: ");
//				String symbol = scanner.next();
		//
//				for (int i = 0; i < rows; i++) {
//				    for (int j = 0; j < cols; j++) {
//				        System.out.print(symbol + " ");
//				    }
//				    System.out.println();
//				}
//				```
		//
//				**[1단계:개념] 33.** 
//				while문은 조건식이 참인 경우 반복을 수행하는 반복문입니다. 
//				```java
//				while(조건식) {
//				    // 반복할 코드
//				}
//				```
		//
//				**[1단계:개념] 34.** 
//				while문을 사용하여 100부터 90까지 출력하는 코드는 아래와 같습니다.
//				```java
//				int num = 100;
//				int sum = 0;
//				while(num >= 90) {
//				    System.out.println(num);
//				    sum += num;
//				    num--;
//				}
//				System.out.println("합산 결과: " + sum);
//				```
		//
//				**[1단계:코드] 35.**
//				```java
//				import java.util.Scanner;
//				Scanner scanner = new Scanner(System.in);
		//
//				int total = 0;
//				int count = 0;
//				while(true) {
//				    System.out.println("학생의 점수를 입력하세요. (-1로 종료)");
//				    int score = scanner.nextInt();
//				    if(score == -1) break;
		//
//				    total += score;
//				    count++;
//				}
//				System.out.println("총점: " + total);
//				System.out.println("평균: " + (double)total/count);
//				```
		//
//				**[1단계:개념] 36.** 
//				`break`는 반복문을 완전히 종료하는 명령어입니다. 반면, `continue`는 현재 반복을 중단하고 다음 반복을 시작하는 명령어입니다.
//				```java
//				// break 예제
//				for(int i = 0; i < 10; i++) {
//				    if(i == 5) break;
//				    System.out.println(i);
//				}
		//
//				// continue 예제
//				for(int i = 0; i < 10; i++) {
//				    if(i % 2 == 0) continue;
//				    System.out.println(i);
//				}
//				```
		//
//				**[1단계:개념] 37.** 
//				자바의 주요 메모리 2가지 유형은 스택 메모리와 힙 메모리입니다.
//				- **스택 메모리:** 지역 변수와 메서드 호출 정보가 저장되는 영역입니다. 변수가 선언될 때 할당되고, 메서드가 종료될 때 해제됩니다.
//				- **힙 메모리:** new 연산자로 생성된 객체나 배열이 저장되는 영역입니다. 가비지 컬렉터에 의해 불필요한 객체가 자동으로 해제됩니다.
		//
//				**[1단계:개념] 38.** 
//				배열은 동일한 타입의 여러 변수를 하나의 이름으로 그룹화해서 관리하는 것입니다. 배열의 각 요소는 인덱스 번호로 참조됩니다.
		//
//				**[1단계:개념] 39.** 
//				배열은 선언, 할당, 사용의 세 단계로 활용됩니다.
//				```java
//				// 선언
//				int[] arr;
		//
//				// 할당
//				arr = new int[5];
		//
//				// 사용
//				arr[0] = 1;
//				```
		//
//				**[1단계:개념] 40.** 
//				배열의 전체 데이터를 처리할 때 for문을 사용하는 것이 일반적입니다. 배열의 length 속성을 활용하여 배열의 크기를 얻을 수 있습니다.
//				```java
//				int[] arr = {10, 20, 30, 40, 50};
//				for(int i = 0; i < arr.length; i++) {
//				    System.out.println(arr[i]);
//				}
//				```
		//
//				**[1단계:코드] 41.**
//				```java
//				import java.util.Scanner;
		//
//				int[] scores = new int[3];
//				Scanner scanner = new Scanner(System.in);
//				int total = 0;
		//
//				for(int i = 0; i < scores.length; i++) {
//				    System.out.println((i+1) + "번째 점수 입력: ");
//				    scores[i] = scanner.nextInt();
//				    total += scores[i];
//				}
//				System.out.println("총계: " + total);
//				System.out.println("평균: " + (double)total/scores.length);
//				```
		//
//				**[1단계:개념] 42.** 
//				클래스는 객체의 설계도 또는 템플릿으로서, 객체의 속성과 기능을 정의합니다. 객체는 클래스를 기반으로 메모리에 할당된 실체입니다.
//				예) `Car` 클래스가 있을 때, 실제로 메모리에 할당하여 사용하는 `myCar`, `yourCar` 등은 객체입니다.
		//
//				**[1단계:개념] 43.** 
//				필드는 클래스의 속성 또는 상태를 나타내는 변수입니다. 클래스 내에서 선
		//
//				언되며, 해당 클래스의 객체들이 공통으로 가지는 속성을 나타냅니다.
//				예) `Car` 클래스에서 `color`, `speed` 등은 필드입니다.
		//
//				**[1단계:개념] 44.** 
//				생성자는 객체가 생성될 때 자동으로 호출되어 객체의 초기화를 담당하는 특별한 메서드입니다. 일반 메서드는 객체의 행위나 동작을 정의하며, 원하는 시점에 호출하여 사용할 수 있습니다.
		//
//				**[1단계:개념] 45.** 
//				- **입력:** 메서드에 전달되는 값을 받는 부분 (매개변수)
//				```java
//				void printName(String name) {
//				    System.out.println(name);
//				}
//				```
//				- **로직:** 메서드의 주요 기능을 담당하는 부분
//				```java
//				void calculateArea(int width, int height) {
//				    int area = width * height;
//				    System.out.println(area);
//				}
//				```
//				- **리턴:** 메서드가 처리한 결과를 호출한 곳으로 반환하는 부분
//				```java
//				int add(int a, int b) {
//				    return a + b;
//				}
//				```
//				- **복합형태:** 입력, 로직, 리턴을 모두 포함한 형태
//				```java
//				int multiply(int a, int b) {
//				    return a * b;
//				}
//				```
		//
//				**[1단계:개념] 46.** 
//				생성자는 객체가 생성될 때 한 번만 호출되며, 초기화 작업을 주로 담당합니다. 일반 메서드는 객체가 생성된 이후에 필요할 때마다 여러 번 호출될 수 있습니다. 
//				예) `Car` 클래스에 `Car()` 생성자와 `drive()` 메서드가 있을 때, 객체가 생성될 때 `Car()` 생성자가 호출되고, 필요에 따라 `drive()` 메서드를 여러 번 호출할 수 있습니다.
		//
//				**[1단계:확인] 47.**
//				```java
//				// 1) 3개에 입력값 중에 가장 큰수 출력
//				void printLargest(int a, int b, int c) {
//				    int largest = a;
//				    if(b > largest) largest = b;
//				    if(c > largest) largest = c;
//				    System.out.println("가장 큰 수: " + largest);
//				}
		//
//				// 2) 1개의 입력값으로 70이상과 미만으로 합격/불합격 출력
//				void checkPass(int score) {
//				    if(score >= 70) System.out.println("합격");
//				    else System.out.println("불합격");
//				}
		//
//				// 3) 배열로 파는 물건들을 3개의 문자열 배열로 선언하고, 입력으로 물건명으로 파는 물건 여부를 출력 표시.
//				String[] items = {"apple", "banana", "orange"};
//				void checkItem(String itemName) {
//				    for(String item : items) {
//				        if(item.equals(itemName)) {
//				            System.out.println(itemName + "은(는) 판매중입니다.");
//				            return;
//				        }
//				    }
//				    System.out.println(itemName + "은(는) 판매하지 않습니다.");
//				}
//				```
		//
//				**[1단계:확인] 48.**
//				```java
//				class AmusementPark {
//				    // 1) 놀이공원 클래스에서 나이를 입력해서 무료/유료 구분해서 리턴 메서드(5세미만 65이상 무료)
//				    String checkFreeOrPaid(int age) {
//				        if(age < 5 || age >= 65) return "무료";
//				        else return "유료";
//				    }
		//
//				    // 2) 놀이공원 클래스에서 나이에 따라 입장료 10%, 15%, 20% 처리(나이구간 임의 적용)
//				    double getDiscountedPrice(int age, double originalPrice) {
//				        if(age < 10) return originalPrice * 0.9;
//				        else if(age < 20) return originalPrice * 0.85;
//				        else return originalPrice * 0.8;
//				    }
		//
//				    // 3) 배열로 등록된 회원 선언하고, 입력된 회원명에 따라 등록여부를 리턴하여 처리하세요.
//				    String[] members = {"John", "Jane", "Doe"};
//				    boolean isMember(String name) {
//				        for(String member : members) {
//				            if(member.equals(name)) return true;
//				        }
//				        return false;
//				    }
//				}
//				```
		//
//				**[1단계:확인] 49.**
//				```java
//				class Bus {
//				    private int busNumber;
//				    private int passengers;
		//
//				    // 생성자
//				    public Bus(int busNumber) {
//				        this.busNumber = busNumber;
//				    }
		//
//				    // 탑승자 수 누적 메서드
//				    public int board(int count) {
//				        passengers += count;
//				        System.out.println("버스번호 " + busNumber + "번 " + count + "명이 탑승했습니다.");
//				        return passengers;
//				    }
		//
//				    // 현재 총 탑승자 수 리턴 메서드
//				    public int getTotalPassengers() {
//				        return passengers;
//				    }
//				}
				
			}

		

//	}
	


