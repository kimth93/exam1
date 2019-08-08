package todo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TodoUtil {
	//DB에 접속하기 위한 메서드
	//패키지가 달라도 접근할 수 있도록
	//connection 객체를 얻어내기 위함
	//static으로 모두 사용 가능하게 끔 객체를 생성하지 않고 
	
	public static Connection getConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/skudb?characterEncoding=utf8&serverTimezone=UTC";
		String user = "sku";
		String password = "sku";
		
		Connection conn = DriverManager.getConnection(url, user, password);
		
		return conn;
		
	}
	
	public static void close(Connection conn, PreparedStatement ps) {
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
	
	public static void close(Connection conn, PreparedStatement ps, ResultSet rs) {
		if (rs != null) {
			
			try {
				rs.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		//conn과 ps 닫아주는 메서드 불러오기
		close(conn,ps);
	}

}
