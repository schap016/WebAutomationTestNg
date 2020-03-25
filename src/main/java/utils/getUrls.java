package utils;

import java.util.List;
import java.util.Set;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import org.testng.TestNG;


public class getUrls{
		 
		 
	
	public static void main(String args[]) {
        try{

          String str = "test string";
          String str1[] = str.split(""); 
          List<String> al = new ArrayList<String>();
          List<String> al2 = new ArrayList<String>();
         // List<String> al3dups = new ArrayList<String>();
          Set<String> set = new HashSet<String>();
          al = Arrays.asList(str1);
          for(String a: al) {
        	  //System.out.println(a);
        	  if(al2.contains(a)) {
        		  
        		  set.add(a);
        	  }
        	  
        	  al2.add(a);
        	 
        	 
        	 
          }
     	  System.out.println(set);
          

        }catch(Exception e){
             System.out.println(e);

        }
	
	


		}

	 }




