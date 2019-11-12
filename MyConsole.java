//Console.java: Utility function for input and output...
import java.io.Console;
import java.lang.Object;

public class MyConsole{
	private static Console con = System.console();
	public static String getString(String question){
		System.out.println(question);
		return con.readLine();
	}

	public static int getNumber(String question){
		return Integer.parseInt(getString(question));
	} 

	public static double getDouble(String question){
		return Double.parseDouble(getString(question));
	}

	public static void print(Object data){
		System.out.println(data);//println will internally call the object's toString method to print the string representation of the object...
	}
}
class Student{
	int id;
	String studentName;
	int totalMarks;
	
	
	 @Override public int hashCode() { 
		 return Integer.hashCode(id); }
	 
	@Override
	public boolean equals(Object other) {
		//Unbox the other object..
		Student temp = (Student)other;
		return this.id == temp.id;
	}
	public Student(int id, String name, int marks) {
		this.id = id;
		studentName =name;
		totalMarks = marks;
	}
	
	@Override
	public String toString() {
		return String.format("%d,%s,%d", id, studentName, totalMarks);
	}
}
class StudentInsertionFailedException extends Exception{
	public StudentInsertionFailedException() {
		
	}
	
	public StudentInsertionFailedException(String message) {
		super(message);//super will call the base class's specific constructor.....
	}
}
