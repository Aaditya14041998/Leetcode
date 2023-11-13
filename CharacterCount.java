package com.demo;

public class CharacterCount {

	public static void main(String[] args) {
		String s = "HELLO AADITYA";
		int count = CharacterCount(s);
		System.out.println(count);
	}

	private static int CharacterCount(String s) {
		String str = s.trim();
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(str.charAt(i)!=' ') {
				count++;
			}
		}
		return count;
	}
}
