package day08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Memberdb {
	//1. 필요한 객체 선언
	private Connection conn = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	
	private static final String url = "jdbc:mysql://localhost:3306/skudb?characterEncoding=utf8&serverTimezone=UTC";
	private static final String user = "sku";
	private static final String password = "sku";
	
	
	public Memberdb() {
		try {
			//3. 드라이버 로딩
			Class.forName("com.mysql.jdbc.Driver");
			//4. 접속(Connection 객체 얻어옴)
			conn = DriverManager.getConnection(url, user, password);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void insertMember(Member member) {
		//5.쿼리작성
		String sql = "insert into member values(?,?,?,?)";	//prepareStatement는 ????으로 선언
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, member.getId());
			ps.setString(2, member.getName());
			ps.setString(3, member.getPassword());
			ps.setString(4, member.getEmail());
			
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
	
	public void updateMember(Member member) {
		String sql = "Update member set name=? password=? email=? where id = ?  ";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, member.getId());
			ps.setString(2, member.getName());
			ps.setString(3, member.getPassword());
			ps.setString(4, member.getEmail());
			
			//String sql_d = "Delete from member where id = 'thk'";
			//ps = conn.prepareStatement(sql_d);
			
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
	
	public void deleteMember(Member member) {
		String sql = "Delete from member where id = ?";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, member.getId());
			ps.setString(2, member.getName());
			ps.setString(3, member.getPassword());
			ps.setString(4, member.getEmail());
			
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
			
			
			

}
