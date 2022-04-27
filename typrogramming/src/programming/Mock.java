package programming;

public class Mock {
public static String reverse(String word) {
		String s1="";
		String s2=word;
		for (int i = s2.length()-1; i >=0; i--) {
			s1=s2.charAt(i)+s1;
			
		}
		return s1;

  }	
public static void main(String[] args) {
	
	String s="Testing is not easy";
	String[] s2=s.split(" ");
	String s1="";
	for(int i=0;i<s2.length;i++)
	{
		System.out.println(s2[i]);
		s1=reverse(s2[i]);
	}
	System.out.println(s1);
}
}
