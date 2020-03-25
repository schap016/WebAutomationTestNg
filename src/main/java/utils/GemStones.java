package utils;

import java.util.ArrayList;
import java.util.List;

public class GemStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = { "abcdde", "baccd", "eeabg" };
		//List<String>arrLists = new ArrayList<String>();
		
		List<Character> minerals = new ArrayList<Character>();

		for (String c : arr) {

			
			  for (char d : c.toCharArray()) {
			  			  
				  if (minerals.contains(d)!=true) {
					  
					  minerals.add(d);				  
					  
				  }
				  
			  }			
			

		}
		
		List<String> minString = new ArrayList<String>();
		
		for (char e : minerals) {
			
			String a = Character.toString(e);
			minString.add(a);
		}
		


		List<String> gems = new ArrayList<String>();
		
			for (String f :minString ) {
				int count = 0;
				
				for (String o : arr) {
					
					
					if(o.contains(f)) {
						count+=1;
						
						if(count>=arr.length) {
							gems.add(f);
						}
						
					}
					
				}
			}
			
			System.out.println(gems.size());
		}
		
		 
		
		
}
