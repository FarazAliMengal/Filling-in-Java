import java.io.FileWriter;
import java.io.IOException;

class Filing11
{
	public static void main(String[] args) throws Exception
	{

		String text="Faraz Ali Mengal";

		try 
		{
			FileWriter file=new FileWriter("F:\\Filling\\writer.txt");
			file.write(text);

			System.out.println(text);
			file.close();

			System.out.println("File Created SuccessFully");
		}

		catch(Exception e)
		{
			System.out.print(e.getMessage());
		}
	}
}