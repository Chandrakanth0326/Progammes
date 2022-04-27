package assignment;

public class CountVowelsInStr {

	public static void main(String[] args) {

		String s="apple banana";
		String[] s1 = s.split(" ");
		
		for (int i = 0; i < s1.length; i++) {
			int count=0;			
			String ss=s1[i];
			
			for (int j = 0; j < ss.length(); j++) {	
				
				char a=ss.charAt(j);
				
				if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u') {
					//System.out.println(s1[i].charAt(i));
					count++;
				}
			}
			System.out.println(s1[i]+" = "+count);
		}
	}

}
