package programming;

public class PrintWordWhichContainsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str= {"Test","MyTester","IsteSTing","India","Delhi","Test","SmartTEst"};
		for (String s : str) {
			s=s.toLowerCase();
			if(s.contains("test")) {
				System.out.println(s);
			}
			
		}
	}

}
