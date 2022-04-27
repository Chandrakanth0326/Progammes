package group2;

public class ReveseWordsOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="welcome to india welcome to mandya";
		String[] s = s1.split(" ");
		for (int i = s.length-1; i >=0; i--) {
			System.out.print(s[i]+" ");
		}

	}

}
