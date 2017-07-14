package guvi;

import java.util.Scanner;

public class last {
	public static void main(String[] args) {
		int n,sum=0;
		int b[] = new int[100];
		int s[]=new int[100];
		int num=0,a;
		int m=0;
		Scanner ac=new Scanner(System.in);
		n=ac.nextInt();
		while(n>0){
			a=n%10;
			b[num]=a;
			n=n/10;
			num++;
		}
		for(int i=num-1;i>=0;i--){
			s[i]=m+b[i];
			m=s[i];
		}
		for(int i=num-1;i>=0;i--){
					sum=sum+s[i];
		}System.out.println("sum "+sum);
	}
	}

