package javaexp.a10_api;

import java.util.ArrayList;

public class A06_WrpperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 
		 # Wrapper클래스
		 1. 기본데이터유형을 사용하다보면 여러 형태로 변환이 필요하거나 기능적으로 처리해야 되는 경우가 많다.
		 	type이 기본 유형으로 되다보니 형변환이 일어나지 않으면 이러한 기능에 대한 한계가 발생한다
		 2. 이 때, 자바 api에서는 기본 데이터유형과 연결되는 객체 유형을 만들어 필요에 따라 
		 	제공되는 메서드를 이용해서 여러가지 데이터 유형 변경, 치환 기능을 처리할 수 있게 하는데 
		 	이것을 Wrapper 클래스라고 한다.
		 	//치환 : 기본 자료형을 다른 기본 자료형으로 변환하거나 문자열로 변환하는 기능
		 3. 형태(기본유형과 연결)
		 	byte => Byte
		 	char => Character(*)
		 	..
		 	int => Integer(*)
		 	..
		 	double => Double
		 	boolean => Boolean
		 
		 */
		
			//기본데이터 유형
			int num01 = 25;	
			
			//기본데이터 유형을 Wrapper클래스(객체)로 만듦
			//이렇게 객체로 만들면 여러가지 기능 메서드 활용 가능
			Integer num01Ob = Integer.valueOf(num01);
			
			//이와 같이 기본데이터유형을 기능 메서드를 이용하기 위해
			//객체로 변환하는 것을 Boxing이라고 한다.
			System.out.println(num01Ob.byteValue());
			System.out.println(num01Ob.hashCode());
			System.out.println(num01Ob.MAX_VALUE);
			
			
			//이렇게 객체를 이용해서 여러가지 기능을 처리하다가
			//최종적인 데이터를 다시 기본유형에 할당하여 처리하는 것을
			//UnBoxing이라고 한다.
			int num02 = num01Ob.intValue();
			System.out.println("언박싱된 num02:"+num02);
			/*
			 Wrapper 클래스
			 	기본데이터 유형 <===> 객체
			 				Boxing 포장
			 	기본데이터 유형 <==== 객체
			 				UnBoxing 포장을 풀다
			 				
			 Integer.parse("25") : 객체생성없이 바로 사용할 수 있는 static 메서드들이 많음
			 Integer.compare(25,30)
			 Integer.
			 	
			 * */
			
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
			//ex) 위 코드를 기반으로 char유형과 double유형의 데이터를 할당하고 Boxing과 UnBoxing 처리를 해보세요.
			//기본데이터 유형
			char ch01 = '홍';
			
			// Boxing처리 ( 기본유형 => 객체화 )
			Character ch01Ob = Character.valueOf(ch01);
			
			//UnBoxing 처리 ( 객체 => 기본유형 )
			char ch02 = ch01Ob.charValue();
			
			
			double db01 = 3.14;
			Double dbOb02 = Double.valueOf(db01);
			
			//여러가지 기능 메서드 사용
			dbOb02.byteValue();	
			double dbb02 = dbOb02.doubleValue();
			
			System.out.println(ch02);
			System.out.println(db01);
			
			
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			/*
			 	
			 	# Auto Boxing / Auto UnBoxing
			 	1. 기본 데이터 유형을 보다 간편하게 객제형으로 변경 
			 		또는 다시 객체를 기본 데이터 유형을 변경하는 처리가 필요하는데
			 	 	이것을 Auto라고 붙여서 사용한다.
			 	2. Auto Boxing
			 		Wrapper클래스 = 기본데이터;
			 		이렇게 기본 데이터를 기능 메서드 사용 없이 객체에 
			 		바로 할당하는 것  AutoBoxing이라함.
			 * */
					
					Integer intOb = 30;	//바로 데이터
					System.out.println(intOb.compareTo(40)); 
					//Integer.compareeTo(Integer)
					Integer one = Integer.valueOf(30);
					Integer two= Integer.valueOf(40);
					//객체.compareTo(객체)로 두 값을 비교하여
					//적으면 -1, 같으면 0, 많으면 1이있고
					//바로  AutobBoxing이 일어나서 처리 가능
					
					System.out.println("# 비교된 값 #");
					System.out.println(one.compareTo(two));
					
					//autoBoxing이 되기에 처리가 가능하다.
					Integer intOb2 = 50;
					System.out.println(one.compareTo(50));
					
					System.out.println(intOb.compareTo(30)); 
					System.out.println(intOb.compareTo(20));
					int num03 = intOb;
					//객체도 다시 원래대로 기본유형으로 할당하여 사용할 수 있다
					
					System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
					
					
					
					//ex) Byte, Boolean으로 AutoBoxing과 AutoUnBoxing 처리
					
					Byte bOb = 10;
					//float로 데이터 변환 메서드 처리(객체메서드 사용 예시)
					bOb.floatValue();	
					
					
					//기본데이터 변경
					byte bNum01 = bOb;	
					Boolean boolOb = true;
					
					
					//기능 메서드 사용
					boolOb.parseBoolean("false");	
					
					
					//기본 데이터로 변경
					boolean bool01 = boolOb;		
					
					
					
					//구성요소인 Interger에 기본 데이터 할당, autoBoxing됨
					ArrayList<Integer> numList = new ArrayList<Integer>();
					
					
					//numList.get(0)=30, Integer i = 30;
					numList.add(30);	
					numList.add(40);	
					numList.add(50);
					
					Integer data = 50;	//autoboxing 처리
					
					Integer iObj1 = Integer.valueOf(70);
					Integer iObj2 = Integer.valueOf(80);
					Integer iObj3 = Integer.valueOf(90);
					
					numList.add(iObj1);
					numList.add(iObj2);
					numList.add(iObj3);
					
					
					Integer ob4 = numList.get(1);	//구성요소는 Integer 객체
					int num06 = ob4.intValue();	//Unboxing;
					
					
					//위와 같이 변수 선언도 생략하고 바로 할당 auto boxing처리
					int num07 = ob4;	//Auto Unboxing;
					
					
					//구성요소에 Integer로 된 내용을 기본데이터유형으로 할당
					//autounBoxing 처리
					int num05 = numList.get(1);
					
					
					
	}

}
