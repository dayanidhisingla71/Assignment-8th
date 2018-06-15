import java.util.Scanner;
class SubString
{
	public static void main(String args [])
	{
		String str = "xyz";
		/*Scanner sc = new Scanner(System.in);
		str=sc.next();*/
		int length = str.length();
		int i , j;
		String sub = "";
		for (i = 0; i <= length; i++)
		{
			for(j = 1; j <= length - i; j++)
			{
				sub = str.substring(i, i+j);
				System.out.println(sub);
			}
		}
	}
}