package codingPractice;

import java.util.Arrays;

public class bubbleSort {
	public static void main(String[] args) {
		int[] a= {123,21,4432,12311,22,1};
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if (a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
				
			}
			
		}
		System.out.println(Arrays.toString(a));
	}

}
