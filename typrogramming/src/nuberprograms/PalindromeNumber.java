package nuberprograms;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num=1001;
		int num1=num,a,pal=0;
		while(num>0) {
			a=num%10;
			pal=a+pal*10;
			num=num/10;
		}
		System.out.println(pal);
		if(pal==num1)
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("number is not palindrome");
		}
	}

}
