package day03;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods camera = new Goods();
		
		camera.print();
		camera.setname("Nikon");
		camera.setprice(400000);
		camera.setstock(30);
		camera.setsold(50);
		
		System.out.println("상품이름:" + camera.getname());
		
		

	}

}
