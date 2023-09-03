import java.io.File;
import java.io.IOException;

class Filing02
{
	public static void main(String[] args) throws IOException
	{
		File file=new File("F:\\Filling\\faraz.txt");

		if(file.createNewFile())
		{
			System.out.println("File Created"+file.getName());
		}
		else 
			System.out.println("File Already Exists");
	}
}
