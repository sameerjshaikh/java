
///using parseint 
import java.lang.*;
import java.io.*;
import java.util.*;

class Calc
{
	public static void main(String args[])
	{
		int a;
		
		do{
			System.out.println("Enter your Choice");
			System.out.println("1.Add");
			System.out.println("2.Sub");
			System.out.println("3.Mul");
			System.out.println("4.Div");
  
       a = Integer.parseInt(System.console().readLine());

       int value1=Operation.get();
       int value2=Operation.get();


      
      switch(a)

      {
      	case 1 : 
      			System.out.println("Addation is "+Operation.add(value1,value2));
      		break;

      	case 2 :
      			System.out.println("Sub is "+Operation.sub(value1,value2));
      		break;
      	case 3 :
      			System.out.println("Mul is "+Operation.mul(value1,value2));
      		break;
      	case 4 : 
      			System.out.println("Div is "+Operation.div(value1,value2));
      		break;			

      }

      }while(a!=0);

		
	}
}

class Operation
{

     public static int get()
     {
     	System.out.println("Enter the Value");
     	int value=Integer.parseInt(System.console().readLine());

     	return value;
     }

	public static int add(int value1, int value2)
	{
		return value1 + value2;
	} 
	public static int sub(int value1, int value2)
	{
		return value1 - value2;
	} 
	public static int div(int value1, int value2)
	{

		return value1 / value2;
	} 
	public static int mul(int value1, int value2)
	{
		return value1 * value2;
	} 

}
