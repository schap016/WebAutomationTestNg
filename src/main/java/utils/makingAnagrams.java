package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class makingAnagrams {
	static HashMap<Character, Integer> getMap(char[] arr1) {
	
	HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

	for (char c : arr1) {
		if (charCountMap.containsKey(c)) {

			charCountMap.put(c, charCountMap.get(c) + 1);
		} else {

			charCountMap.put(c, 1);
		}

	}
	return charCountMap;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1 = "absdjkvuahdakejfnfauhdsaavasdlkj"; //abccd
		String s2 = "djfladfhiawasdkjvalskufhafablsdkashlahdfa"; //abcdd
		
		
		//{a:1, b:1, c:1}
		//{a:1, m:1, n:1, o:1, p:1}
		
		
		char[] s1Arr = s1.toCharArray();
		char[] s2Arr = s2.toCharArray();
		
		HashMap<Character, Integer> s1Map= getMap(s1Arr);
		HashMap<Character, Integer> s2Map= getMap(s2Arr);
				
		//int count =0;
		
		
		System.out.println(s1Map);
		System.out.println(s2Map);
		
		System.out.println(s1Map.size());
		System.out.println(s2Map.size());
		
		
		
		
		if (s1Map.size() >=s2Map.size()) {
			int diffCount = 0;
				for (char c: s1Map.keySet()) {

					
					if (s2Map.containsKey(c) && (s1Map.get(c)!=s2Map.get(c))) {
						//System.out.println("Condition satisfied");
						diffCount+= Math.abs(s1Map.get(c)-s2Map.get(c));
						//System.out.println(diffCount);
					}
					
					else if ((s2Map.containsKey(c))==false){
						//System.out.println("2 condition satisified");
						diffCount+=s1Map.get(c);
						//System.out.println(diffCount);
					}
					
				}
				
				if(s1Map.size()>s2Map.size()) {
					
					System.out.println(diffCount+s1Map.size()-s2Map.size());
				}
				else if (s1Map.size()==s2Map.size()){
					System.out.println(diffCount);
					
					System.out.println((s1Map.size()-diffCount)*2);
					
					
				}
				
				
				
		}

		else {
			int diffCount = 0;
			for (char c: s2Map.keySet()) {

				
				if (s1Map.containsKey(c) && (s2Map.get(c)!=s1Map.get(c))) {
					
					diffCount+= Math.abs(s1Map.get(c)-s2Map.get(c));
				}
				
				else if ((s1Map.containsKey(c))==false){
					
					
					diffCount+=s2Map.get(c);
					
				}
				
			}
			System.out.println(diffCount+s2Map.size()-s1Map.size());

		}
		
	  // System.out.println(diffCount);
		
	}

}
