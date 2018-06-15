import java.util.Scanner;

class Pattern
{
	public static void main(String args [])
	{
		int n , i ,j;
		char c = 97;
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(i = 1 ; i <= n ; i++)
		{
			c = 97;
			for(j = 0 ; j < i ; j++)
			{
				System.out.print(c++);
			}
			System.out.println("");
		}
	}
}