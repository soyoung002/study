package javaexp.z01_homework;
import java.util.*;

public class A0918_Homework {

	private static Scanner scanner;

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

//		#`switch-case` 문을 사용하여 아래 문제를 풀어보세요
		
//		1 커피의 종류를 입력하면 해당 커피의 가격을 출력하는 프로그램을 작성해보세요.
		System.out.print("★커피 종류를 입력하세요.\n메뉴)아메리카노/카페라떼/우유 중 선택:");
		Scanner sc = new Scanner(System.in);
		String coffe = sc.nextLine();
		switch(coffe) {
		case "아메리카노" :
			System.out.print("아메리카노의 가격은 1000원 입니다.");
			break;
		case "카페라떼" :
			System.out.println("카페라떼의 가격은 2000원 입니다.");
			break;
		case "우유" :
		System.out.println("우유의 가격은 1500원 입니다.");
		}
		System.out.println("");
		
//		2.**계절 출력기**:
//		월(1-12)을 입력받아 해당 월의 계절을 출력하세요.
		
		System.out.println("★월에 따른 계절(1~12월 중에 입력하세요):");
		Scanner a = new Scanner(System.in);
		int b = sc.nextInt();
		switch(b) {
		case 9,10: // ->굳이 case 안나눠도도됨.
			System.out.println(b+"월은 가을입니다.");
			break;
		case 11 :
		case 12 :
		case 1:
			System.out.println(b+"월은 겨울입니다.");
			break;
		case 3:
		case 4:
		case 5:
		case 2: 
			System.out.println(b+"월은 봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(b+"월은 여름입니다."); 
			break;
			default:
				System.out.println("1~12(월)의 숫자만 입력 가능합니다");
		
		}
		System.out.println("");
		
//		3. **도형의 넓이 계산기**:
//		도형 이름(직사각형, 원, 삼각형)을 입력 받아, 해당하는 도형의 넓이를 계산하여 출력하세요. 
//		필요한 추가 정보(예: 길이, 반지름)는 사용자로부터 입력받아 계산합니다.
//		System.out.println("★도형의 넓이 계산(직사각형/원/삼각형 중 선택)");
//		Scanner sc1 = new Scanner(System.in);
//		String sc2 = sc1.nextLine(); //길이
//		String sc3 = sc1.nextLine(); //반지름
//		switch(sc2) {
//		case "직사각형" :
//			System.out.println();
//			break;
//		}
//		
		
		
		
//		# for문 활용
//		1. for(기본) 기본 형식을 활용해서 아래 데이터를 출력하세요
//		     1) 200~300 10단위 출력, 2) 1000~950 3단위 감소, 3) 100~0까지 2로 나눈값
		System.out.println("★200~300까지 10단위 증가");
		for(int cnt=200; cnt<=300; cnt+=10) {
			System.out.print(cnt+",");
		}
		
		System.out.println("\n★1000~950까지 3단위 감소");
		for(int cnt=1000; cnt>=950; cnt-=3) {
			System.out.print(cnt+",");
		}
		System.out.println("\n★100~0까지 2로 나누기");
		for(int cnt=100; cnt>0; cnt/=2) {
			System.out.print(cnt+",");
		}

	
//		2. 김밥의 단가를 입력받아서 1~20개의  갯수별 총가격을 출력하세요.
//		System.out.println("\n★김밥 가격");
//	    int price = scanner.nextInt();
//		for(int i=1;cnt<=20;cnt++) { 				//갯수
//			int price = price*cnt; 
//			System.out.println(pirce+"원");		}
	
	
//		3. 입력할 과일의 3개의  과일명과 과일가격을 입력받아, 아래 형식으로 출력하되 총 비용을 출력 하세요
//		       no 과일명  가격
//		        1 사과    3000            
//		        2 바나나   4000           
//		        3 딸기    12000
//		          총계    19000  
//		System.out.println("\n과일 가격 총 금액");
//		 int total = 0; 						//가격 합산 전역변수
//        String prn = "no\t과일명\t가격\n";			//출력할 내용 전역변수
//        for (int i = 1; i <= 3; i++) {
//           String fruitName = scanner.next();
//           System.out.println(i+"번째 과일명 입력");
//            int fruitPrice = scanner.nextInt();
//            System.out.println("과일의 가격 입력");
//            int fruitPrice = Integer.parseInt(scanner.nextLine());
//            // 출력할 내용 문자열로 누적처리
//            prn += i + "\t"+fruitName + "\t" + fruitPrice+"\n";
//            total += fruitPrice;
//        }
//        System.out.println(prn);
//        System.out.println("총계    " + total);
//		
		
//		4. for(지역/전역) - 곰돌이가 하루 빵을 2개씩 증가해서 먹어(첫째날 2개, 둘째날 4개, 셋째날 6개 ...) 
//		      총 10일 동안 먹은 빵의 갯수를 누적하여 아래와 같이 출력하세요
//		   # 출력 형식
//		  날짜  갯수 누적
//		   1일차 2개  2개
//		   2일차 4개  6개
//		   3일차 6개 12개
        
        
        
//		5. for을 이용하여 100까지 4의 배수만 # 표시 및 합산,그 외는 숫자 표시, 하단에 4의 배수 합산표시.
        
        
        
//		6. for을 이용하여 3,6,9게임을 출력하세요(20까지)- 마지막에 3이 포함될 때 처리
		
	}

}
