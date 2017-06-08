package guvi;
import java.util.Scanner;
public class guvi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	char c;
	Scanner s=new Scanner(System.in);
	System.out.println("enter an alphabet");
	 c =s.next().charAt(0);
	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
	{
	System.out.println(c+"it is a vowel");
	}
	else
	{
    System.out.println(c+"it is a consonant");
	}
	}
}
		
	


