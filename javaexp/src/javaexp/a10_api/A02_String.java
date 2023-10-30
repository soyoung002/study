package javaexp.a10_api;

public class A02_String {

	public static void main(String[] args) {
		/*
		# String
		1. 문자열형 객체형 데이터
			char ==> char[] ==> String
			'a'      {'h','i'}   "hi"
		2. 문자열의 비교
			1) 주소값 비교 원칙(자바원칙)
				stack/heap
				
				모든 객체들은 heap영역에 실제 객체를 두고,
				그 heap영역의 위치(주소값/참조변수)를 stack에
				할당하여 사용한다.
				String name1 = "홍길동";
				String name2 = "홍길동";
				String name3 = new String("홍길동");
				String name4 = new String("홍길동");
				
				== : stack영역의 데이터를 비교하여 boolean값을
					가져오는 것이다. new 무조건 객체가 다른 위치(heap)
					에 생성이 된다.
				처음에는 "홍길동"을 만들고 특정한 heap영역에 위치에
				할당, 그 다음 "홍길동" 처음에 만들었던 주소값을 그대로
				사용해서 변수에 할당된다.
				주의) 자바는 대부분 선언을 해서 문자열을 사용하는 것이
				아니라 입력받든지, 파일에 있는 데이터 로딩 하든지,
				네트웍상으로 데이터가져오든지 해서 실제는 new String()
				형식으로 객체를 생성하기에 주소값 비교(==)보다 equals()
				를 이용하여 사용하여야 한다.
				name3 == name4 ? false
				name1 == name4 ? false
				name1 == name2 ? true
				name1.equals(name4) ? true
				# 결론 : String은 문자열을 비교할 때는 equals()메서드를
				이용하여야 한다.
		3. String 기능 메서드
			1) 생성자
				new String()
				new String(byte[]) {25,75} ==> {'홍','길'}==>"홍길"
					최종프로젝트에 활용 아이디를 잊었을 때, 임시비번호 생성
					회사에서 최초사번과 임시비밀번호 발급
				new String(char[])
				new String("문자열")
				
		 * */
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = new String("홍길동");
		String str4 = new String("홍길동");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		// "홍길동" : 문자열 바로 대입한 것은 문자열이 같으면 모두가 주소가 같음..
		
		System.out.println("str1 == str2 :"+(str1==str2));
		System.out.println("str1 == str3 :"+(str1==str3));
		System.out.println("str1 == str4 :"+(str1==str4));
		System.out.println("str1.equals(str2) :"+(str1.equals(str2)));
		System.out.println("str1.equals(str3) :"+(str1.equals(str3)));
		System.out.println("str1.equals(str4) :"+(str1.equals(str4)));
		
		
		
//		for(byte code=Byte.MIN_VALUE;
//				code<=Byte.MAX_VALUE;code++) {
//			System.out.println(code+":"+(char)code);
		
		for(int code=1;code<=200;code++) {
			System.out.println(code+":"+(char)code);
		}
		byte[] bytes = {72,101,108,108,111};
		String greet = new String(bytes);
		System.out.println(greet);
		
		char[] chars = {'G','o','o','d',' ','d','a','y','!'};
		String greet2 = new String(chars);
		System.out.println(greet2);
		
		
		//ex) Lunch의 각 byte코드값을 확인하여, 위와 같이 배열을 만들어 문자열을 출력하세요.
		byte[] bytes2 = {76,117,110,99,104};
		String lunch = new String(bytes2);
		System.out.println(lunch);
	}
}
