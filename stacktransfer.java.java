package example;

import java.util.Stack;

public class stacktransfer {

	public static Stack<String> S = new Stack<String>();
	public static Stack<String> T = new Stack<String>();
	
	public static void transfer(Stack<String> S, Stack<String> T) {
		while(S.size() != 0)
			T.push(S.pop());
	}

	public static void main(String[] args) {

		S.push("4");
		S.push("3");
		S.push("2");
		S.push("1");
		
		System.out.println("Original Stack: ");
		
		System.out.println(S);
		
		transfer(S, T);
		
		System.out.println("Transfer Stack: ");
		
		System.out.println(T);
	}

}
 