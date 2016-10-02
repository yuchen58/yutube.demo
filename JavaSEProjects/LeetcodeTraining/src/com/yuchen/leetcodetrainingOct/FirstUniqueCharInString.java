package com.yuchen.leetcodetrainingOct;
/*
 * alphabet method can solve this problem easily
 */
import java.util.HashSet;

public class FirstUniqueCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "loveleetcode";
		System.out.println(firstUniqChar(test));
	}

	public static int firstUniqChar(String s){
		int result = -1;
		int[] alphabet = new int[26];
		for(int i =0;i<s.length();i++){
			alphabet[s.charAt(i)-'a'] ++;
		}
		for(int j =0;j<s.length();j++){
			if(alphabet[s.charAt(j)-'a'] == 1){
				result = j;
				break;
			}
		}
		return result;
	}
}
