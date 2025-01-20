package javaLogicalPrograms;

public class Student {
	// Attributes of the Student
	private int id;
	private String name;

	// Constructor to initialize Student object
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	// Method to display student details
	public void display() {
		System.out.println("Student ID: " + id);
		System.out.println("Student Name: " + name);
	}

	// Main method to test the Student class
	public static void main(String[] args) {
		// Creating a Student object
		Student student1 = new Student(1, "Kavya Srinivasa");

		// Displaying the student's details
		student1.display();
	}
}
