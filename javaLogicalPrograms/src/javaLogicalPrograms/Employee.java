package javaLogicalPrograms;

public class Employee {
	// Attributes of the Employee
	private double salary;
	private int id;
	private String department;

	// Constructor to initialize Employee object
	public Employee(double salary, int id, String department) {
		this.salary = salary;
		this.id = id;
		this.department = department;
	}

	// Override toString method to provide custom string representation
	@Override
	public String toString() {
		return "Employee{" + "salary=" + salary + ", id=" + id + ", department='" + department + '\'' + '}';
	}

	// Override equals method to compare Employee objects
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Employee employee = (Employee) obj;
		return id == employee.id && Double.compare(employee.salary, salary) == 0
				&& department.equals(employee.department);
	}

	// Main method to test the Employee class
	public static void main(String[] args) {
		// Creating Employee objects
		Employee emp1 = new Employee(50000, 101, "HR");
		Employee emp2 = new Employee(60000, 102, "IT");

		// Displaying employee details using toString method
		System.out.println("Employee 1: " + emp1.toString());
		System.out.println("Employee 2: " + emp2.toString());

		// Testing equals method
		Employee emp3 = new Employee(50000, 101, "HR");
		Employee emp4 = new Employee(60000, 103, "IT");

		System.out.println("Employee 1 equals Employee 3: " + emp1.equals(emp3)); // true
		System.out.println("Employee 2 equals Employee 4: " + emp2.equals(emp4)); // false
	}
}
