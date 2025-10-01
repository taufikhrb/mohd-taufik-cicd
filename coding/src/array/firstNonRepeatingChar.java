package array;

import java.util.HashMap;
import java.util.Map;

public class firstNonRepeatingChar {
	public static void main(String[] args) {
		String str="taufikta";
		char[] ch=str.toCharArray();
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
		for (char c : ch) {
			if (map.get(c)==1) {
				System.out.println("First non repeating character is "+c);
				break;
				
			}
			
		}

		
		
		
			
			
		}

}
