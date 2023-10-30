package javaexp.a05_array;

public class A03_Mutiarry {

	public static void main(String[] args) {
		/* 기본데이터 유형 ==> 배열 ==> 배열안의 배열(다차원의 배열) ==> 객체(Object)..2차원이상의 것을 포괄할수있는 것
		# 다차원 배열
		1. 배열이 2차원 이상인 경우를 말한다.
			- 변수는 초기에 한개의 데이터를 할당한다.
			- 1차원의 배열에는 두개 이상의 데이터를 하나의 이름으로 index로 구분하여 연속적으로 할당한다.
			- 2차원 이상의 배열은 위 1차원 배열이 여러개를 처리하는 것을 말한다.
		2. 자바의 1차원 배열을 이용하여 2차원 이상의 배열을 처리한다.
			1) 선언
				- 1차원 배열
					데이터유형[] 배열명;
					ex) 기차의 호수...1호차 2호차 3차원 등
				- 2차원 배열
					데이터유형[][] 배열명;
					ex) 기차의 호차가 있고, 그 안에 좌석번호...1호차 1A좌석 등.. 
				- 다차원 배열 //1,2차원 이상
					데이터유형[][][]...배열명;
			2) 데이터 할당
			 	- 1차원 배열
			 		배열명 = new 데이터유형[크기];
			 		배열명[index번호]
			 		배열명.length
			 	- 2차원 배열
			 		배열명 = new 데이터유형[상위차원갯수][하위차원갯수];
			 		배열명[상위차원index][하위차원index];
			 		ex) 기차가 5호차까지 있고, 각 호차마다 좌석이 60좌석이 있을 때
			 			train = new 기차[5][60];	55호차가있고 60좌석이있다
			 			train[0][0];	index는 0부터 시작..첫번째 호차의 첫번째 ==> 2차원배열
		*/ 
		boolean [][] trainSeats = new boolean[5][60]; //기차의 5호차마다 좌석 60개가 있는데, 
//														각 좌석에 비어있으면 false, 좌석이 차있으면 true로 처리하는 2차원 구조의 배열 선언
		System.out.println("1호차의 첫번째 좌석:"+trainSeats[0][0]);	//1호차의 1좌석
		System.out.println("5호차의 마지막 좌석:"+trainSeats[4][59]);	//5호차의 마지막 좌석 -> 0부터 시작하므로 
		
		
//		ex.예약처리 해보시오. ==> true 처리가 되어야함.
//		ex1) 3호차 40번
		trainSeats[2][39]=true;
//		ex1) 4호차 2번
		trainSeats[3][1]=true;
//		ex1) 5호차 16번
		trainSeats[4][15]=true;
		
//		ex.학년에 반과 번호에 해당하는 점수 (3학년에 6반이 있고 각반의 20명의 국어점수처리를 2차원 배열)
		int[][] kors = new int[6][20]; //[6]1~6학년까지 있고 [20]1~20번까지 있는 범위 잡아줌kors로 할당 -> 할당시에는 0부터 시작 하면 안됨. 헷갈리지않기!!!
//		*n반의 n번 n점 할당해줄 대상
		//3반 2번 80점
		kors[2][1]=80;
		//4반 16점 90점
		kors[3][15]=90;
		//5반 7번 85점
		kors[4][6]=85;
		System.out.println("반의 수:"+kors.length);
		System.out.println("1반의 학생수:"+kors[0].length); //0(1반) 1(2반) 2(3반) ... 1반이므로 0
		
		for(int clsIdx=0;clsIdx<kors.length;clsIdx++) {
			System.out.println(clsIdx+1+"반의 점수");
			for(int noIdx=0;noIdx<kors[clsIdx].length;noIdx++) {
					System.out.println("\t"+(noIdx+1)+"번호 점수"+kors[clsIdx][noIdx]);
				}
				
			}
		
		
		
		
		
		
		
		
		}
	}


