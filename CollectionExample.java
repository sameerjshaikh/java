///collection 

//------------ArrayList-----

import java.util.*;
/*class CollectionExample
{

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		//ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList list = new ArrayList();
		list.add("sameer");
		list.add("shaikh");
		list.add("juber");
		list.add("kiran");
		list.add("asem");
		//list.add(123);
			

		Iterator<String> itr = list.iterator();

			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}

	}
}*/

///-----------------LinkedList.stack--------------------------------
/*
class CollectionExample
{

	public static void main(String[] args) {*/

		//LinkedList<String> list=new LinkedList<String>();

		//Vector<String> list = new Vector<String>();  
		//Vector list = new Vector();  
	//	Stack<String> list1 = new Stack<String>();


/*		list.add("1.sameer");
		list.add("2.shaikh");
		list.add("3.juber");
		list.add("4.kiran");
		list.add("5.asem");
		list.add(123);*/
		//list.remove();


/*
		list1.push("Ecity");
		list1.push("cdac");
		list1.push("dac");
		list1.push("DITIS");
		list1.push("DAI");
		list1.remove(0);
			
*/
/*		Iterator itr =list.iterator();

		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
/*System.out.println("-----------------Stack-------------------");
		Iterator itr =list1.iterator();


		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
*/


class CollectionExample
{

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();

		set.add("1.Ecity");
		set.add("2.Dac");
		set.add("3.CDAC");

		Iterator<String> itr = set.iterator();

		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		 System.out.println("Traversing list through forEachRemaining() method:");  
     			  itr=set.iterator();  
     			//Here, we are using lambda expression  
              itr.forEachRemaining(a-> 
              {  
            System.out.println(a);  
              });  

	}
}



