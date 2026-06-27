package IfElsePractice;

public class Practice2 {
             public void gradeCalculator(int marks) {
            	 if(marks>=90) {
            		 System.out.println("Grade A");
            	 }
            	 else if(marks>=75) {
            		 System.out.println("Grade B");
            	 }
            	 else {
            		 System.out.println("Grade c");
            	 }
             }
             
             public void profitOrLoss(int cp , int sp) {
            	 if(sp>cp) {
            		 System.out.println("Profit");
            	 }
            	 else {
            		 System.out.println("Loss");
            	 }
             }
}
