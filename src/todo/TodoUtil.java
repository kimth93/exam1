package todo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TodoUtil {
	//DB�� �����ϱ� ���� �޼���
	//��Ű���� �޶� ������ �� �ֵ���
	//connection ��ü�� ���� ����
	//static���� ��� ��� �����ϰ� �� ��ü�� �������� �ʰ� 
	
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
		//conn�� ps �ݾ��ִ� �޼��� �ҷ�����
		close(conn,ps);
	}

}
