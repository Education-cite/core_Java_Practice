package data_Structure;

import java.util.Stack;

public class BuiltInStackExample {

	public static void main(String[] args) {
		Stack<String> stack = new Stack();
		System.out.println("data added : " + stack.push("Enamul"));
		System.out.println("data added : " + stack.push("Tawhide"));
		System.out.println("data deleted : " + stack.pop());
		System.out.println("data deleted : " + stack.pop());
		
		if(stack.empty()) {
			System.out.println("Empty Stack");
		}else {
			System.out.println("data return : " + stack.peek());
		}
		
		System.out.println("data Exit : " + stack.size());




	}
}
