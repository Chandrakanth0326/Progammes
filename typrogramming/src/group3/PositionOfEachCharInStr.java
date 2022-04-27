package group3;

import java.util.HashSet;

public class PositionOfEachCharInStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*	String s="chair";
		int c=0,h=0,a=0,I=0,r=0;
		for (int j = 0; j <s.length(); j++) {
			if(s.charAt(j)=='c') {
				c=j+1;
				System.out.println("cth position is "+c);
			}
			if(s.charAt(j)=='i') {
				I=j+1;
				System.out.println("ith position is "+I);
			}
			if(s.charAt(j)=='r') {
				r=j+1;
				System.out.println("rth position is "+r);
			}
			if(s.charAt(j)=='a') {
				a=j+1;
				System.out.println("ath position is "+a);
			}
			if(s.charAt(j)=='h') {
				h=j+1;
				System.out.println("hth position is "+h);
			}
		}
		 */
		String s="Tester";
		s=s.toLowerCase();
		//step1:read each char from string and store it set 
		HashSet<Character> set = new HashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		//step2:compare each char of set with each char of string
		for (Character ch : set) {
		
			for (int i = 0; i < s.length(); i++) {
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
