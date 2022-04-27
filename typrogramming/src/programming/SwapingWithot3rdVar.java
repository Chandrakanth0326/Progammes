package programming;

public class SwapingWithot3rdVar {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		a=a+b;//a=10+20=30, b=20
		b=a-b;//b=30-20=10, a=30
		a=a-b;//a=30-10=10, b=10
		System.out.println("a="+a+" "+"b="+b);

	}

}
