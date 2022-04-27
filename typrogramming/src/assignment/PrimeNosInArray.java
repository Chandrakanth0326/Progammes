package assignment;

public class PrimeNosInArray {

	public static void main(String[] args) {

		int a[]= {4,2,7,6,11,9,8,13};
		int n=0;
		for (int i = 0; i < a.length; i++) {
			n=a[i];
			int count=0;
			for (int j = 1; j <=n; j++) {
				if(n%j==0)
				{
					count++;					
				}				
			}
			if(count==2)
			{
				System.out.println(n);
			}			
		}		
	}
}
