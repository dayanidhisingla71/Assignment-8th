import java.util.Scanner;
 
class Reverse
{
    public static void main(String[] args)
    {
        System.out.println("Enter string to reverse:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev = "";
		int n = str.length() - 1;
        for(int i = n; i >= 0; i--)
        {
            rev = rev + str.charAt(i);
        }
        System.out.println("Reversed string is: "+rev);
    }
}

//REVERSE STRING WORD BY WORD

/*
import java.util.Scanner;
class Reverse
{
	public static void rev(String str , int n)
	{
		String b = "" , c = "";
		for(int i = 0 ; i <n ; i++)
		{
			if(str.charAt(i)!=32)
			b = b + str.charAt(i);
			else
			{
				c = b + " "+c;
				b = "";
			}
		}
		c = b+" "+c;
		System.out.println(c);
	}
	
	public static void main(String args [])
	{
		String a;
		Scanner sc = new Scanner(System.in);
		a = sc.nextLine();
		
		int n = a.length();
		rev(a,n);
	}
}
*/
