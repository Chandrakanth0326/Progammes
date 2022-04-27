package assignment;

public class NoOfOccuranceOfCharInString {

	public static void main(String[] args) {
		String s="nntttrrrraaaaa";
		int n=0,t=0,r=0,a=0;
		for (int i = 0; i <s.length(); i++) {
			if(s.charAt(i)=='n') {
				n++;
			}
			if(s.charAt(i)=='a') {
				a++;
			}
			if(s.charAt(i)=='r')
			{
				r++;
			}
			if(s.charAt(i)=='t')
			{
				t++;

			}
		}
		System.out.println(n);
		System.out.println("n-occurance="+n+" t-occurance="+t+" r-occurance="+r+" a-occurance="+a);
	}

}
