package programming;

public class RevWithotLengthMet {

	public static void main(String[] args) {
		String s="tyss";
		char[] ch = s.toCharArray();
		int count=0;
		
		for (char c : ch) {
			count++;
		}
		System.out.println(count+"  "+s.length());
		for (int i = count-1; i >=0; i--) {
			System.out.print(ch[i]);
		}

	}

}
