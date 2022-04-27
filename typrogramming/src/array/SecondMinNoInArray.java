package array;

public class SecondMinNoInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,4,6,3,9};
		int smin=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("second min "+a[1]);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			if(i==a.length-2)
			{
				smin=a[i];				
			}			
		}
		System.out.println("the second min no is "+smin);

	}

}
