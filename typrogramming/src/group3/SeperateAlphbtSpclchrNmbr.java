package group3;

public class SeperateAlphbtSpclchrNmbr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="$@bhishek07!!";
		String num="";
		String alp="";
		String spcl="";
		/*for (int i = s.length()-1; i>=0; i--) {
			if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
				num=s.charAt(i)+num;
			}
			else if(s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='A'&&s.charAt(i)<='Z')
			{
				alp=s.charAt(i)+alp;
			}
			else {
				spcl=s.charAt(i)+spcl;
			}
		}*/
		
		for (int i = s.length()-1; i>=0; i--) {
			if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
				num=s.charAt(i)+num;
			}
			else if(s.charAt(i)>=97&&s.charAt(i)<=122||s.charAt(i)>=65&&s.charAt(i)<=90)
			{
				alp=s.charAt(i)+alp;
			}
			else {
				spcl=s.charAt(i)+spcl;
			}
		}
		System.out.println("Alphabets= "+alp);
		System.out.println("nubmers= "+num);
		System.out.println("special char= "+spcl);
	}

}
