package number;

public class countEvenAndOddDigits {
	public static void main(String[] args) {
		int n=1234;
		int evenCount=0;
		int oddCount=0;
		while (n>0) {
			int rem=n%10;
			if (rem%2==0) {
				evenCount++;
				
			}
			else {
				oddCount++;
			}
			n=n/10;
			
		}
		
		System.out.println("Even count is "+evenCount);
		System.out.println("Odd count is "+oddCount);
		
	}

}
