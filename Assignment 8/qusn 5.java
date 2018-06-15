import java.util.Scanner;
class SubString
{
  public static void main (String[] args)
  {
    String str , str1;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string:");
	str = sc.nextLine();
	System.out.println("Enter a substring:");
	str1 = sc.nextLine();
    int n = str.indexOf(str1);
	if(n == -1)
		System.out.println("Substring not found");
	else
		System.out.println("Substring found");
  }
}
