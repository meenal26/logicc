package guvi;

public class palindro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b,sum=0,a;    
		  int n=56;		  
		  a=n; 
		  while(n>0){    
		   b=n%10; 
		   sum=(sum*10)+b;    
		   n=n/10;    
		  }    
		  if(a==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
		

	}

