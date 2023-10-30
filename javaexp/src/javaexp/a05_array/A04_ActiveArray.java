package javaexp.a05_array;

import java.util.ArrayList;
import java.util.List;

public class A04_ActiveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// # 동적 배열
		// 1. 일반 배열은 한계점은 일단 크기가 정해지면
		//    구성요소에 대한 크기를 수정하지 못 하는 단점이 있다.
		// 2. 이러한 단점때문에 실무적으로 동적인 배열을 이용해서
		//    데이터를 처리해준다.
		// 3. 기본 코드..
		// 		List<데이터유형> 참조변수= 하위 실제 객체 생성..
		//      참조변수.size() : 배열의 크기
		//      참조변수.add(추가할데이터) : 배열에 데이터 추가.
		//      참조변수.get(0) : 특정 index에 있는 데이터 확인
		List<String> list = new ArrayList<String>();
		System.out.println("현재 배열의 크기:"+list.size());
		list.add("사과");
		list.add("바나나");
		list.add("딸기");
		System.out.println("현재 배열의 크기:"+list.size());
		System.out.println("첫번째 데이터:"+list.get(0));
		System.out.println("두번째 데이터:"+list.get(1));
		System.out.println("세번째 데이터:"+list.get(2));
		
	}

}



