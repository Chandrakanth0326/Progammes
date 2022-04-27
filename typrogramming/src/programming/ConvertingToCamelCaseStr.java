package programming;

public class ConvertingToCamelCaseStr {

	public static void main(String[] args) {
		
	/*	String s="welcome to tyss";
		char a=(char) (s.charAt(0)-32);
		System.out.print(a);
		for (int i = 1; i < s.length(); i++) {
			if(s.charAt(i)==' ')
			{
				System.out.print(" "+(char)(s.charAt(i+1)-32));
				i++;
			}
			else {
			System.out.print(s.charAt(i));
			}
		}
		*/
		String s="welcome to tyss";
		char a=(char) (s.charAt(0)-32);
		System.out.print(a);
		for (int i = 1; i < s.length(); i++) {
			if(s.charAt(i)==' ')
			{
				i++;
				System.out.print(" "+(char)(s.charAt(i)-32));
				
			}
			else {
			System.out.print(s.charAt(i));
			}
		}
		
	
	}

}
