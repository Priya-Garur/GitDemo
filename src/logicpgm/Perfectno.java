package logicpgm;

public class Perfectno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int no=4;
int sum=0;
for(int i=1;i<no;i++)
{
	if(no%i==0)
	{
		sum=sum+i;
	}
}
if(no==sum)
{
System.out.println("perfect number");	
}
else {
	System.out.println("not a perfect number");
}
	}

}
