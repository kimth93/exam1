package day06;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MyStack<E> {
	
	private int a;
	private Stack<E> stack = new Stack();
	
	private List<E> arrlist = new ArrayList<>();


	public boolean empty() {
		return stack.empty();
		
	}


	public synchronized Object peek() {

		return stack.peek();
	}


	public synchronized Object pop() {
		return stack.pop();
	}

	public E push(E item) {

		return stack.push(item);
	}

	public synchronized int search(Object o) {

		return stack.search(o);
	}

}
