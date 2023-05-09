package logicpgm;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello";
		String s2="";
		for(int i=2;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		if(s1.equals(s2))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}

}
