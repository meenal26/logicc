package guvi;
import java.util.Scanner;
public class reversvowel {

	public static void main(String[] args) {
		String s;
		String s1;
		String s2;
		Scanner a=new Scanner(System.in);
	     s=a.next();
	     s1=new StringBuffer(s).reverse().toString();
	     System.out.println(s1);
	     s2=s.replaceAll("[aeiouAEIOU]","");
		 System.out.println(s2);
		 a.close();
		 }

}
