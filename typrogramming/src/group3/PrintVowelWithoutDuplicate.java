package group3;

import java.util.HashSet;

public class PrintVowelWithoutDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="India";
		s=s.toLowerCase();
		HashSet<Character> set = new HashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
			
		}
		for (Character ch : set) {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				System.out.println(ch);
			}
		}
	}

}
