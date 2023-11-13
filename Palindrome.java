package com.demo;

public class Palindrome {

	public static void main(String[] args) {
		String str = "LEVEL";
		boolean result = IsPalindrome(str);
		System.out.println(result);
	}

	private static boolean IsPalindrome(String str) {
		int left = 0;
		int right = str.length()-1;
		
		while(left<right) {
			if(str.charAt(left)!=str.charAt(right)) {
				return false;
			}
			left++;
			right--;
			}
		return true;
	}

}
