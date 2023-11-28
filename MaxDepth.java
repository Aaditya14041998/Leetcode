package dsa;

public class MaxDepth {

	public static void main(String[] args) {

		// Test cases
		System.out.println(maxDepth("(1+(2*3)+((8)/4))+1")); // Output: 3
		//System.out.println(maxDepth("(1)+((2))+(((3)))")); // Output: 3
	}

	private static int maxDepth(String s) {

		int maxDepth = 0;
		int currentDepth = 0;
		for (int element : s.toCharArray()) {
			if (element == '(') {
				currentDepth++;
				maxDepth = Math.max(maxDepth, currentDepth);
			} else if (element == ')') {
				currentDepth--;
			}
		}

		return maxDepth;
	}

}
