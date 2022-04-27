package assignment;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class CountVowelsWithoutDuplicate {

	public static void main(String[] args) {
		
		String s="welcome";
		int count=0;
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		for(Character str:set) {
			
			
			for (int j = 0; j < s.length(); j++) {						
				
				if(str=='a'||str=='e'||str=='i'||str=='o'||str=='u') {
					//System.out.println(s1[i].charAt(i));
					count++;
					break;
				}
			}
				System.out.print(str);
				
			}
		System.out.print(" "+count);
		/*String s="apple banana";
		String[] s1 = s.split(" ");
		HashSet set = new HashSet<>();
		for (int i = 0; i < s1.length; i++) {
			set.add(s1[i]);
		}
		for (Object obj : set) {
			String ss=(String) obj;
			int count=0;
			for (int j = 0; j < ss.length(); j++) {	
				
				char a=ss.charAt(j);
				
				if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u') {
					//System.out.println(s1[i].charAt(i));
					count++;
				}
			}
			System.out.println(obj+" = "+count);
		}*/
			
		}
	
}


