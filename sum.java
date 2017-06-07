package sum;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int sum=0;
		n=n*(n+1)/2;
		 for (int i = 0; i <= n; i++) {
	            sum = sum + i;// calculate sum of i
	            System.out.println("sum:" + sum);// display the vslue of sum
	        }
	    }
}
