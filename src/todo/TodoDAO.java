package todo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import day09.DButil;
import day09.Member;

public class TodoDAO {
	
	public boolean addTodoList(TodoList todolist) {
		boolean resultFlag = false;
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = TodoUtil.getConnection();
			String sql = "insert into todo(id,todo,done) values(?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, todolist.getId());
			ps.setString(2, todolist.getTodo());
			ps.setBoolean(3, todolist.isDone());
			
			int resultCount = ps.executeUpdate();
			
			if(resultCount == 1)
				resultFlag = true;
			
			
		}catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			//´Ý±â
			DButil.close(conn, ps);
		}
		
		return resultFlag;
		
		
	}
	
	public int upTodoList(TodoList todolist) {
		int resultCount = 0;
		
		//¼±¾ð
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = DButil.getConnection();
			String sql = "update todo set todo = ?, done = ? where id = ? ";
			ps = conn.prepareStatement(sql);

			ps.setString(1, todolist.getTodo());
			ps.setBoolean(2, todolist.isDone());
			ps.setInt(3, todolist.getId());
			
			resultCount = ps.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			//´Ý±â
			DButil.close(conn, ps);
		}
		
		return resultCount;
	}
	
	
	public int deleteTodoList(Integer id) {
		int resultCount=0;
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = DButil.getConnection();
			String sql = "delete from todo where id = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			
			resultCount = ps.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			//´Ý±â
			DButil.close(conn, ps);
		}
		return resultCount;
	}
	
	
	public TodoList getTodo (Integer id) {
		TodoList todolist = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DButil.getConnection();
			String sql = "select id,todo,done from todo where id =? ";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				todolist = new TodoList();
				todolist.setId(rs.getInt(1));
				todolist.setTodo(rs.getString(2));
				todolist.setDone(rs.getBoolean(3));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			DButil.close(conn,ps,rs);
		}
		
		return todolist;
		
	}
	
	
	public List<TodoList> getTodoList() {
		List<TodoList> TodoList_list = new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DButil.getConnection();
			String sql = "select id,todo,done from todo";
			ps = conn.prepareStatement(sql);

			rs = ps.executeQuery();
			
			while(rs.next()) {
				TodoList todolist = new TodoList();
				todolist.setId(rs.getInt(1));
				todolist.setTodo(rs.getString(2));
				todolist.setDone(rs.getBoolean(3));
				
				TodoList_list.add(todolist);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			DButil.close(conn,ps,rs);
		}
		
		return TodoList_list;
	}
	


}
