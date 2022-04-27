package programming;

public class StringIsPalidromeOrNot {

	public static void main(String[] args) {
		String s="APPA";
		String dup="";
		for (int i = s.length()-1; i >=0; i--) {
			dup=dup+s.charAt(i);
		}
		
		if(dup.equals(s))
		{
			System.out.println("string is palindrome");
		}
		else
		{
			System.out.println("string is not palindrome");
		}
	}

}
