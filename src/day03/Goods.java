package day03;

public class Goods {
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	public void print() {
		System.out.println("실행결과:");
	}
	
	public void setname(String n) {
		this.name = n;
	}
	
	public String getname() {
		return name;
	}
	
	public void setprice(int s) {
		this.price = s;
	}
	
	public int getprice() {
		return price;
	}
	
	public void setstock(int c) {
		this.countStock = c;
	}
	
	public int getstock() {
		return countStock;
	}
	
	public void setsold(int d) {
		this.countSold = d;
		
	}
	
	public int getsold() {
		return countSold;
		
	}
	
	
	
}
