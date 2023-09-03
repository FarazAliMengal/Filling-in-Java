import java.io.FileOutputStream;
import java.io.PrintStream;
class Filing04
{
		public void file()throws Exception
		{
			FileOutputStream file=new FileOutputStream("F:\\Filling\\faraz.txt",true);

			PrintStream out=new PrintStream(file);

			out.println("Hello Print Stream Class");
			out.println("Good Bye");

			System.out.println("Data Store SuccessFully in File");

		}

	public static void main(String[] args)throws Exception
	{
		Filing04 th=new Filing04();	
		th.file();	
	}
}