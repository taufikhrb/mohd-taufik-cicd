package number;

public class swap {
	public static void main(String[] args) {
		int a=20;
		int b=10;
		System.out.println("The value of a before swap is "+a);
		System.out.println("The value of b before swap is "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("The value of a after swap is "+a);
		System.out.println("The value of b after swap is "+b);
		
		
	}

}
