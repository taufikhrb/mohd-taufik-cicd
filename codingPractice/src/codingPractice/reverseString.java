package codingPractice;

public class reverseString {
	public static void main(String[] args) {
		String str="taufik";
		String rev="";
		
		
		for (int i = str.length()-1; i >= 0; i--) {
			rev=rev+str.charAt(i);
			
			
		}
		System.out.println(rev);
		if (str.equals(rev)) {
			System.out.println("Palindrom String");
			
		}
		else {
			System.out.println("Not a palindrome string");
		}
	}

}
