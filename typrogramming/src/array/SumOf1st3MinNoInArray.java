package array;

public class SumOf1st3MinNoInArray {

	public static void main(String[] args) {
		
		int[] a= {1,4,6,3,9};
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			if(i<3)
			{
				sum=a[i]+sum;				
			}			
		}
		System.out.println("the sum of first 3 max no is "+sum);
	}

}
