package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class deletions {

	public static void main(String[] args) {

		String s = "BABABAB";

		char[] arr = s.toCharArray();
		System.out.println(arr);
		int count = 0;
		for(int i =1; i < arr.length-1;i++) {
								
			if (arr[0] == 'A') {
				System.out.println("called A");
				
				if(arr[i+1]=='A') {
					
					count+=1;
				}
				
				
				
			}
			
			else if(arr[0]=='B') {
				System.out.println("called B");
				if(arr[i+1]=='B') {
					
					
					count+=1;
				}
				
				
			}
		}
		System.out.println(count+1);
		
		
		

}}
