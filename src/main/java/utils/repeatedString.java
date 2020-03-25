package utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class repeatedString {

	

	public static void main(String args[]) {
		try {

			String s = "zztqooauhujtmxnsbzpykwlvpfyqijvdhuhiroodmuxiobyvwwxupqwydkpeebxmfvxhgicuzdealkgxlfmjiucasokrdznmtlwh";
			char[] arr = s.toCharArray();
			
			HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
			
			for (char c : arr) {
				if (hm.containsKey(c)) {

					hm.put(c, hm.get(c) + 1);
				} else {

					hm.put(c, 1);
				}

			}
			 StringBuilder sb = new StringBuilder();
			
			for (char d: hm.keySet()) {
				
					if(!((hm.get(d)%2)==0)) {
						
						sb.append(d);
						
					}
								
			}
			
			if(sb.length()==0) {
				System.out.println("Empty String");
				
			}
			else{
				System.out.println(sb.toString());
			}
			
		} catch (Exception e) {
		}
	}
	
	
	
	
	
	
}
