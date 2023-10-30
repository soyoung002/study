package javaexp.a06_object.vo;

public class Product {
	
	private String name;
	private int price;
	private int stock;
	
	public Product(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	public void showInfo() {
		System.out.println("# 물건 정보 #");
		System.out.println("물건명:"+name);
		System.out.println("가격:"+price);
		System.out.println("재고량:"+stock);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
}
