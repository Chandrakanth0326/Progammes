package array;

public class SecondMaxNoInArray {

	public static void main(String[] args) {
		
		int[] a= {1,4,6,3,9};
		int smax=0;
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
			if(i==a.length-2)
			{
				smax=a[i];				
			}			
		}
		System.out.println("the second max no is "+smax);	
	}

}
