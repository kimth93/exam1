package day09;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
	//입력
	public boolean addMember(Member member) {
		boolean resultFlag = false;
		
		//선언
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = DButil.getConnection();
			String sql = "insert into member(id,name,password,email) values(?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, member.getId());
			ps.setString(2, member.getName());
			ps.setString(3, member.getPassword());
			ps.setString(4, member.getEmail());
			
			int resultCount = ps.executeUpdate();
		
			if(resultCount == 1)
				resultFlag = true;
			
		}catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			//닫기
			DButil.close(conn, ps);
		}
		return resultFlag;
	}

	//수정
	public int updateMember(Member member) {
		int resultCount = 0;
		
		//선언
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = DButil.getConnection();
			String sql = "update member set name=?, password=?, email=? where id=? ";
			ps = conn.prepareStatement(sql);

			ps.setString(1, member.getName());
			ps.setString(2, member.getPassword());
			ps.setString(3, member.getEmail());
			ps.setString(4, member.getId());
			
			resultCount = ps.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			//닫기
			DButil.close(conn, ps);
		}
		
		return resultCount;
	}
	
	//삭제
	public int deleteMember(String id) {
		int resultCount=0;
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = DButil.getConnection();
			String sql = "delete from member where id = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1,id);
			
			resultCount = ps.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			//닫기
			DButil.close(conn, ps);
		}
		return resultCount;
	}

	//조회(한건)
	public Member getMember(String id) {
		Member member = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DButil.getConnection();
			String sql = "select id,name,password,email from memeber where id =? ";
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				member = new Member();
				member.setId(rs.getString(1));
				member.setName(rs.getString(2));
				member.setPassword(rs.getString(3));
				member.setEmail(rs.getString(4));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			DButil.close(conn,ps,rs);
		}
		
		return member;
		
	}
	
	//조회(여러건)
	public List<Member> getMemberList() {
		List<Member> memberList = new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DButil.getConnection();
			String sql = "select id,name,password,email from member";
			ps = conn.prepareStatement(sql);

			rs = ps.executeQuery();
			
			while(rs.next()) {
				Member member = new Member();
				member.setId(rs.getString(1));
				member.setName(rs.getString(2));
				member.setPassword(rs.getString(3));
				member.setEmail(rs.getString(4));
				
				memberList.add(member);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			DButil.close(conn,ps,rs);
		}
		
		return memberList;
	}
	
	
}
