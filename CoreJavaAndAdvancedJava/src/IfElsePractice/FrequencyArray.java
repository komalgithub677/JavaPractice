package IfElsePractice;

import java.util.HashMap;
import java.util.Scanner;

public class FrequencyArray {
	
	         //frquency array is only work for if there is only uppercase letters,
	//lowercase letters and the specil charcters
             public void frequency(String s) {
            	 int freq[] = new int[26];
            	 
            	 for(int i=0; i<s.length(); i++ ) {
            		 freq[s.charAt(i)-'a']++;
            		 
            		 }
            	 
            	 for(int i=0; i<26; i++) {
            		 if(freq[i]>0) {
            			 System.out.println((char)(i+'a')+ " "+ freq[i]);
            		 }
            	 }
            	 
            
            	 }
             
             //hashmap is work for all charcters 
             
             
             //calculate frequency without extra space by using the nested
             //loops
             public void extraSpace(String s) {
            	 for(int i=0; i<s.length(); i++) {
            		 int count =1;
            		 if(s.charAt(i)=='*') {
            			 continue;
            		 }
            		 for(int j=i+1; j<s.length(); j++) {
            			 if(s.charAt(i)==s.charAt(j)) {
            				 count++;
            			 }
            		 }
            		 System.out.println("without using extra space "+ s.charAt(i)+ " " + count);
            	 }
             }
             
             public static void main(String[] args) {
            	 Scanner sc = new Scanner(System.in);
            	 FrequencyArray f = new FrequencyArray();
            	 String s = sc.nextLine();
            	 f.frequency(s);
            	 f.extraSpace(s);
            	 
            	 HashMap<Character , Integer> map = new HashMap<>();
            	 for(int i=0; i<s.length(); i++) {
            		 char ch = s.charAt(i);
            		 map.put(ch, map.getOrDefault(ch, 0) + 1);
            	 }
            	 System.out.println(map);
			}
             
            
}
