import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

class Filing07
{
	public static void main(String[] args) throws IOException
	{
		File file=new File("F:\\Filling\\gooding.txt");

		file.createNewFile();
		FileInputStream th1=new FileInputStream(file);
		PrintStream th=new PrintStream(file);
		DataInputStream ob=new DataInputStream(th1);
		DataInputStream ob1=new DataInputStream(System.in);

		String line="";

		th.println("1.Addition");
		th.println("2.Subtraction");
		th.println("3.Multiplication");
		th.println("4.Division");

		System.out.println("\n1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.MultiPlication");
		System.out.println("4.Division");

		System.out.print("Enter choice from above menu:");
		int num=Integer.parseInt(ob1.readLine());

		th.println("Enter choice from above menu :"+num);

		if(num==1)
		{
			System.out.println("\nWelcome to addition");

			System.out.print("Enter 1st Number :");
			int num1=Integer.parseInt(ob1.readLine());

			System.out.print("Enter 2nd Number :");
			int num2=Integer.parseInt(ob1.readLine());

			int add=num1+num2;
			System.out.print("Addition :"+add+"\n\n\n");

			th.println("\n\nWelcome to addition");

			th.println("Enter 1st Value :" +num1);
			th.println("Enter 2nd Value :"+num2);

			th.println("Addition is :"+add+"\n");
		}

			/*while((line=ob.readLine()) != null)
		{
			 // line = ob.readLine();  			
			System.out.println(line);
		}*/	

		if(num==2)
		{
			
			System.out.println("\nWelcome to addition");

			System.out.print("Enter 1st Number :");
			int num1=Integer.parseInt(ob1.readLine());

			System.out.print("Enter 2nd Number :");
			int num2=Integer.parseInt(ob1.readLine());

			int sub=num1-num2;
			System.out.print("Addition :"+sub+"\n\n\n");

			th.println("\n\nWelcome to Subtraction");

			th.println("Enter 1st Value :" +num1);
			th.println("Enter 2nd Value :"+num2);

			th.println("Subtraction is :"+sub+"\n");
		}	

		if(num==3)
		{

			System.out.println("\nWelcome to addition");

			System.out.print("Enter 1st Number :");
			int num1=Integer.parseInt(ob1.readLine());

			System.out.print("Enter 2nd Number :");
			int num2=Integer.parseInt(ob1.readLine());

			int multi=num1*num2;
			System.out.print("Multiplication :"+multi+"\n\n\n");

			th.println("\n\nWelcome to Multiplication");

			th.println("Enter 1st Value :" +num1);
			th.println("Enter 2nd Value :"+num2);

			th.println("Multiplication is :"+multi+"\n");
		}

		if(num==4)
		{

			System.out.println("\nWelcome to addition");

			System.out.print("Enter 1st Number :");
			int num1=Integer.parseInt(ob1.readLine());

			System.out.print("Enter 2nd Number :");
			int num2=Integer.parseInt(ob1.readLine());

			int add=num1/num2;
			System.out.print("Division :"+add+"\n\n\n");

			th.println("\n\nWelcome to Division");

			th.println("Enter 1st Value :" +num1);
			th.println("Enter 2nd Value :"+num2);

			th.println("Division is :"+add+"\n");
		}

		
		while((line=ob.readLine()) !=null)
			System.out.println(line);
	}
}