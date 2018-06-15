import java.util.Scanner;

class Vowels
{
	private static void remove(String s)
	{
		String a = "";
		int i , j;

		for(i=0; i<s.length(); i++)
		{
			j = check(s.charAt(i));
			if (j == 0)
			{
				a = a + s.charAt(i);
			}
		}
		System.out.println("After removing Vowels:");
		System.out.println(a);
	}

   public static int check(char c)
   {
    switch (c)
	{
		case 'a':
			return 1;
		case 'e':
			return 1;
		case 'i':
			return 1;
		case 'o':
			return 1;
		case 'u':
			return 1;
		case 'A':
			return 1;
		case 'E':
			return 1;
		case 'I':
			return 1;
		case 'O':
			return 1;
		case 'U':
			return 1;
	}
	return 0;
   }
   
   public static void main(String args[])
   {
	String str, r;
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter a String: ");
	str = scan.nextLine();
	remove(str);
   }
}
