package day08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertMember {
	public void addMember(String id, String name, String passwd, String email) {
		
		//1. 필요한 객체를 선언
		//입력을 위해서는 접속, 쿼리작성 
		Connection conn = null;
		PreparedStatement ps = null;
				
		try {
			//3. 드라이버 로딩
			Class.forName("com.mysql.jdbc.Driver");
			//4. 접속(Connection 객체 얻어옴)
			String url = "jdbc:mysql://localhost:3306/skudb?characterEncoding=utf8&serverTimezone=UTC";
			String user = "sku";
			String password = "sku";
			conn = DriverManager.getConnection(url, user, password);
			//5. 쿼리 작성
			String sql = "insert into member values(?,?,?,?)";	//prepareStatement는 ????으로 선언
			
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, name);
			ps.setString(3, passwd);
			ps.setString(4, email);
			
			//String sql_d = "Delete from member where id = 'thk'";
			//ps = conn.prepareStatement(sql_d);

			//String sql_u = "Update member set"
			
			//6.쿼리실행
			int resultCount = ps.executeUpdate();
				
			System.out.println(resultCount+"건 입력 성공");
					
					
					
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			//2.선언한 객체를 닫는다. 나중껄 먼저
			if(ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		
		
	}

}
