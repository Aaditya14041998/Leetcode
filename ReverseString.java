package com.demo;

public class ReverseString {

	public static void main(String[] args) {
		String s = "the sky is blue";
		String result = ReverseString(s);
		System.out.println(result);
		 }

	private static String ReverseString(String s) {
		String [] words = s.split( " +");
		StringBuilder sb = new StringBuilder();
		
		for(int i=words.length-1;i>=0;i--) {
			sb.append(words[i]);
			sb.append(" ");
		}
		return sb.toString().trim();	
	}	
}