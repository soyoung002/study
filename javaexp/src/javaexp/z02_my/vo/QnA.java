package javaexp.z02_my.vo;

import java.util.Scanner;


public class QnA {

	
	public void QnAInfo() {

		miniMain mini01 = new miniMain();	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("#Best 5 많이하는 질문");
		String q1 = "1. 중고상품 품질 등급 판정 기준은 무엇입니까?";
		String q2 = "2. 알라딘 구매 새책만 매입합니까?";
		String q3 = "3. 알라딘 미등록 상품도 판매할 수 있습니까?";
		String q4 = "4. 매입가능 여부,매입가격을 미리 확인할 수 있습니까?";
		String q5 = "5. 지정택배사(혹은 편의점위탁) 신청했는데, 배송방법을 바꾸고 싶습니다.";


		String a1 = "'알라딘 중고상품 품질 등급 판정 가이드'에서 확인이 가능합니다. "
				+ "온라인에서 팔기, 중고매장에서 팔기 공용입니다. 중고 품질 판정 고객 위원회의 투표 결과를 반영하고 있습니다.";
		String a2 = "아닙니다. 다른 서점에서 구매한 새책이나 알라딘 혹은 다른 중고매장에서 구매한 책도 되팔 수 있습니다?";
		String a3 = "온라인 중고샵에서 회원간거래 방식으로 직접 등록,판매하실 수 있습니다." + "단, 알라딘에팔기(직접 등록팔기/원클릭 팔기/매장에서 팔기 등)는 불가능합니다.";
		String a4 = "가능합니다.우선, 알라딘에 등록된 상품이 아니면 알라딘에팔기는 불가하며, 회원에게팔기만 가능합니다."
				+ "등록 상품이라도 매입신청량이 많은 상품은 일시적으로 매입불가하거나, 균일가 매입 등 제한적으로 매입됩니다."
				+ "아래 페이지에서 상품명 혹은 ISBN으로 검색하세요. 검색 안되는 상품은 미등록 상품이므로 판매 불가합니다."
				+ "http://used.aladin.co.kr/shop/UsedShop/witem_search.aspx"
				+ "하단 검색결과 상품 중 판매하실 상품을 정확히 선택해 우측 <알라딘에팔기>를 누른 후 매입 가능여부, 매입가격 확인이 가능합니다."
				+ "단, LP 음반, 알라딘 미등록 상품 등은 매입하지 않습니다." + "매장에서도 이 기준이 적용되나, 실시간 매입으로 방문 매입시점에는 매입불가, 매입가 조정 가능성도 있습니다."
				+ "단, 중고매장 방문 후 판매 원하시면, 방문시 반드시 휴대폰을 지참하셔야 합니다. 회원이시면 매장 방문 최초 판매시 1회만, 비회원은 판매시 매번 휴대폰 본인인증을 거치셔야 합니다.";
		String a5 = "아래 1대1상담 페이지에서 중고샵>알라딘에팔기 선택 후 배송방법 변경을 요청해주십시오."
				+ "http://www.aladin.co.kr/cs_center/wcs_ConsultQS.aspx";

		System.out.println(q1);
		System.out.println(q2);
		System.out.println(q3);
		System.out.println(q4);
		System.out.println(q5);
		
		System.out.println("\n# 자주 묻는 질문 #\n찾는 답변의 질문을 선택하세요(숫자만 입력):");
		String QnASelect = sc.nextLine();
		

	//조건문
	switch (QnASelect) {
	case "1":
		System.out.println(a1);
		System.out.println("* 질문목록으로 돌아가려면 '이전'을 입력하세요/메인이동시'메인'입력");
		String back01 = sc.nextLine();
		if(back01.equals("이전")) {
			QnAInfo();
		}else {
				mini01.miniInfo();
				}
			
		break;
	case "2":
		System.out.println(a2);
		System.out.println("* 질문목록으로 돌아가려면 '이전'을 입력하세요/메인이동시'메인'입력");
		String back02 = sc.nextLine();
		if(back02.equals("이전")) {
			QnAInfo();
		}else {
				mini01.miniInfo();
				}
		break;
	case "3":
		System.out.println(a3);
		System.out.println("* 질문목록으로 돌아가려면 '이전'을 입력하세요/메인이동시'메인'입력");
		String back03 = sc.nextLine();
		if(back03.equals("이전")) {
			QnAInfo();
		}else {
				mini01.miniInfo();
				}
		break;
	case "4":
		System.out.println(a4);
		System.out.println("* 질문목록으로 돌아가려면 '이전'을 입력하세요/메인이동시'메인'입력");
		String back04 = sc.nextLine();
		if(back04.equals("이전")) {
			QnAInfo();
		}else {
				mini01.miniInfo();
				}
	case "5":
		System.out.println(a5);
		System.out.println("* 질문목록으로 돌아가려면 '이전'을 입력하세요/메인이동시'메인'입력");
		String back05 = sc.nextLine();
		if(back05.equals("이전")) {
			QnAInfo();
		}else {
				mini01.miniInfo();
				}
		break;
	}
	
	
	
	
	
	}	
}


