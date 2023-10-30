package javaexp.a11_collection.vo;

public class Student {

		//1. 가장 먼저 필드값 생성
		private String name;
		private int kor;
		private int eng;
		private int math;
		
		
		//2. 디폴트 생성자 생성
		public Student() {
			// TODO Auto-generated constructor stub
			
			
		//3. 필드값 생성
		}
		public Student(String name, int kor, int eng, int math) {
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
			
			
		//4. set,get 메서드 생성	
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}
		public String getName() {
			int tot = kor+eng+math;
			int avg = tot/3;
			return "이름:"+name+", "
					+ "국어:"+kor+", "
					+ "영어:"+eng+", "
					+ "수학:"+math
					+" 총점:"+tot+" 평균:"+avg;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getKor() {
			return kor;
		}
		public void setKor(int kor) {
			this.kor = kor;
		}
		public int getEng() {
			return eng;
		}
		public void setEng(int eng) {
			this.eng = eng;
		}
		public int getMath() {
			return math;
		}
		public void setMath(int math) {
			this.math = math;
		}
		
}
