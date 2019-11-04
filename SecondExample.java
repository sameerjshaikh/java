import java.io.Console;

class SecondExample
{
	public static void main(String args[])
	{
		System.out.println("Enter The name ");
		String name=System.console().readLine();
		System.out.println("Enter The Age ");
		String age=System.console().readLine();
		System.out.println("Enter The Address ");
		String address=System.console().readLine();


		System.out.println("The Name is "+name);
		System.out.println("The Age is "+age);
		System.out.println("The Address is "+address);
	}
} 