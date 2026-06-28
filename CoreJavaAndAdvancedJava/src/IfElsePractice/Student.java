package IfElsePractice;

public class Student {
//	Create a Student class with fields:
//
	int id;
	String name;
	int marks;
	
	public void printStudentDetails(int id , String name ,int marks) {
		this.id = id;
		this.name = name;
		this.marks =marks;
	}
	
	public void print() {
		System.out.println("Student id : " + id);
		System.out.println("Student name : " + name);
		System.out.println("Student marks : " + marks);
	}
	
	
//		id
//		name
//		marks

		
	
	
       public static void main(String[] args) {
		Student s = new Student();
		s.print();
	}
}
