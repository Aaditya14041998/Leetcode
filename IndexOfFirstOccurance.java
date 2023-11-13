package com.demo;

public class IndexOfFirstOccurance {

	public static void main(String[] args) {
		String haystack = "butsaad";
		String needle = "sad";
		int result = strStr(haystack,needle);
		System.out.println(result);

	}

	private static int strStr(String haystack, String needle) {
		if(haystack.length()<needle.length()) 
			return -1;
		
		
	for(int i=0;i<=haystack.length()-needle.length();i++) {
		if(haystack.charAt(i) == needle.charAt(0)) {
	if(	haystack.substring(i,i+needle.length()).equals(needle)){
			return i;	
			}
			}
		}
			return -1;
	}
}
