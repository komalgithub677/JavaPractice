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
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		TraverseCharacter t = new TraverseCharacter();
		t.countVowels(s);	
	}
}
