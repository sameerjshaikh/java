// using Scanner 
import java.lang.*;
import java.io.*;
import java.util.*;

class calculator
{
	static Scanner s = new Scanner(System.in);
	public static void main(String args[])
	{
		int a;
		
		do{
			System.out.println("Enter your Choice");
			System.out.println("1.Add");
			System.out.println("2.Sub");
			System.out.println("3.Mul");
			System.out.println("4.Div");
  
       a = s.nextInt();

      
      switch(a)

      {
      	case 1 : int addnum=Operation.add();
      			System.out.println("Addation is "+addnum);
      		break;

      	case 2 : int subnum=Operation.sub();
      			System.out.println("Addation is "+subnum);
      		break;
      	case 3 : int mulnum=Operation.mul();
      			System.out.println("Addation is "+mulnum);
      		break;
      	case 4 : int divnum=Operation.div();
      			System.out.println("Addation is "+divnum);
      		break;			

      }

      }while(a!=0);

		
	}
}

class Operation
{
	static Scanner s = new Scanner(System.in);
     public static int get()
     {
     	System.out.println("Enter the Value");
     	int value=s.nextInt();

     	return value;
     }

	public static int add()
	{
		int value1 = get();
		int value2 = get();

		int res =value1 + value2;
		return res;

	} 
	public static int sub()
	{
		int value1 = get();
		int value2 = get();

		return value1 - value2;
	} 
	public static int div()
	{
		int value1 = get();
		int value2 = get();

		return value1 / value2;
	} 
	public static int mul()
	{
		int value1 = get();
		int value2 = get();

		return value1 * value2;
		
	} 

}
