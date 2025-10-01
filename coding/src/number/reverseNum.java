package number;

public class reverseNum {
	public static void main(String[] args) {
		int num=123;
		int sum=0;
		int temp=num;
		while (num>0) {
			int rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
			
		}
		System.out.println(sum);
		if (temp==sum) {
			System.out.println("Palindrome number");
		}
		else {
			System.out.println("Not a palindrome string");
		}
	}

}
