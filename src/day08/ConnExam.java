package day08;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnExam {

	public static void main(String[] args) throws Exception {
		//0. ����̹� �ε�
		Class.forName("com.mysql.jdbc.Driver");
		//1. ����(Connection ��ü ����)
		String url = "jdbc:mysql://localhost:3306/skudb?characterEncoding=utf8&serverTimezone=UTC";
		String user = "sku";
		String password = "sku";
		
		Connection conn = DriverManager.getConnection(url, user, password);
		//2. Connection��ü�� �� ���Դٸ� ������ �� �ƴٰ� �Ǵ�
		if(conn != null)
			System.out.println("^^");
		else
			System.out.println("--");
	}

}
