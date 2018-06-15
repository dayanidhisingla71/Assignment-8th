import java.util.Scanner;
class Count
{
    static int i,c=0,res;
    
    public static void total(String s)
    {
        for(i=0,c=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            //if((ch >= 65 && ch <= 90)|| (ch >= 97 && ch <= 122))   Number of Characters
			if(s.charAt(i)==' ')   //Number of Words
            c++;
        }
		c++;
        System.out.println("The number of words in the String are:  "+c);
    }
    
    public static void main (String args[])
    {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Enter a string:");
		str = sc.nextLine();
        Count.total(str);
    }
}
