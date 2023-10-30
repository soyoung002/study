package javaexp.y01_util;

public class A03_RandomCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int num=0;num<=126;num++) {
			System.out.println(num+":"+(char)num);
		}
		
		//영문 대문자 중에서 4개를 추출해서 임의의 비밀번호 설정하기..영어대문자 코드 범위 65~90번
//		int rCod1 = (int)(Math.random()*26+65);
//		int rCod2 = (int)(Math.random()*26+65);
//		int rCod3 = (int)(Math.random()*26+65);
//		int rCod4 = (int)(Math.random()*26+65);
//		System.out.print("임시 비밀번호 : "+(char)rCod1);
//		System.out.print((char)rCod2);
//		System.out.print((char)rCod3);
//		System.out.println((char)rCod4);
//		System.out.print("8자리 임시 비밀번호 : ");
//		for(int cnt=1;cnt<=8;cnt++) {
//			
//			int rCode = (int)(Math.random()*26+65);
//			System.out.print((char)rCode);
//		}
		//ex)소문자 8자를 임으로 출력 처리 97~122
		int rCode01 = (int)(Math.random()*26+97);
		int rCode02 = (int)(Math.random()*26+97);
		int rCode03 = (int)(Math.random()*26+97);
		int rCode04 = (int)(Math.random()*26+97);
		int rCode05 = (int)(Math.random()*26+97);
		int rCode06 = (int)(Math.random()*26+97);
		int rCode07 = (int)(Math.random()*26+97);
		int rCode08 = (int)(Math.random()*26+97);
		System.out.println("임시 비밀번호 : "+(char)
		rCode01+rCode02+rCode03+rCode04+rCode05+rCode06+rCode07+rCode08);
				
		System.out.print("소문자 영문 8자리 임시 비밀번호:");
		for(int cnt001=1;cnt001<=8;cnt001++) {
			int rCode001 = (int)(Math.random()*26+97);
		System.out.print((char)rCode01);	
		
		}
		
		//ex)숫자 4자를 임의로 출력 처리 48~57
		System.out.println("");
		System.out.print("숫자 4자리 임시 비밀번호:");
		for(int cnt02=1;cnt02<=4;cnt02++) {
			int rCode002=(int)(Math.random()*10+48);
			System.out.print((char)rCode002);
		}
		
		//ex)대문자+소문자+특수문자를 모두 포함한 16자 임시비밀번호 생성
		System.out.println("");
		System.out.print("대문자+소문자+특수문자 16자리 임시 비밀번호:\n");
		for(int cnt02=1;cnt02<=16;cnt02++) {
			int rCode002=(int)(Math.random()*26+65+(int)(Math.random()*26+97));
			System.out.print((char)rCode002);
		}
		
	}

}
