package stringQuestions;

import java.util.HashMap;
import java.util.Map;

public class Findthemaximumoccurringcharacter {
	public static void main(String[] args) {
		String str="sucessscess";
		char[] ch=str.toCharArray();
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		for(char cm:ch) {
			if(map.containsKey(cm))
			{
				map.put(cm, map.get(cm)+1);
			}
			else {
				map.put(cm, 1);
			}
		}
		 char maxChar = ' ';
	        int maxCount = 0;
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			System.out.println("Character is "+entry.getKey()+" Value it contains is "+entry.getValue());
			if (entry.getValue()>maxCount) {
				maxCount=entry.getValue();
				maxChar=entry.getKey();
				
				
			}
			
		}
		System.out.println("Max character is "+maxChar+" Count is "+maxCount);
		
	}

}
