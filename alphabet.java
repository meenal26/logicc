package alphabet;
import java.util.Scanner;
public class alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner s=new Scanner(System.in);
		ch=s.next().charAt(0);
		System.out.println("enter the alphabet");
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		{
			System.out.println(ch+"is an alphabet");
		}
		else
		{
			System.out.println(ch+"is not an alphabet");
		}
	}
}

