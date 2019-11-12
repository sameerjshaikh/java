
import java.util.*;


class Student
{
	public int roll_no;
	public String name;

	Student(int roll_no,String name)
	{
		this.roll_no=roll_no;
		this.name=name;
	}
}
class CollectionProSir
{
	public static void main(String[] args) {
		//Arraylistfun();
		//setfunction();
		//customclassFunction();
		//queueExample();
		hashMapfunction();

	}


	public static void Arraylistfun()
	{

		ArrayList<String> al = new ArrayList<String>();

		ArrayList<Student> ss = new ArrayList<Student>();
		ss.add(new Student(121,"sameer"));
		ss.add(new Student(123,"juber"));
		ss.add(new Student(124,"sopan"));
		//MyConsole.print(ss);


		for(Student x:ss)
		{
			//System.out.print(x.hashCode()+"");
			MyConsole.print(x.roll_no+" "+x.name);
		}	


		al.add("Ecity");
		System.out.print("the total no of size:"+al.size());
		al.add("dac");
		MyConsole.print("\nThe totoal no of element:"+al.size());
		al.add("CDAC");
		MyConsole.print("\nThe totoal no of element:"+al.size());

       al.remove(1);
		for(String str:al)
		{
			MyConsole.print(str);
		}


	}
	public static void setfunction()
	{
		HashSet<String> set = new HashSet<String>();
		Set<int[]> arr = new HashSet<int[]>();



		set.add("mango");
		set.add("apple");
		set.add("fruits");
		MyConsole.print(set);

		arr.add(new int[]{12,13,14});
		arr.add(new int[]{15,16,17,18,19});
		for(int[] str:arr)
		{
			for(int x:str)
			{
			System.out.print(x+" ");
		}
		MyConsole.print("");

		}

		for(String str:set)
		{
			MyConsole.print(str);
		}
	}

	public static void customclassFunction()
	{
	 HashSet<Student> ss = new HashSet<Student>();
		ss.add(new Student(121,"sameer"));
		ss.add(new Student(123,"juber"));
		ss.add(new Student(124,"sopan"));
		Student s1 =new Student(125,"asem");
		Student s2 = new Student(126,"kiran");
		ss.add(s1);
		ss.add(s2);

		for(Student x:ss)
		{
			//System.out.print(x.hashCode()+"");
			MyConsole.print(x.roll_no+" "+x.name);
			//MyConsole.print(x);


		}	
	}

	public static void queueExample()
	{
		//Queue<String> que = new PriorityQueue<String>();
		Queue<String> que = new LinkedList<String>();
		//Queue<String> que =new ArrayDeque<String>();
		que.add("ecity");
		que.add("CDAC");
		que.add("DAC");

		MyConsole.print(que);
		MyConsole.print("Now the first item in the cart is " + que.peek());
		MyConsole.print("The Item removed is : " + que.remove());
		MyConsole.print("Now the first item in the cart is " + que.peek());
		for(String str:que)
		{
			MyConsole.print(str+" ");
		}
	}
	public static void hashMapfunction()
	{
		Map<String, String> map =new HashMap<String, String>();

		map.put("sameer","123");
		map.put("juber","124");
		map.put("kiran","125");
		map.put("asem","126");

		Set<String> keys =map.keySet();
		for(String key:keys)
		{
			MyConsole.print(key);
			MyConsole.print(map.get(key));
		}
		MyConsole.print(map);

	}
}