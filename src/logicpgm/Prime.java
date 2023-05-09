package logicpgm;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int no=5;
boolean flags=false;
for(int i=2;i<no;i++)
{//condition for non prime number
	if(no%i==0)
	{
		flags=true;
		break;
		
	}
}
if(flags==false)
{
	System.out.println("prime number");
}
else {
	System.out.println("not prime number");
}
	}

}
