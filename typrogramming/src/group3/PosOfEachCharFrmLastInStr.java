package group3;

import java.util.HashSet;

public class PosOfEachCharFrmLastInStr {

	public static void main(String[] args) {
	
		String s="Tester";
		s=s.toLowerCase();
		//step1:read each char from string and store it set 
		HashSet<Character> set = new HashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		//step2:compare each char of set with each char of string
		for (Character ch : set) {
		
			for (int i = s.length()-1; i >=0; i--) {
				if(ch==s.charAt(i))
				{
					//step3:if char are matching increase the count
					//a=i+1;
					System.out.println(ch+" "+(i+1));
					break;
				}

			}

		}

	}

}
