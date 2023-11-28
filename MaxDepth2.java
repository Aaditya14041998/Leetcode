package dsa;

import java.util.Stack;

public class MaxDepth2 {

	public static void main(String[] args) {

		System.out.println(maxDepth("(1+(2*3)+(((8))/4))+1")); // Output: 4
		// System.out.println(maxDepth("(1)+((2))+(((3)))")); // Output: 3
	}

	private static int maxDepth(String s) {

		int depth = 0;
		int maxDepth = 0;

		Stack<Character> stack = new Stack<>();
		char[] ch = s.toCharArray();
		for (char element : ch) {
			char c = element;
			if (c == '(')
				stack.push('(');
			else if (c == ')')
				stack.pop();

			depth = stack.size();
			maxDepth = Math.max(maxDepth, depth);
		}

		return maxDepth;
	}

}
