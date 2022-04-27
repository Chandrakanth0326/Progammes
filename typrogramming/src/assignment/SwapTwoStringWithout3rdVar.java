package assignment;

public class SwapTwoStringWithout3rdVar {

	public static void main(String[] args) {
		String s1="java";
		String s2="python";
		System.out.println("Before executing s1= "+s1+" "+"s2="+s2);
		s1=s1+s2;
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println("After executing s1="+s1+" "+"s2="+s2);

	}

}
