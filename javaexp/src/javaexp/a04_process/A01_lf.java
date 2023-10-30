package javaexp.a04_process;

public class A01_lf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		 # 제어문
		 1. 코드 실행 흐름 제어
		 	1) 정상적인 코드 실행 흐름
		 		main() 메소드의 시작인 중괄호{}에서
		 		시작하여 끝까지 진행한다.
		 		위에서부터 아래로 코드 흐름에 따라 진행한다.
		 		대입연산자(=)의 경우에는 오른쪽에서 왼쪽으로
		 		흐름이 처리된다.
		 		그 외의 경우에는 왼쪽에서 오쪽으로 코드를 처리한다.
		 		단, 연산자의 우선순위(괄호,곱셈/나눗셈,뺄셈/덧셈)는 지켜주어야 한다.
		 	2) 제어문의 역할
		 		코드의 실행 흐름을 개발자가 어떤 조건이나 경우에 따라 원하는 방향으로 변경 또는 반복할 때 사용한다.
		 		
		 */
//
//		System.out.println("시작1");
//		System.out.println("시작2");
//		System.out.println("시작3");
//		System.out.println("시작4");
//		int no1,no2,no3;
//		no1=no2=no3=5; // 대입연산자
//		System.out.println(no1+no2*no3);
//		System.out.println((no1+no2)*no3);
		
		
		/*
		 # 제어문의 종류
		 1. 조건문
		 	1) if
		 		if(조건문){
		 		
		 		}
		 		
		 		if(조건1){		// 조건이 true 일 때 수행 
		 		
		 		}else{			// 조건2가 false 일 때 수행
		 		
		 		}if(조건1){		// 조건 1일 때 수행 
		 		
		 		}else if(조건2){	// 조건 1이 아니고 조건 2일 때
		 		
		 		}else if(조건3){	//이전 조건 모두 제외하고 조건3일 때
		 		
		 		}...
		 		
		 		}else{			// 위에 나열된 if 조건을 모두 제외한 그 외의 경우 처리
		 		
		 		}
		 		
		 	2) switch
		 		switch데이터) {
		 			case 케이스1:
		 				위 데이터가 케이스1일 때 처리할 내용
		 				break;
		 			case 케이스2:
		 				위 데이터가 케이스2일 때 처리할 내용
		 				break; 	// break가 나오기 전까지 처리,,,break 할때는 ;(세미콜론)
		 				...
		 			default:
		 				위 데이터가 case에 해당하는 데이터 이외일 때 처리할 내용
		 			}
		 2. 반복문
		 	1) for문
		 		기본 for문
		 			for(초기값1;반복조건2;증감연산자4){
		 				3
		 			}
		 			// 1,2,3,4,2,3,4,2,3,4...순서로 반복
		 			  
		 			 ex)
		 			  for(int cnt=1;cnt<=10;cnt++) {
		 			  	Systme.out.println(cnt+"번째 반복");
		 			  } 
		 			 
		 			
		 		foreach의 for문(배열데이터에서 진행)
		 			for(단위 데이터 : 배열){
		 			
		 			}
		 			
		 			ex)
		 				java Count 홍길동 김길동 신길동 
		 				String args[] = {"홍길동","김길동","신길동"};
		 				
		 				main(String args[])
		 				for(String arg:args){
		 					System.out.println(arg);
		 				}
		 		
		 		
		 	2) while(반복할 조건){ 		
		 			반복수행 할 block
		 		}
		 		// 반복 수행할 block에서 결과에 따라 계속 반복이 결정되는 경우에 주로 사용
		 		 ex)
		 		  	String menu "";
		 		  	while(!menu.equals("Q")) { //Q 입력시 반복문 종료
		 		  		반복수행할 block
		 		  		// 주문할 메뉴를 입력하세요. 주문이 끝나면 Q를 입력하세요.
		 				System.out.println(menu);
		 			
		 		    }
		 		  String menu = sc.nextLine();
		 		  if(menu)
		 		 
		 		 
		 	3) do{	
		 	
		 		}
		 		while(반복할조건);
		 		
		 			우선 1번을 수행하고, 아래의 반복할 조건에 맞을 때까지 수행
		 			
		 			
		 			
		 		}while(반복할조건);
		 	4) 그외 반복문에서 사용할 주요 키워드(if문과 함께 사용)
		 		continue;
		 			==> 반복을 일시 해당 반복 step에서만 중지하고 계속 반복
		 				ex) 3 곱셈에 대하여 결과 값이 20까지의 숫자만 나타낸다 ...3*6까지 반복 후 중단
		 		break;
		 			==> 반복을 중단 처리
		 			
		 			ex)
		 			 for(int cnt=1;cnt<=10;cnt++){
		 			 	if(cnt==5) 		//이후의 내용(cnt==5) 반복문은 수행하지 않고 다음으로 넘어간 후 수행
		 			 	continue;		//1,2,3,4,6,7 ==> 5를 뺸
		 			 }
		 			 if(cnt==8){
		 			 	break; //반복문 수행을 모두 중단 처리. 더이상 중괄호 내에 있는 구문 수행하지 않음
		 						반복 step이 남아있더라도 중단
		 			 
		 			 }
		 			 System.out.println(cnt+"번째 안녕하세요!")
		 			 
		 			}
		 			
		 			
		 
		 3. 여러가지 중첩반복, 중첩조건, 조건/반복 혼합 예제...
		 
		 # 기본 if문
		 1. 조건문 결과에 따라 중괄호 ({}) 또는 바로 옆, 바로 밑의 내용을 수행하는 경우
		 2. 종류
		 	1) 중괄호 블럭 : 여러 라인에 걸쳐 수행해야하는 경우
		 		if(조건문){
		 			조건이 true일 때, 수행할 라인1
		 			라인2
		 			라인3....
		 		}
		 	2) 바로 옆에 내용 수행
		 		if(조건문1) 조건문1일 때, 처리할 내용;
		 		if(조건문2) 조건문2일 떄, 처리할 내용;
		 	3) 바로 밑에 내용 수행
		 		if(조건문1)
		 			조건문1일 때, 수행할 내용(1라인까지만 영향)
		 			
		 			
		 		if(조건문2)
		 			조건문2일 때, 수행할 내용(1라인까지만 영향)
		 * */
		
