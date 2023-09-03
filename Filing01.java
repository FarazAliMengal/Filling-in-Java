import java.io.File;
class Filing01 
{
	public static void main(String[] args) 
	{
	File file=new File("F:\\Filling\\faraz.txt");

	if(file.exists())
	{
		System.out.println("File Name :"+file.getName());
		System.out.println("Absolute Path :"+file.getAbsolutePath());
		System.out.println("File Size :"+file.length()+" "+"bytes");

		boolean deleted = file.delete();
		if(deleted)
		{
			System.out.println("File Deleted Successfully");
		}
		else 
		{
			System.out.println("Failed to Delete The File");
		}
	}
	else 
		System.out.println("File Does Not Exists");
}
}