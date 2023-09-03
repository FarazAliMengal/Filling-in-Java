import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Filing05
{
	public static void main(String[] args)throws IOException,FileNotFoundException 
	{
		FileInputStream file = new FileInputStream("F:\\Filling\\faraz.txt");

		DataInputStream ob = new DataInputStream(file);
		//Scanner sc = new Scanner(file); 
		
		
		String line = " ";
		line = ob.readLine();
		
		while((line=ob.readLine()) != null)
		{
			 // line = ob.readLine();  			
			System.out.println(line);
		}		
	}	
}
