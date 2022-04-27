package group1;

import java.util.LinkedHashSet;

public class RmoveDuplicateCharFrmString {

	public static void main(String[] args) {
		
		String s="hello";
		//step1:read each char from string and store it set 
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		//step2:compare each char of set with each char of string
		for (Character ch : set) {
			System.out.print(ch);
		}
	}

}
