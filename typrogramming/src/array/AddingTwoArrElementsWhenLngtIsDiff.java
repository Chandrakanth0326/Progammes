package array;

public class AddingTwoArrElementsWhenLngtIsDiff {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,9,7};
		int b[]= {4,5,6,7,4,2};
		int count=a.length;
		if(b.length>count)
		{
			count=b.length;			
		}
		for (int i = 0; i < count; i++) {
			try
			{
				System.out.println(a[i]+b[i]);
			}
			catch (Exception e) {
				if(a.length>b.length)
				{
					System.out.println(a[i]);
				}
				else
				{
					System.out.println(b[i]);
				}
			}			
		}
	}

}
