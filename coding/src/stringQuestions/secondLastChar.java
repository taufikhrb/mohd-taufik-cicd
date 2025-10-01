package stringQuestions;

public class secondLastChar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String str="this is amreen brother taufik";
				String[] eachStr=str.split(" ");
				for (String string : eachStr) {
					char ch=string.charAt(string.length()-2);
					System.out.print(ch+" ");
					
				}
		
	}

}
