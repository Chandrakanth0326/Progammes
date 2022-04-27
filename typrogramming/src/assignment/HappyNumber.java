package assignment;

public class HappyNumber {

	public static void main(String[] args) {
		
		int num=31;
		int n=num,sum=0;
		while(n>9) {
		while(n>0)
		{
			int a;
			a=n%10;
			sum=(a*a)+sum;
			n=n/10;
			System.out.println(sum);
		}				
			n=sum;
			sum=0;	
		}
		 if (n == 1)
	        {
	            System.out.println("Happy Number");
	        }
	        else
	        {
	            System.out.println("Not Happy Number");
	        }
		
		
		/*int n=130, r = 1, num, sum = 0;
        
        num = n;
        while (num > 9)
        {
            while (num > 0)
            {
                r = num % 10;
                sum = sum + (r * r);
                num = num / 10;
            }
            num = sum;
            sum = 0;
        }
        if (num == 1)
        {
            System.out.println("Happy Number");
        }
        else
        {
            System.out.println("Not Happy Number");
        }*/
	}

}
