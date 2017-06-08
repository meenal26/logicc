package guvi;

import java.util.Scanner;

public class digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter any Number: ");
		int a=sc.nextInt();
		int Number;
		int Count=0;
		Number = sc.nextInt();
		while(Number > 0) {
			Number = Number / 10;
			Count = Count + 1; 
		}
		System.out.format("\n Number of Digits in a Given Number = %d", Count);
	}
}
   