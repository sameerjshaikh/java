import java.io.BufferedReader;
import java.io.FileWriter;

class FileIO
{
	public static void main(String[] args) throws Exception {
		//BasicIo();
		filewriteOperation();
	}



	private static void BasicIo() throws Exception
	{
		System.out.println("Simple msg on std output device");
		System.err.println("Something Wrong Happen");
		int ascival=System.in.read();

		System.out.println(String.format("Asci valu%d: And Ascii Char %s:",ascival,(char)ascival));

	}

	public static void filewriteOperation()
	{
		try
		{
			FileWriter w =new FileWriter(sample.txt,true);
			int id=MyConsole.getNumber("Enter id");
			String name=MyConsole.getString("Enter Name");
			int marks=MyConsole.getNumber("Enter marks");

			Student S= new Student(id,name,marks);

			w.write(s.toString()+"\n");
			w.close();

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}

