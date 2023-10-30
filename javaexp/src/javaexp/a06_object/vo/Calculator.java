package javaexp.a06_object.vo;

public class Calculator {
	
	private int num01;
	private int num02;
	
	public Calculator(int num01, int num02) {	//생성자를 통한 초기화
		this.num01 = num01;
		this.num02 = num02;
	}
	public int plus() {
		return num01+num02;
	}
	public int minus() {
		return num01-num02;
	}
	public int multi() {
		return num01*num02;
	}
	public int divide() {
		return num01/num02;
	}

}
