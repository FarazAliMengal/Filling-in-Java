import java.io.File;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;

class Filing08
{
	public static void main(String[] args)throws IOException,FileNotFoundException
	{
		File file=new File("F:\\Filling\\faraz.txt");
		file.createNewFile();

		FileInputStream th=new FileInputStream(file);

		DataInputStream ob=new DataInputStream(th);
		DataInputStream ob1=new DataInputStream(System.in);
		PrintStream th1=new PrintStream(file);

		while(true)
		{

		String line=" ";

		th1.println("1.Addition");
		th1.println("2.Subtraction");
		th1.println("3.MultiPlication");
		th1.println("4.Division");

		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.MultiPlication");
		System.out.println("4.Division");
		System.out.println("5.Exit");

		System.out.print("Select Number :");
		int num=Integer.parseInt(ob1.readLine());

		th1.println("Select Number :"+num);

		if(num==1)
		{
			System.out.print("Enter 1st Number :");
			int num1=Integer.parseInt(ob1.readLine());

			System.out.print("Enter 2nd Number :");
			int num2=Integer.parseInt(ob1.readLine());

			int add=num1+num2;
			System.out.print("Addition is :"+add);

			th1.println("Enter 1st Number :"+num1);
			th1.println("Enter 2nd Number :"+num2);
			th1.println("Addition is :"+add+"\n");
		}

		if(num==2)
		{
			System.out.print("Enter 1st Number :");
			int num1=Integer.parseInt(ob1.readLine());

			System.out.print("Enter 2nd Number :");
			int num2=Integer.parseInt(ob1.readLine());

			int sub=num1-num2;
			System.out.print("Subtraction is :"+sub);

			th1.println("Enter 1st Number :"+num1);
			th1.println("Enter 2nd Number :"+num2);
			th1.println("Subtraction is :"+sub+"\n");
		}

		if(num==3)
		{
			System.out.print("Enter 1st Number :");
			int num1=Integer.parseInt(ob1.readLine());

			System.out.print("Enter 2nd Number :");
			int num2=Integer.parseInt(ob1.readLine());

			int multi=num1*num2;
			System.out.print("MultiPlication is :"+multi);

			th1.println("Enter 1st Number :"+num1);
			th1.println("Enter 2nd Number :"+num2);
			th1.println("MultiPlication is :"+multi+"\n");
		}

		if(num==4)
		{
			System.out.print("Enter 1st Number :");
			int num1=Integer.parseInt(ob1.readLine());

			System.out.print("Enter 2nd Number :");
			int num2=Integer.parseInt(ob1.readLine());

			int div=num1/num2;
			System.out.print("Division is :"+div);

			th1.println("Enter 1st Number :"+num1);
			th1.println("Enter 2nd Number :"+num2);
			th1.println("Divsion is :"+div+"\n");
		}
		if(num==5)
		{
			System.exit(0);
		}

		while((line=ob.readLine()) !=null)
			System.out.println(line);

		}
	}
}