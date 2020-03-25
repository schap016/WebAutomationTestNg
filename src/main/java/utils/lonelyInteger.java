package utils;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import org.testng.TestNG;

public class lonelyInteger {

	

	public static void main(String args[]) {
		try {

			int[] a  = {0,0,1,2,1};
			
			HashMap<Integer,Integer> getMap = new HashMap<Integer,Integer>();
			
			
			for (int c : a) {
				if (getMap.containsKey(c)) {

					// If char is present in charCountMap,
					// incrementing it's count by 1
					getMap.put(c, getMap.get(c) + 1);
				} else {

					// If char is not present in charCountMap,
					// putting this char to charCountMap with 1 as it's value
					getMap.put(c, 1);
					
				}		
			
	}
			System.out.println(getMap);
			
			for (int c1: getMap.keySet()) {
				
				if(getMap.get(c1)==1) {
					System.out.println(c1);
					
					
				}
				
				
			}
			
		} catch (Exception e) {
		}
	}
}
