package assignment;

public class PrintName100TimesWithotLoop {
	public static void printName(int count)
	{
		if(count<101) {
			
			System.out.println(count+". Abhishek");		
			printName(count+1);
		}		
	}
	public static void main(String[] args) {
		printName(1);
	}
}
