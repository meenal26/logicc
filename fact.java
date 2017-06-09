package guvi;
import java.util.Scanner;
public class fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	         int count = 15;
	         int[] c = new int[count];
	         c[0] = 0;
	         c[1] = 1;
	         for(int i=2; i < count; i++){
	             c[i] = c[i-1] + c[i-2];
	         }
	 
	         for(int i=0; i< count; i++){
	                 System.out.print(c[i] + " ");
	         }
	    }
	}