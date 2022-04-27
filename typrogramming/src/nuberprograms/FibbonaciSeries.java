package nuberprograms;

public class FibbonaciSeries {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		//System.out.println(a);
		//System.out.println(b);
		for (int i = 0; i <=b; i++) {
			
			int c=a+b;
			if(c<25) {
			System.out.println(c);		
			a=b;
			b=c;
			}
			else {
				break;
			}
		}
	}

}
