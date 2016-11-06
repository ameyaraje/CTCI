

package com.ameya;

import java.util.HashSet;
import java.util.Set;

public class Q1A {
	public static void main(String[] args) {
		String str = "amey";
		boolean answer = checkUnique(str);
		boolean answer2 = checkUnique2(str);

		System.out.println("Answer is " + answer);
		System.out.println("Answer from method2 is " + answer2);
	}
	
/*
	Method 1: Pretty obvious, use a hashset; add all characters to it, if repeated, return false
	Time: O(n) Space: O(n)
*/

	public static boolean checkUnique(String str) {
		Set<Character> set = new HashSet<Character>();
		char[] strChars = str.toCharArray();
		
		for (int i = 0; i <= strChars.length-1; i++) {
			if (set.contains(strChars[i])) {
				return false;
			}
			else
				set.add(strChars[i]);
		}
		return true;
	}

/*
	Method 2: Using no data structure; For each character, check all next characters and return false if 
	encountered again
	Time: O(n^2) Space: O(1)
*/

	public static boolean checkUnique2(String str) {
		char[] strChars = str.toCharArray();
		
		for (int i = 0; i < strChars.length; i++) {
			for (int j = i+1; j < strChars.length; j++) {
				if (strChars[i] == strChars[j])
					return false;
			}
		}
		return true;
	}

/*
	Method 3: As suggested by CTCI; Use a boolean array to check the status of discovery
	Time: O(n) Space:O(1)
*/
	
	public static boolean checkUnique3 (String str) {
		boolean[] chars = new boolean[128];
		
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (chars[val])
				return false; 
			chars[val] = true;
		}
		return true;
	}	
}

