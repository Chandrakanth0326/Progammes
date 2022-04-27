package assignment;

public class SumOfEachDigit {

	public static void main(String[] args) {
		int num=1234,num1=num;
		int a,sum=0;
		while(num>0)
		{
			a=num%10;
			sum=a+sum;
			num=num/10;
		}
		System.out.println("The sum of digits of given number "+num1+"="+sum);
	}

}
