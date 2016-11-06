package com.ameya;

public class Q1B {
	public static void main(String[] args) {
		String str1 = "abcd";
		String str2 = "dbac";
		
		System.out.println(isPermutation(str1, str2));
	}
	
/*
	Method1: Create an int array to check the presence of that character
	Time: O(n) Space: O(1)
*/
	public static boolean isPermutation(String str1, String str2) {

		char[] chars1 = str1.toCharArray();
		char[] chars2 = str2.toCharArray();
		
		int[] arr = new int[128];
		
		for (char c: chars1) {
			arr[c]++;
		}
		
		for (int i = 0; i < chars2.length-1; i++) {
			int x = (int) chars2[i];
			
			arr[x]--;
			if (arr[x]<0) {
				return false;
			}
		}
		return true;
	}

/*
	Method1: Sort and then check each letter
*/
	
}
