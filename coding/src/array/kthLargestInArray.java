package array;

import java.util.Arrays;
import java.util.Collection;
import java.util.*;

public class kthLargestInArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a= {23,43,1234,5432,1};
		int k=sc.nextInt();
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		if (k<=a.length) {
			int kthlargest=a[a.length-k];
			System.out.println(k+"nd Largest emenemt is "+kthlargest);
			
		}
		else {
			System.out.println("Write the correct size of array");
		}
			
		
	}

}
