package group1;

import java.util.LinkedHashSet;

public class CompInputOutput {

	public static void main(String[] args) {
		
		String s="hello";//output="helo"
		//step1:read each char from string and store it set 
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		//step2:compare each char of set with each char of string
		for (Character ch : set) {
			int count=0;
			for (int i = 0; i < s.length(); i++) {
				if(ch==s.charAt(i))
				{
					//step3:if char are matching increase the count
					count++;
					break;
				}
			}
			
			//step 4:print the char along with the no of occurance 
			if(count==1)
			{
			System.out.print(ch);
			}
		}
		System.out.println(set);

	}

}
