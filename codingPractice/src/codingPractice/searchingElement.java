package codingPractice;

import java.util.Iterator;

public class searchingElement {
	public static void main(String[] args) {
		int[] a= {12,32,1234,11123,12321};
		int search=1234;
		for (int i = 0; i < a.length; i++) {
			if (a[i]==search) {
				System.out.println("Element is found at index "+i);
				break;
				
			}
			
		}
	}

}
