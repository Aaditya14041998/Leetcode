package dsa;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {

	public static void main(String[] args) {
		String s = "badc";
		String t = "kikp";
		boolean result = isIsomorphic(s, t);
		System.out.println(result);

	}

	private static boolean isIsomorphic(String s, String t) {

		if (s.length() != t.length()) {
			return false;
		}

		Map<Character, Character> hs = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {

			char original = s.charAt(i);
			char replacement = t.charAt(i);

			if (!hs.containsKey(original)) {
				if (!hs.containsValue(replacement)) {
					hs.put(original, replacement);
				} else {
					return false;
				}
			} else {
				char mappedChar = hs.get(original);
				if (mappedChar != replacement)
					return false;
			}
		}

		return true;
	}

}
