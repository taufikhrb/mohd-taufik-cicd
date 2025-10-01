package array;

public class reverseOnlyvowelInString {
	public static void main(String[] args) {
		String str="taeiou";
		char[] ch=str.toCharArray();
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			if (Character.isLetter(ch[i])) {
				continue;
				
			}
		else if (ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u') {
				rev=rev+str.charAt(i);
				
			}
			System.out.println(rev);
		}
		
		
	}

}
