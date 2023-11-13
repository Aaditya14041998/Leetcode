package com.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LengthOfLongestSubString {

	public static void main(String[] args) {
		String input ="abcbcbb";
		//String input ="bbb";
		int result = LengthLongest(input);
		System.out.println(result);

	}

	private static int LengthLongest(String s) {
		int max_length = Integer.MIN_VALUE;
		int start = 0;
		int end = 0;
	List<Character> list = new ArrayList<>();
		
		while(end<s.length())
		{
			if(!list.contains(s.charAt(end))) {
				list.add(s.charAt(end));
				end++;
				max_length = Math.max(max_length,list.size());
			}
			
			else {
				list.remove(Character.valueOf(s.charAt(start)));
				start++;
			}
		}	
	
	return max_length;
	}
}