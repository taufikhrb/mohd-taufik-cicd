package codingPractice;

import java.util.HashSet;
import java.util.Set;

public class duplicateElementInArray {
	public static void main(String[] args) {
		int[] a= {12,31,233,12,90,233};
		Set<Integer> set=new HashSet<Integer>();
		for (int i : a) {
			if (set.add(i)==false) {
				System.out.println(i);
				
			}
			
			
		}
	}

}
