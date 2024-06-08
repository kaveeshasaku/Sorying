package DataStructures;

import java.util.Stack;

public class StackPeek {
	
	

	
	    public static void main(String[] args) {
	        Stack<String> stack= new Stack<>();

	        
	        stack.push("78");
	        stack.push("69");
	        stack.push("50");
	        stack.push("35");
	        System.out.println("Stack: " + stack);

	        
	        String element = stack.peek();
	        System.out.println("Element at top: " + element);

	    }
	}


