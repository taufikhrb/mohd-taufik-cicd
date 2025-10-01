package array;

public class checkCharacterIsDigitLetterOrSpecialSymbol {
	public static void main(String[] args) {
		String str="iuhjekd293iwop-029!@##@)(*&$";
		char[] ch=str.toCharArray();
		int charCount=0;
		int digitCount=0;
		int specialCharcount=0;
		for (char c : ch) {
			if(c>='0' && c<='9')
			{
				digitCount++;
				System.out.println("The digit are "+c);
				
			}
			else if (c>='a' && c<='z') {
				charCount++;
				System.out.println("The char is "+c);
			
				
			} else {
				specialCharcount++;
				System.out.println("The specialCharacter are is "+c);
				

			}
			
		}

		System.out.println("The digit count is "+digitCount);
		System.out.println("The char count is "+digitCount);
		System.out.println("The special character count is "+specialCharcount);
	}

}
