package stringQuestions;

import java.util.*;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		String rev="";
		char[] ch=name.toCharArray();
		for (int i = ch.length-1; i >=0; i--) {
			rev=rev+name.charAt(i);
			
		}
		if (name.equals(rev)) {
			System.out.println("palindrome string");
			
		}
		else {
			System.out.println("Not a palindrome string");
		}
		
	}

}
