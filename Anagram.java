package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Pseudo Code
		  
		 *Declare a String 
			String text1 = "stops";
		 *Declare another String
			String text2 = "potss"; 
		 * a) Check length of the strings are same then (Use A Condition)
		 * b) Convert both Strings in to characters
		 * c) Sort Both the arrays
		 * d) Check both the arrays has same value
		 * 
		 */

		String text1 = "stops";
		String text2 = "potss"; 
		int t1=text1.length();
		int t2=text2.length();
			if (t1==t2)
			{
				System.out.println("Same");
			}
			else
			{
			
				System.out.println("different");
	}
			
			char[] text3=text1.toCharArray();
			char[] text4=text2.toCharArray();
			Arrays.sort(text3);
			Arrays.sort(text4);
			
			 boolean result = Arrays.equals(text3, text4);

		      if(result) {
		        System.out.println(text1 + " and " + text2 + " are anagram.");
		      }
		      else {
		        System.out.println(text1 + " and " + text2 + " are not anagram.");
		      }
		    }
		   
		  }
			
			
			



