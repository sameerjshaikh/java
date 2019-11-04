import java.lang.*;
import java.io.*;
//import java.util.*;

class ThirdExample
{
	static Console con = System.console();
	public static void main(String args[])
	{
		
		int age = 42;

		//con.printf("The age is "+age);
		

		String myage = Prompt.getstring("Enter the age");
		con.printf("The age is "+myage);



	}
}

class Prompt 
{
	static Console con = System.console();

	static String getstring(String que)
	{

		con.printf(que);
		return con.readLine();
	}

}