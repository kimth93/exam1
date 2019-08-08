package day04bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import day09.DButil;
import todo.TodoList;

public class AccountDAO {
	
	
	public boolean makeAccount(Account account) {
		
		boolean resultFlag = false;
		//¼±¾ð
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			conn = DButil.getConnection();
			String sql = "insert into account(number,name,balance) values(?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, account.getnumber());
			ps.setString(2, account.getName());
			ps.setInt(3,account.getBalance());
			
			int resultCount = ps.executeUpdate();
		
			if(resultCount == 1)
				resultFlag = true;
					
			}catch (Exception e) {
				e.printStackTrace();
					
			}finally {
				//´Ý±â
				DButil.close(conn, ps);
			}
		
		
		return false;
	}
	
	public int upAccount(Account account) {
		int resultCount = 0;
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = DButil.getConnection();
			String sql = "update account set name = ?, balance = ? where number = ? ";
			ps = conn.prepareStatement(sql);

			ps.setString(1, account.getName());
			ps.setInt(2,account.getBalance());
			ps.setString(3, account.getnumber());
			
			resultCount = ps.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			DButil.close(conn, ps);
		}
		
		return resultCount;
	}
	
	public int deleteAccount(String number) {
		int resultCount=0;
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = DButil.getConnection();
			String sql = "delete from account where number = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, number);
			
			resultCount = ps.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			//´Ý±â
			DButil.close(conn, ps);
		}
		return resultCount;
	}
	
	public Account getAccount (String number) {
		Account account = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DButil.getConnection();
			String sql = "select number,name,balance from account where number =? ";
			ps = conn.prepareStatement(sql);
			ps.setString(1,number);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				account = new Account();
				account.setnumber(rs.getString(1));
				account.setName(rs.getString(2));
				account.setBalance(rs.getInt(3));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			DButil.close(conn,ps,rs);
		}
		
		return account;
		
	}
	
	public List<Account> getAccountList() {
		List<Account> Account_list = new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DButil.getConnection();
			String sql = "select id,todo,done from todo";
			ps = conn.prepareStatement(sql);

			rs = ps.executeQuery();
			
			while(rs.next()) {
				Account account = new Account();
				account.setnumber(rs.getString(1));
				account.setName(rs.getString(2));
				account.setBalance(rs.getInt(3));
				
				Account_list.add(account);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			DButil.close(conn,ps,rs);
		}
		
		return Account_list;
	}
	
	
	
		
}

	
	

