import java.io.FileReader;
import java.io.IOException;
import java.io.File;

class Filing14
{
	public static void main(String[] args) 
	{

		char[] data=new char[100];
		try 
		{
			File file1=new File("F:\\Filling\\filereader.txt");
			file1.createNewFile();

			FileReader file=new FileReader("F:\\Filling\\filereader.txt");
			file.read(data);

			System.out.println("Data Saved SuccessFully");
			System.out.println(data);

			file.close();
		}	

		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}