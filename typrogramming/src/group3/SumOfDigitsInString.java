package group3;

public class SumOfDigitsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="bh1js8a9";
		int sum=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='0'&&s.charAt(i)<='9')
			{
				int n = s.charAt(i)-48;
				//int n=(int)s.charAt(i);
				sum=n+sum;	
			}
		}
		System.out.println(sum);
	}

}
