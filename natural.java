package natural;
import java.util.Scanner;
public class natural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub55
		int x = 0,i=1;
		int sum=0;
		Scanner s=new Scanner(System.in);
		x=s.nextInt();
		System.out.println("enter the number");
		while(i<=x)
		{
			sum=sum+i;	
	         i++;
		} 		
   System.out.println("Sum of "+x+" numbers is :"+sum);
	}

}
