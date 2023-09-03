import java.io.FileOutputStream;
import java.io.IOException;

class Filing12
{
	public static void main(String[] args) 
	{
		String file="Faraz Ali Mengal";
		FileOutputStream output=null;

		try 
		{
			output=new FileOutputStream("F:\\Filling\\fileout.txt");

			byte[] file1=file.getBytes();
			output.write(file1);

			System.out.println("File Created SuccessFully");
		}	

		catch(Exception e)
		{
			System.out.print(e.getMessage());
		}

		finally
		{
			if(output !=null)
			{
				try 
				{
					output.close();
				}

				catch(Exception e)
				{
					System.out.print(e.getMessage());
				}
			}
		}
	}
}