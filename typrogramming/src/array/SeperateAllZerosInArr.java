package array;

public class SeperateAllZerosInArr {

	public static void main(String[] args) {
		//int a[]= {3,0,0,1,0,2,0,0};
		//int b[]=new int[a.length];
	//	int m=0,n=b.length-1;
	/*	for (int i = 0; i < b.length; i++) {
			if(a[i]==0)
			{
				b[n]=a[i];
				n--;
			}
			else
			{
				b[m]=a[i];
				m++;
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
		*/
		
		
		int a[]= {3,0,0,1,0,2,0,0};
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=0)
			{
				System.out.print(a[i]+" ");
			}
		}
		
			for (int j = 0; j < a.length; j++) {
				if(a[j]==0)
				{
					System.out.print(a[j]+" ");
				}
			
		}
		
	}

}
