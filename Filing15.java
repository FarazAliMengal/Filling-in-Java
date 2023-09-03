import java.io.FileOutputStream;
import java.io.DataInputStream;
import java.io.PrintStream;

class Filing15
{
	FileOutputStream ob=null;
	DataInputStream th=null;
	PrintStream th1=null;

	Filing15()
	{
		try 
		{
			readWriteMethod();
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	void readWriteMethod()throws Exception
	{
		ob=new FileOutputStream("F:\\Filling\\FileReader2.txt");
		th=new DataInputStream(System.in);
		th1=new PrintStream(ob);

		String line=th.readLine();
		th1.println(line);
	}

	public static void main(String[] args) 
	{
		new Filing15();
	}
}