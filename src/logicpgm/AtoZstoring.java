package logicpgm;
//storing array
public class AtoZstoring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char[]arr=new char[26];
int i=0;
for(char ch='A';ch<='Z';ch++)
{
arr[i]=ch;
i++;
}
for(int j=0;j<arr.length;j++)
{
	System.out.println(arr[j]);
}
	}

}
