package group2;

import java.util.LinkedHashSet;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		
		String s="welcome to india welcome to mandya";
		//step1:read each word from string and store it set 
		String[] s1 = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < s1.length; i++) {
			set.add(s1[i]);
		}
		
		
		for (String word : set) {
			System.out.print(word+" ");
			
				}		
	}

}
