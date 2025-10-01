package stringQuestions;

public class removeSpecial {
	public static void main(String[] args) {
		String str="jhiljoi9890980++++++++__________";
		String ne=str.replaceAll("[^0-9a-zA-Z]", "");//  "\\s" for spaces \\d for digits
		System.out.println(ne);
		
	}

}
