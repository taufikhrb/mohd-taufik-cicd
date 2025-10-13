package codingPractice;

public class sumOfElementInArray {
	public static void main(String[] args) {
		int[] a= {12,121,23,1231,432};
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
			
		}
		System.out.println(sum);
	}

}
