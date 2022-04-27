package group2;

import java.util.LinkedHashSet;

public class PrintUniqueWords {

	public static void main(String[] args) {
		
		String s="welcome to india welcome to mandya";
		//step1:read each char from string and store it set 
		String[] s1 = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < s1.length; i++) {
			set.add(s1[i]);
		}
		//step2:compare each char of set with each char of string
		
		for (String ch : set) {
			int count=0;
			for (int i = 0; i < s1.length; i++) {
				if(ch.equalsIgnoreCase(s1[i]))
				{
					//step3:if char are matching increase the count
					count++;
				}
			}
			//step 4:print the char along with the no of occurance 
			if(count==1)
			{
			System.out.print(ch+" ");
			}
			
		}
	}

}
