import java.io.FileOutputStream;
import java.io.PrintStream;
class Test
{
	
		public void run()
		{
			try 
			{
				FileOutputStream file=new FileOutputStream("F:\\Filling\\faraz.txt",true);

				PrintStream out=new PrintStream(file);

				out.println("Hello Print Stream Class");
				out.println("Good Bye");

				System.out.println("Data Store SuccessFully in File");
			}

				catch(Exception e)
				{
					e.printStackTrace();
				}

		}
}	

class Filing06
{

	public static void main(String[] args)
	{
		Test th=new Test();	
		th.run();	
	}
}