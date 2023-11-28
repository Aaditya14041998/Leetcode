package dsa;

import java.util.Stack;

public class minOperations {

	public static void main(String[] args) {

		// Test cases
		System.out.println(minOperations(new String[] { "d1/", "d2/", "../", "d21/", "./" })); // Output: 2
//		System.out.println(minOperations(new String[] { "d1/", "d2/", "./", "d3/", "../", "d31/" })); // Output:
//																										// 3
//		System.out.println(minOperations(new String[] { "d1/", "../", "../", "../" })); // Output: 0
	}

	private static int minOperations(String[] s) {
		int depth = 0;
		int maxDepth = 0;

		Stack<String> stack = new Stack<>();

		for (String element : s) {
			if (element.equals("../")) {
				if (!stack.isEmpty()) {
					stack.pop();
					}
			}
				else if (!element.equals("./")) {
					stack.push(element);
				}
			}

		

		return stack.size();
	}

}
