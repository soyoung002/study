package javaexp.a05_arrayreview;

public class A03_DblArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 # 이중 배열
		 	1. 데이터 유형[][][] = new 데이터 유형[배열의 크기][배열의 크기][배열의 크기] => []3개이므로 3차원배열
		 	 [][]: 차원의 갯수			=> 2개이므로 2차원
		
		 			 			  */
		//ex. 반별로 1~5반까지의 각반 30명씩의 학생의 국어 점수를 할당하고 배열해서 출력하여라.
//		int[][] kors = new int[5][30];	//1~5반까지 30명
//		int[][] kors2 = new int[5][];	//5반인데 반별 학생수
//		//반은 5반인데 각 반에 학생 수를 다르게 할때
//		kors2[0][0]=75;
//		kors2[0][1]=85;
//		kors2[1][0]=75;
//		kors2[1][1]=80;
//		kors2[1][2]=90;
//		
//		
//		//2반에 2번 점수 할당
//		kors[1][1] = 70;	//1반의 1번..idx 0부터 시작하므로
//		//5반에 30번에 점수 할당
//		kors[4][29] = 80;
//		//1반 학생들은 점수를 임의로 할당
		
//		for(int idx=0; idx<30; idx++) {
//			kors[0][idx] = (int)(Math.random()*101);
//			System.out.println(idx+1+"번:"+kors[0][idx]);
//		}
//		
//		System.out.println("반의 갯수:"+kors.length);
//		System.out.println("2반의 학생수:"+kors[1].length);	
//				
//		
//		for(int idx=0; idx<kors.length;idx++) {
//			System.out.print(idx+":"+(idx+1)+"반");
//			System.out.println(kors[idx].length+"명");
//			
//			for(int jdx=0; jdx<kors[idx].length;jdx++) {
//				kors[idx][jdx]=(int)(Math.random()*101);
//				System.out.println(jdx+1+"\t"+kors[idx][jdx]+",");	//2차원 
//
//			}
//			System.out.println("");
//		}
		// (토론)
		// 2차원 데이터가 for문에서 할당하는 구조 이해여부 확인
		// 	1. kors.length와 kors[idx].length의 차이점을 알고있는지?
//			kors.length => 1차원 배열	
//			kors[idx] => 2차원 배열 크기	...kors[5][] 배열에 대한 하위 배열의 크기
//		==> arr[x][y] 형태에서 arr.length 는 x이고, arr.length 는 첫번쨰 배열의 크기
//			arr[idx].length 는 두번쨰 배열의 크기를 나타내고, arr[idx].length 는 y임 (단, 0<=idx<x 인 정수)
		
		
//			2. kors[idx][jdx] 왜 두개의 다른 idx,jdx를 사용해서 데이터를 할당하고있는지?
//				+ idx이 가지는 의미과 jdx의 의미는?
//		==>	idx는 첫번째 배열에, jdx는 두번쨰 배열에 접근하기 위해 사용
//			idx : 반정보에 대한 index. 0부터
//			jdx : 반 안에 학생들의 번호에 대한 index. 0부터
		
//			3. 2차원 데이터를 for문을 2개를 사용해야 하는 이유를 알고 있는지?
//		==>	배열의 갯수에 따라 for조건문을 줘야 원하는 반복문에 따라 값을 처리할 수 있음
//			반/번호라는 계층구조로 2차원 배열 선언을 했기 때문에 
//			반을 접근할 때 for문과 번호를 접근할 때 for문이 필요로 한다.
//			
		
//		ex) KTX가 1~5호차가 있고, 각 호차별로 좌석이 60개 있을때.
		
//			예약자명을 할당하는 배열을 선언하고
//			1호차 30번, 2호차 2번, 5호차 3번 좌석에
//			홍길동		김길동		신길동을 		예약자처리하고
		
//			For문을 통해서 출력해보세요		...String
		String [][] ktx = new String[5][60];
		ktx[0][29] = "홍길동";
		ktx[1][1] = "김길동";
		ktx[4][2] = "신길동";	//해당 배열에 데이터 할당 kt[해당][배열] = 데이터;
		
		for(int idx=0; idx<ktx.length; idx++) {	//1~5의 결과값까지 반복 (ktx의 5개 배열이 0,1,2,3,4의 5이고
//												1~5호차를 나타내야 하므로 0이 출력 되지 않게 idx+1을 해줌으로써 1부터 시작)
			
			System.out.println(idx+1+"호차 예약현황");
			for(int jdx=0; jdx<ktx[idx].length; jdx++) {	//ktx[idx] => ktx[][*] *의 하위배열을 불러옴
				System.out.println(" 좌석번호:"+(jdx+1)+":"+ktx[idx][jdx]);	//ktx[idx][jdx]는 데이터에 할당한 것을 포함하여 불러옴
				}
			}
		
		
		}
	
}


