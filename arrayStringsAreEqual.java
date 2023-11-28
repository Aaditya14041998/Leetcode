package dsa;

public class arrayStringsAreEqual {

	public static void main(String[] args) {
		// Example 1
//		String[] word1 = { "ab", "c" };
//		String[] word2 = { "a", "bc" };
//		System.out.println(arrayStringsAreEqual(word1, word2)); // Output: true
//
//		// Example 2
//		String[] word3 = { "a", "cb" };
//		String[] word4 = { "ab", "c" };
//		System.out.println(arrayStringsAreEqual(word3, word4)); // Output: false

		// Example 3
		String[] word5 = { "abc", "d", "defg" };
		String[] word6 = { "abcddefg" };
		System.out.println(arrayStringsAreEqual(word5, word6)); // Output: true
	}

	private static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();

		for (String word : word1) {
			sb1.append(word);
		}
		for (String word : word2) {
			sb2.append(word);
		}

		return sb1.toString().equals(sb2.toString());

	}

}
