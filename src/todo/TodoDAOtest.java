package todo;

import java.util.List;

import day09.Member;

public class TodoDAOtest {

	public static void main(String[] args) {
		
		TodoDAO dao = new TodoDAO();
		TodoList todolist = new TodoList();
		
		todolist.setId(1234);
		todolist.setTodo("Java");
		todolist.setDone(true);

//		if(dao.addTodoList(todolist)) {
//			System.out.println("입력성공");
//		
//		}else
//			System.out.println("입력실패");	
//		
//		todolist.setId(1234);
	//	todolist.setTodo("Java");
//		todolist.setDone(false);
		
		//System.out.println(dao.upTodoList(todolist));
		//System.out.println(dao.deleteTodoList(1234));
		
		
//		TodoList resultTodo = dao.getTodo(1234);
//		System.out.println(resultTodo);
		
		List<TodoList> TodoList_list = dao.getTodoList();
		for(TodoList resultTodo : TodoList_list) {
			System.out.println(resultTodo);
		}
		
	}
	
	

}
