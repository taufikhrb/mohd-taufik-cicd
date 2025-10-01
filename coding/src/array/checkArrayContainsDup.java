package array;

import java.util.HashSet;
import java.util.Set;

public class checkArrayContainsDup {
	public static void main(String[] args) {
		int[] a= {12,32,12,321};
		boolean status=false;
		Set<Integer> set=new HashSet<Integer>();
		for (Integer integer : a) {
			if (set.add(integer)==false) {
				status=true;
				System.out.println("duplicate is "+integer);
			}
			
			
		}
		
		
	}

}
