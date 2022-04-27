package group2;

import java.util.LinkedHashSet;

public class NoOfOccurrenceOfEachWord {

	public static void main(String[] args) {
		
		String s="welcome to india welcome to mandya";
		//step1:read each word from string and store it set 
		String[] s1 = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < s1.length; i++) {
			set.add(s1[i]);
		}
		//step2:compare each word of set with each word of string array
		
		for (String word : set) {
			int count=0;
			for (int i = 0; i < s1.length; i++) {
				if(word.equalsIgnoreCase(s1[i]))
				{
					//step3:if words are matching increase the count
					count++;
				}
			}
			//step 4:print the word along with the no of occurrence 
			
			System.out.println(word+" "+count);
			
		}
	}

}
