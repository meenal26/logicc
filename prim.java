package wipros;
import java.util.Scanner;
public class prim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;int flag=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		a=s.nextInt(); 
		for(int i=2;i<a;i++){
			if(a%i==0){
				flag=2;
		}
		if(flag==2){
			System.out.println("it is not a prime number");
		}else
			{
				System.out.println("it is a prime number");
			}
		}
	}
}
			


