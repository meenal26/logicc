package guvi;
import java.util.Scanner;
public class somvar {

	public static void main(String[] args) {
		String s1;
		System.out.println("enter the string to be checked:");
		Scanner sc=new Scanner(System.in);
		s1=sc.next();
		String s[]={"Monday","Tuesday","Wednesday","Thurday","Friday","Saturday"};
		for(int i=0;i<2;i++){
			if((s[i].compareToIgnoreCase(s1))==0){
				System.out.println("TRUE");
			}
		}
	}
}

	

	

