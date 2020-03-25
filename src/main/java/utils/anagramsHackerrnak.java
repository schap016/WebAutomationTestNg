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

public class anagramsHackerrnak {

	static HashMap<Character, Integer> getMap(char[] arr1) {

		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

		for (char c : arr1) {
			if (charCountMap.containsKey(c)) {

				// If char is present in charCountMap,
				// incrementing it's count by 1
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {

				// If char is not present in charCountMap,
				// putting this char to charCountMap with 1 as it's value
				charCountMap.put(c, 1);
			}

		}
		return charCountMap;

	}

	public static void main(String args[]) {
		try {

			String s = "xaxbbbxx";

			char[] arr = s.toCharArray();
			int arrLen = arr.length;

			if (arrLen % 2 != 0 || arrLen == 1 || arrLen == 0) {

				System.out.println("-1");
			} else {


				char[] a = new char[(arrLen + 1) / 2];
				a = Arrays.copyOfRange(arr, 0, (arrLen + 1) / 2);
				char[] b = new char[(arrLen - (arrLen + 1) / 2)];

				b = Arrays.copyOfRange(arr, (arrLen + 1) / 2, arrLen);

				Arrays.sort(a);
				Arrays.sort(b);
				String sortedA = new String(a);
				String sortedB = new String(b);

				if (sortedA.equals(sortedB)) {

					System.out.println("No changes needed, already Anagrams");
				} else {

					HashMap<Character, Integer> charCountMapA = new HashMap<Character, Integer>();
					HashMap<Character, Integer> charCountMapB = new HashMap<Character, Integer>();

					charCountMapA = getMap(a);
					charCountMapB = getMap(b);
					System.out.println(charCountMapA);
					System.out.println(charCountMapB);
				//	System.out.println(charCountMapA.size());
					//System.out.println(charCountMapB.size());

					
					

					if (charCountMapA.size() >= charCountMapB.size()) {
						int diffCount = 0;
							for (char c: charCountMapA.keySet()) {

								
								if (charCountMapB.containsKey(c) && (charCountMapA.get(c)!=charCountMapB.get(c))) {
									System.out.println("Condition satisfied");
									diffCount+= Math.abs(charCountMapA.get(c)-charCountMapB.get(c));
									//System.out.println(diffCount);
								}
								
								else if ((charCountMapB.containsKey(c))==false){
									System.out.println("2 condition satisified");
									diffCount+=charCountMapA.get(c);
									//System.out.println(diffCount);
								}
								
							}
							System.out.println(diffCount);
					}

					else {
						int diffCount = 0;
						for (char c: charCountMapB.keySet()) {

							
							if (charCountMapA.containsKey(c) && (charCountMapB.get(c)!=charCountMapA.get(c))) {
								
								diffCount+= Math.abs(charCountMapA.get(c)-charCountMapB.get(c));
							}
							
							else if ((charCountMapA.containsKey(c))!=true){
								diffCount+=charCountMapB.get(c);
								
							}
							
						}
						System.out.println(diffCount);

					}

				
				}

			}

		} catch (Exception e) {
		}
	}
}
