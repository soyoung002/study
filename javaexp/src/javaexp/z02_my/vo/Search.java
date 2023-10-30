package javaexp.z02_my.vo;

import java.util.*;

public class Search {

   /*
    * contains:문자열이 다른 문자열을 포함하는지 여부를 검사 - boolean 문자열 포함시 true/포함하지 않으면 false
    */
   public void SearchInfo() {
      
      Scanner sc = new Scanner(System.in);
      String Search = sc.nextLine(); 
      miniMain mini01 = new miniMain();
      
      System.out.println("* 메인으로 돌아가려면 '이전'입력");
      
      switch (Search) {
      case "신","데","렐","라","신데","신데렐라": {
         
         System.out.println("- 검색결과 : 신데렐라/13,500원/샤를페로(지은이)/비룡소(출판사)");   
         
         String back01 = sc.nextLine();      
         if(back01.equals("이전")) {
            mini01.miniInfo();
             break;
         }
      }
      case "어","린","왕","자","어린","어린왕자" : {
         System.out.println(" 검색결과 : 어린왕자/12,000원/앙투안드생텍쥐페리 (지은이)/열린책(출판사)");
         
         String back02 = sc.nextLine();
         if(back02.equals("이전")) {
            mini01.miniInfo();
             break;   
         } 
      }
         default: {
         System.out.println(" 검색결과 : 해당 책이 없습니다.\n이전 메뉴로 돌아가려면'이전'을 입력하세요.");

         String back03 = sc.nextLine();
         if(back03.equals("이전")) {
            mini01.miniInfo();
         }
         
//      //입력한 글자가 포함되면 해당 결과값을 출력
//      if (Search.contains("신") || Search.contains("데") || Search.contains("렐") || Search.contains("라")) {
//         System.out.println("- 검색결과 : 신데렐라/13,500원/샤를페로(지은이)/비룡소(출판사)");   
//         
//         String back01 = sc.nextLine();      
//         if(back01.equals("이전")) {
//            mini01.miniInfo();
//         }
//         
//      }else if(Search.contains("어") || Search.contains("린") || Search.contains("왕") || Search.contains("자")) {
//         System.out.println(" 검색결과 : 어린왕자/12,000원/앙투안드생텍쥐페리 (지은이)/열린책(출판사)");
//         
//         String back02 = sc.nextLine();
//         if(back02.equals("이전")) {
//            mini01.miniInfo();
//            
//      }else if(Search.contains("null") {
//         System.out.println(" 검색결과 : 해당 책이 없습니다.\n이전 메뉴로 돌아가려면'이전'을 입력하세요.");
//
//         String back03 = sc.nextLine();
//         if(back03.equals("이전")) {
//            mini01.miniInfo();
//            
//      }else {
//         
//      }
   
   }
   
         
      
}
      
      
      
      
   }
      
}