package alphabet;
import java.util.Scanner;
public class leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the year");
int year=0;
 year=s.nextInt();
if(year%4==0)
{
	System.out.println("it is an leap year");
}
else
{
System.out.println("it is not an leap year");
}
	}
}

