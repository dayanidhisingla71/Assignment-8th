/Substrings of a String
import java.util.Scanner;
public class Substring_1 {
  Scanner s=new Scanner(System.in);
  String s1=s.next();int i=0;
  void run() {
  while( i<s1.length()) {
	  System.out.println(s1.charAt(i));
	  i++;
  }
  for(i=0;i<s1.length();i++)

	  for(int j=0;j<s1.length();j++) {
		  System.out.print(s1.charAt(i));
		  System.out.println(s1.charAt(j));}
	  }
  void full() {
	  System.out.println(s1.substring(0,s1.length()));}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Substring_1 s=new Substring_1();
  s.run();s.full();
	}

}
