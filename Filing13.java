import java.io.FileOutputStream;
import java.io.DataOutputStream;

class Filing13
{
	public static void main(String[] args) throws Exception
	{
		FileOutputStream file=new FileOutputStream("F:\\Filling\\file2.txt");
		DataOutputStream ob=new DataOutputStream(file);

		ob.writeInt(97);
		ob.writeInt('F');

		ob.writeChar(100);
		ob.writeChar('A');

		ob.writeChars("\nFaraz Ali");

		ob.close();

		System.out.print("File Created SuccessFully");
	}
}