package stringQuestions;

import java.util.HashSet;
import java.util.Set;

public class duplicateCharInString {
	public static void main(String[] args) {
		String str="taufikta";
		char[] ch=str.toCharArray();
		Set<Character> set=new HashSet<Character>();
		for (Character character : ch) {
			if(set.add(character)==false) {
				System.out.println(character);
				
			}
			
		}
	}

}
