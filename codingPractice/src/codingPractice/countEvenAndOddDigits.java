package codingPractice;

public class countEvenAndOddDigits {
	public static void main(String[] args) {
		int n=1235;
		int ecount=0;
		int oCount=0;
		while (n>0) {
			int rem=n%10;
			if (rem%2==0) {
				ecount++;
			}
			else {
				oCount++;
			}
			n=n/10;
		}
		System.out.println("Even no count is "+ecount+" Odd no count is "+oCount);
	}

}
