package number;

public class prime {
	public static void main(String[] args) {
		int n=12;
		int count=0;
		if (n>1) {
			for (int i = 1; i <=n; i++) {
				if(n%i==0)
					count++;
				
			}
			if(count==2)
			{
				System.out.println("Prime no");
			}
			else {
				System.out.println("Not a prime no");
			}
			
		}
		else {
			System.out.println("Not a prime no");
		}
		
	}

}
