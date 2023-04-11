package data_Structure;

public class MyStack {

	int capacity = 3;
	int[] stack = new int[capacity];
	int top = -1;
	
	void push(int x) {
		
		if(top < capacity-1) {
		top = top +1;
		stack[top] = x;
		System.out.println("successfully added : " +x);
		}else {
			System.out.println("Exception!! StackoverFlow!!");
		}
	}
	
	
	int pop() {
		if(top<0) {
			System.out.println("exception ! Stack UnderFlow!!");
		return -1;
		}
		int val = stack[top];
		top = top-1;
		return val;
	}
	
	
	int peek() {
		if(top<0) {
			System.out.println("exception ! Stack UnderFlow!!");
		return -1;
		}
		return stack[top];
	}
	
	
	public static void main(String[] args) {
		MyStack obj = new MyStack();
		
		System.out.println("peek method return : " + obj.peek());
		obj.push(10);
		obj.push(20);
		obj.push(30);
		System.out.println("pop deleted : " + obj.pop());
		obj.push(40);
		
		System.out.println("peek method return : " + obj.peek());

	}
	
}
