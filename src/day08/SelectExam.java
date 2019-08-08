package day08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectExam {

	public static void main(String[] args) {
		//1. 필요한 객체 선언
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			//3. 드라이버로딩
			Class.forName("com.mysql.jdbc.Driver");
			//4. 접속(Connection 객체 얻어옴)
			String url = "jdbc:mysql://localhost:3306/skudb?characterEncoding=utf8&serverTimezone=UTC";
			String user = "sku";
			String password = "sku";
			conn = DriverManager.getConnection(url, user, password);
			
			//5. 쿼리 작성
			String sql = "select * from member where id =?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, "th");	//메서드 인자로
			
			//6. 쿼리 실행
			rs = ps.executeQuery();
			
//			if(rs.next()) {										//한건
//				System.out.println(rs.getString(1));			//타입에 따라
//				System.out.println(rs.getString("name"));
//				System.out.println(rs.getString(3));
//				System.out.println(rs.getString(4));
//			}	

			while(rs.next()) {
				System.out.println(rs.getString(1));			//타입에 따라
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
				
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
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

}
