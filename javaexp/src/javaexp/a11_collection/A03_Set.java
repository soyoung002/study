package javaexp.a11_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class A03_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 # Set 컬레션
		 1. 특징
		 	1) 수학의 집합에 비유
		 	2) 저장 순서가 유지되지 않음
		 	3) 객체를 중복 저장 불가
		 	4) 하나의 null만 저장 가능(null도 식별)
		 2. 상속받는 구현 클래스
		 	1) HashSet : 동일 객체 및 동등 객체는 중복 안됨
		 				 동일 객체 판단 방법
		 				 hashCode(), equals() 둘 다 true이면 동등 객체
		 	2) LinkedHashSet
		 	3) TreeSet
		 3. 주요 메서드
		 	1) add()
		 	2) contains()
		 	3) isEmpty()
		 	4) Iterator<E> iterator()
		 		저장된 객체를 한번씩 가져오는 반복자 리턴
		 		전체 객체 대상으로 가져온다.
		 	5) size()
		 	6) clear()
		 	7) remove(Object)
		 	
		 * */
		Set<String> setOb = new HashSet<String>();
		setOb.add("오렌지");
		setOb.add("키워");
		setOb.add("오렌지");
		setOb.add("수박");
		setOb.add("수박");
		setOb.add("딸기");
		
		
		// setOb.iterator() : Set 데이터를 Iterator형식으로 가져온다.
		Iterator<String> iterator = setOb.iterator();
		//hasNext() : 포함된 객체를 다음으로 넘어가게 처리
		// boolean 으로 있을 때까지... 마지막에 다음 내용 호출하면 false
		// 오렌지 수박 딸기 키위
		// next() : 실제 위 hasNext()가 boolean으로 다음으로 넘어가게 하면
//					데이터를 가져오게 처리하는 부분이다.
		
		while(iterator.hasNext()) {
			String ele = iterator.next();
			System.out.println(ele);
		}
		
		
		//중복되지 않고, 순서도 확보가 되지 않는다.
		System.out.println("# 저장된 set 데이터 #");
		for(String fruit:setOb) {
			System.out.println(fruit);
		}
		
		//ex) 주머니 속에 빨강 구슬 2개, 파란 구슬 3개, 노랑 구슬 2개를
//			  HashSet에 할당하고 for문으로 출력하라
		
		// ex) 주머니 속에 빨강 구슬 2개, 파랑 구슬 3개, 노랑 구슬
		//     2개를 HashSet에 할당하고 for문으로 출력해보세요..
		Set<String> pouch = new HashSet<String>();
		pouch.add("빨강구슬");
		pouch.add("빨강구슬");
		pouch.add("파랑구슬");
		pouch.add("파랑구슬");
		pouch.add("파랑구슬");
		pouch.add("노랑구슬");
		pouch.add("노랑구슬");
		System.out.println("# 주머니에 반복이 제거된 구슬 #");
		for(String one:pouch) {
			System.out.println(one);
		}
		
		
		
	}

}
