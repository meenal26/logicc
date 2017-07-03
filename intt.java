package guvi;
import java.util.Scanner;
public class intt {

	public static void main(String[] args) {
		int reversenum=0;
		int num=0;
		System.out.println("enter the number to be reversed and press enter:");
		Scanner sc=new Scanner (System.in);
		num=sc.nextInt();
		while(num!=0)
		{
        reversenum=reversenum*10;
        reversenum=reversenum+num%10;
        num=num/10;
      	}
		 System.out.println("the reversed number is:"+reversenum);

}
}
