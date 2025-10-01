package stringQuestions;

import java.util.HashMap;

public class countCharacter {
	public static void main(String[] args) {
		String t="taufikisjhj";
		char[] ch=t.toCharArray();
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		for (char c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c)+1);
				
				
			}
			else {
				map.put(c, 1);
			}
			
		}
		System.out.println(map);
		
	}

}
