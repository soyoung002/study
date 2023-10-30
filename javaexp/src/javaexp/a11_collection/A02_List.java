package javaexp.a11_collection;

import java.util.ArrayList;
import java.util.List;

import javax.sql.rowset.serial.SQLOutputImpl;

public class A02_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 # List 컬렌션
		 1. 특징
		 	1) 인덱스로 관리
		 	2) 중복해서 객체 저장 가능
		 2. 구현 실제 클래스
		 	ArrayList
		 	Vector : 쓰레드 환경에서 동기화를 위하여 처리
		 		  	 복수의 쓰레드가 동시에 Vector에 접근해
		 		  	 객체를 추가, 삭제하더라도 쓰레드가 안전하게 보장.
		 	LinkedList : 인접 참조를 링크해서 체인처럼 관리
		 				 특정 인덱스에서 객체를 제거하거나 추가하게 되면
		 				 바로 앞 뒤 링크만 변경
		 				 빈번한 객체 삭제와 삽입이 일어나는 곳에서는 ArrayList보다 좋은 성능 발휘
		 3. 공동 메서드
		 	1) boolean add(추가할객체) : 제일 마지막에 추가
		 	2) void add(int index, 추가객체) : 특정한 위치에 추가
		 									그 위치에 있는 객체/데이터는 index가 뒤로 밀린다
		 	3) set(int index, 변경할객체) : 특정한 위치에 데이터 변경
		 								 그 위치에 있는 객체/데이터는 사라진다.
		 	4) boolean contains(요소객체) : 요소를 포함하는지에 대한 여부
		 	5) get(int index) : 특정 위치에 있는 요소의 객체 가져오기
		 	6) boolean isEmpty() : 컬렉션이 비어 있는지 확인
		 	7) int size() : 크기
		 	8) void clear() : 포함하는 모든 객체 삭제
		 	9) remove(int index) : 해당 위치의 객체 삭제
		 	10) boolean remove(Object o) : 주어진 객체 삭제
		 	
		 	
		 	* 인터페이스 List = new ArrayList(상속 받은 실제 객체)
		 * */
			List<String> flist = new ArrayList<String>();
			flist.add("사과");
			flist.add("바나나");
			flist.add("딸기");
			flist.add(0,"오렌지");	//0부터 시작.. 0 순서대로 출력
			flist.add(2,"포도");
			flist.add(1,"키위");
			flist.set(1, "키위");
			System.out.println("있는지 여부:"+flist.contains("키위"));
			if(!flist.isEmpty()) {
				System.out.println("크기가:"+flist.size());
			}else {
				System.out.println("없음");
			}
			flist.remove(1); //두번째 데이터 삭제..0부터 첫번째를 시작하므로 두번째가 1
			for(int idx=0;idx<flist.size();idx++) {
				System.out.print(idx+1+"\t");
				System.out.println(flist.get(idx));
			}
			flist.clear();//삭제
			System.out.println("비어 있는지 여부:"+flist.isEmpty());
	
			//ex) List<String> 형태로 회원 3명의 아이디를 추가하고
//					1.특정회원 1명째 위치 추가
//					2. 2번째 회원 변경처리
//					3. himan이 맞는지 확인
//					5 전체 회원 리스트 출력
		


		List<String> list = new ArrayList<String>();
		list.add("hime");
		list.add("higirl");
		list.add("goodman");
		
		//1. 특정회원을 1번째 위치에 추가
		list.add(0,"blueman");
		
		//2. 2번째 회원 변경처리
		list.set(1,"ohman");
			
		//3. himan이 있는지 확인
		System.out.println("hima있는지 여부 : "+list.contains("himan"));
		
		
		//4. 마지막 회원을 삭제 처리
		list.remove(list.size()-1);

		//5 전체 회원 리스트 출력
		for(int idx=0; idx<list.size();idx++) {
			System.out.println(idx+" : "+list.get(idx));
		}
				
	}

}
