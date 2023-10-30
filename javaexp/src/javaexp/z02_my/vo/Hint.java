package javaexp.z02_my.vo;			//Hint class가 package의 javaexp.z02_my.vo에 속함

import java.util.Scanner;

public class Hint {               //Hint class는 공개 class임.
	   private String hint;         //Hint class에 hint 변수 생성
	                           //private를 통해 hint는 Hint 클래스 내에서만 사용 가능하게 설정
	                           //hint는 class안에 있고 전역변수가 됨.

	   public Hint(String hint) {      //Hint Class안의 Hint함수를 생성하고 String타입의 인수를 생성합니다.
	      this.hint = hint;         //hint인수를 hint 변수에 할당합니다.
	      //int a = 1;             //함수 Hint안에 선언하였으므로 지역변수가됨 ..이건 과제 내용과 무관
	      }   

	   public String nextHint() {      //다음 힌트를 반환합니다.
	      return hint;
	   }

	   
	}