//		#짝수일 때 짝수수행을 나타내기
		int no = 1; 
		System.out.println("순차구조 처리:"+(++no));
		if(no%2==0) System.out.println("짝수 수행");
		System.out.println("순차구조 처리:"+(++no));
		if(no%2==0) System.out.println("짝수 수행");
		System.out.println("순차구조 처리:"+(++no));
		if(no%2==0) System.out.println("짝수 수행");
		System.out.println("순차구조 처리:"+(++no));
		if(no%2==0) System.out.println("짝수 수행");
		System.out.println("순차구조 처리:"+(++no));
		if(no%2==0) System.out.println("짝수 수행");
		
		//ex)int cnt = 0;
		//	@@번째 안녕하세요를 출력하되, 3의 배수인 경우에 짝!! 3의 배수입니다 출력되게 조건문 처리하세요
		// 결과값 나누기 3을 했을때 나머지가 0인것은 짝 그외에는 숫자가 출력되도록..
		
		int cnt = 0;
		System.out.println(++cnt+"번째 안녕하세요");
		if(cnt%3==0) 
			System.out.println("짝!! 3의 배수입니다!");
		System.out.println(++cnt+"번째 안녕하세요");
		if(cnt%3==0) System.out.println("짝!! 3의 배수입니다!");
		if(cnt%3==0)
			System.out.println("짝!! 3의 배수입니다!");
			System.out.println("그 다음 진행");
		System.out.println(++cnt + "번째 안녕하세요"); if(cnt%3==0);
		System.out.println(++cnt + "번째 안녕하세요"); if(cnt%3==0);
		System.out.println(++cnt + "번째 안녕하세요"); if(cnt%3==0);
		System.out.println(++cnt + "번째 안녕하세요"); if(cnt%3==0);
		System.out.println(++cnt + "번째 안녕하세요"); if(cnt%3==0);
		System.out.println(++cnt + "번째 안녕하세요"); if(cnt%3==0);
		System.out.println(++cnt + "번째 안녕하세요"); if(cnt%3==0);
		System.out.println(++cnt + "번째 안녕하세요"); if(cnt%3==0);
		System.out.println(++cnt + "번째 안녕하세요"); if(cnt%3==0);
		
		//여러 라인에 걸쳐 조건문 처리..
		
//		if(cnt>5) {
//			
//			System.out.println("# 현재 데이터가 5초과할 때 #");
//			System.out.println("현재 번호:"+cnt);
//			System.out.println("해당 조건 구문이 여러 라인에 걸쳐 수행된다.");
//			System.out.println("{} : 중괄호 범위에 있을 때");
//			
//		}
		
	}

}
