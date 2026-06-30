package IfElsePractice;

import java.util.Scanner;

public class TraverseCharacter {
//	1. Traverse Character by Character
////	Use when you need to count, search, or compare characters.//
//	Approach://
//	for(int i = 0; i < str.length(); i++){
//	    char ch = str.charAt(i);//	}////	Used for:////	Count vowels//	Count consonants
//	Count digits
//	Count uppercase/lowercase
//	Find frequency of a character
	public void countVowels(String s) {
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch=='a' || ch=='i' || ch=='o' || ch =='u' || ch=='e' || ch=='A'|| ch=='I' || ch=='O'|| ch=='U' || ch=='E') {
				System.err.println("Vowel");
			}
			else {
				System.out.println("Not a vowel");
			}
		}
	}
	
	public void countDigits(String s) {
		int count=0;
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(Character.isDigit(ch)) {
				count++;
			}
		}
		System.out.println("Count of characters : " + count);
	}
	
	//using ascii value
	public void countDigits1(String s) {
		   int count =0;
		   for(int i=0; i<s.length(); i++) {
			   
		   }
	}
	
	public void countUpperCase(String s ) {
		int count =0;
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(Character.isUpperCase(ch)) {
				count++;
			}
		}
		System.out.println("Count of the uppercase character" + count);
	}
	
	public void frequencyOfCharacter(String s ) {
		   int count =0;
		   char target = 'a';
		   for(int i=0; i<s.length(); i++) {
			   char ch = s.charAt(i);
			   if(ch ==target) {
				   count++;
			   }
		   }
		   
		   System.out.println("Frequecy of character :" + count);
	}
	
	public void palindrome(String s) {
		    String original =s;
		    String reverse = " " ;
		   for(int i=0; i<s.length(); i=i/10) {
			   char ch = s.charAt(i);
			   reverse += ch;
		   }
		   if(reverse.equals(original)) {
			   System.out.println("String is palindrome");
		   }
		   else {
			   System.out.println("String is not palindrome");
		   }	 
	}
	
	public void reverseString(String s) {
		char []arr = s.toCharArray();
		int start =0;
		int end = arr.length-1;
		
		while(start<=end) {
			char temp = arr[start];
			arr[start] =arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
		System.out.println(new String(arr));
	}
	
	public void checkPalindrome(String s) {
		       int left = 0;
		       int right = s.length()-1;
		       boolean isPalindrome = true;
		       while(left<right) {
		    	     if(s.charAt(left)!=s.charAt(right)) {
		    	    	 isPalindrome = false;
		    	    	 break;
		    	     }
		    	     left++;
		    	     right--;
		       }
		       if(isPalindrome) {
		    	   System.out.println("String is palindrome");
		       }
		       else {
		    	   System.out.println("String is not plaindrome");
		       }
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		TraverseCharacter t = new TraverseCharacter();
		t.countVowels(s);
		t.countDigits(s);
		t.countUpperCase(s);
		t.frequencyOfCharacter(s);
		t.reverseString(s);
		t.checkPalindrome(s);
	}
}
