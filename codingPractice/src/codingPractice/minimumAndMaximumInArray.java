package codingPractice;

import java.util.Iterator;

public class minimumAndMaximumInArray {
	public static void main(String[] args) {
		int[] a= {9878,2432,234,123,12,21};
		int min=a[0];
		int max=a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i]>max) {
				max=a[i];
				
			}
			else if (a[i]<min) {
				min=a[i];
				
			}
			
			
		}
		System.out.println("max is "+max+" min is "+min);
		
	}

}
