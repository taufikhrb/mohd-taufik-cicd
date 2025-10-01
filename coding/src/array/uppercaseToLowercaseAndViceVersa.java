package array;

public class uppercaseToLowercaseAndViceVersa {
	public static void main(String[] args) {
		String str="LJjnjLHGGkjji";
		char[] ch=str.toCharArray();
		for (char c : ch) {////We can also do using Character Class
			if(c>='a' && c<='z')
			{
				 c=(char)(c-32);
			}
			
			else if (c>='A' && c<='Z') {
				c=(char)(c+32);
				
			}
			System.out.print(c);
		}
		
	}

}

//package charQuestions;
//
//public class ToggleCharacterBuiltIn {
//    public static void main(String[] args) {
//        char ch = 'G';
//
//        if (Character.isLowerCase(ch)) {
//            ch = Character.toUpperCase(ch);
//        } else if (Character.isUpperCase(ch)) {
//            ch = Character.toLowerCase(ch);
//        }
//
//        System.out.println("Toggled character: " + ch);
//    }
//}

