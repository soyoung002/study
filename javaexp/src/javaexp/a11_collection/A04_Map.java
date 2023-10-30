package javaexp.a11_collection;

import java.util.HashMap;
import java.util.Map;

public class A04_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*
			 # Map 컬렉션의 특징 및 주요 메서드
			 1. 특징
			 	- 키와 값으로 구성된 Map.Entry객체를 저장하는 구조
			 	- 키와 값은 모두 객체
			 	- 키는 중북될 수 없지만, 값은 중복 저장 가능
			 	ex) 키로 사용되는 것들
			 		- 학번과 이름
			 		- 주민번호와 이름
			 		==> 이름은 중복될 수 있지만, 학번과 주민번호는 중복 될 수 없다.
			 2. 구현 클래스
			 	HashMap, Hashtable, LinkedHashMap,
			 	Properties, TreeMap
			 3. 주요 메서드
			 	put(key, value) : 주어진 키와 값을 추가, 저장이 되는 값
			 	containsKey(Object key) : 주어진 키가 있는지 여부
			 	containsValue(Object val) : 주어진 값이 있는지 여부
			 	Set<Map.Entry<K,V>> entrySet()
			 		: 키와 값의 쌍으로 구성된 모든 Map.Entry객체를 Set에 담아서 리턴
			 	V get(Object key) : 컬렉션에 있는 데이터를 가져온다.
			 	keySet() : 모든 키를 Set 객체에 담아서 리턴
			 	size() : 저장된 크기
			 	clear() : 전체 삭제
			 	remove(Object key) : 키로 해당 구성데이터 삭제
			 	
		//Map<Integer, String> => 숫자형, 문자형으로 할 경우
			 	
			 * */
			//Map<문자열,문자열>
			Map<String, String> map01 = new HashMap<String,String>();
			map01.put("1000", "홍길동");
			map01.put("1001", "김길동");
			map01.put("1000", "오길동");	//해당 키가 이전에 있으면 최종값으로 설명됨...키 중복 불가
			map01.put("1002", "오길동");	//키만 중복 불가, 값은 중복 가능
										// map01.keySet() : 중복 없는 Key를 Set으로 가져온다.
			for(String key:map01.keySet()) {
				//맵.get(key) 를 통해 값을 가져온다.
				System.out.print(key+"\t");
				System.out.println(map01.get(key));
			}
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			
			//ex) 물건의 serial 번호와 물건명을 Map을 할당하여 넣어 보세요
			//	  Map<Integer, String>형식으로 물건 3개 정보를 넣으세요.
			Map<Integer, String> map02 = new HashMap<Integer, String>();
			map02.put(10001, "가방");
			map02.put(10001, "안경");
			map02.put(10002, "핸드폰");
			map02.put(10003, "운동화");
			map02.put(10003, "모자");
			map02.put(10003, "가방");
			map02.put(10004, "립밤");
			map02.put(10005, "가방");
			map02.put(10005, "강아지간식");
			
			System.out.println("시리얼번호\t물건명");
			for(int num:map02.keySet()) {
				System.out.print(num+"\t");
				System.out.println(map02.get(num)+"\t");
				
				
			}
				
		
			
	}

}
