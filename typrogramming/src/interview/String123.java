package interview;

public class String123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=123;
		String s=Integer.toString(a);
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i));
		}
		System.out.print(" ");
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i)+""+s.charAt(i));
		}
		System.out.print(" ");
			for (int i = 0; i < s.length(); i++) {
				System.out.print(s.charAt(i)+""+s.charAt(i)+""+s.charAt(i));
			}
		
	}

}
