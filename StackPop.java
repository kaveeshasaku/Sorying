package DataStructures;

import java.util.Stack;

public class StackPop {
	
	
	public static void main(String args[])
    {
		
			Stack<Integer> stack = new Stack<Integer>();

			
			stack.push(78);
			stack.push(56);
			stack.push(30);
			stack.push(64);
			stack.push(10);

			
			System.out.println("Initial Stack: " + stack);

	
			System.out.println("Popped element: "
							+ stack.pop());
			

		
			System.out.println("Stack after pop operation "
							+ stack);
		
	}

	}


