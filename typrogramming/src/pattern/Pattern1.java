package pattern;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5,a=0;
		for (int i = n; i >=0; i--) {
			for (int j = 1; j < i+1; j++) {
				System.out.print(i);
				a++;
				if(a>9)
					a=0;
			}
			System.out.println();
		}
	}

}
