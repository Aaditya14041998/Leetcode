package dsa;

import java.util.HashMap;
import java.util.Map;

public class MaxLengthBetweenEqualCharacter {

	public static void main(String[] args) {
		// System.out.println(maxLengthBetweenEqualCharacters("aa")); // Output: 0
		// System.out.println(maxLengthBetweenEqualCharacters("abca")); // Output: 2
		System.out.println(maxLengthBetweenEqualCharacters("cbzxy")); // Output: -1
	}

	private static int maxLengthBetweenEqualCharacters(String s) {

		Map<Character, Integer> hp = new HashMap<>();

		int maxLength = -1;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (!hp.containsKey(ch)) {
				hp.put(ch, i);
			} else {
				maxLength = Math.max(maxLength, i - hp.get(ch) - 1);
			}
		}
		return maxLength;

	}

}
