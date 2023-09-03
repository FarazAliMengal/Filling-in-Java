import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.DataInputStream;

class Filing09
{
		public static void main(String[] args) throws IOException,FileNotFoundException
		{
			File file=new File("F:\\Filling\\Marksheet.txt");
			file.createNewFile();

			PrintStream th=new PrintStream(file); 
			FileInputStream th1=new FileInputStream(file);

			DataInputStream ob=new DataInputStream(th1);
			DataInputStream ob1=new DataInputStream(System.in);
			

			System.out.print("Enter Your Name :");
			String name=ob1.readLine();

			System.out.print("Enter Your University Name :");
			String uni=ob1.readLine();

			System.out.print("Enter Your Department :");
			String dep=ob1.readLine();

			System.out.print("Enter Java Marks :");
			int java=Integer.parseInt(ob1.readLine());

			System.out.print("Enter Php Marks :");
			int php=Integer.parseInt(ob1.readLine());

			System.out.print("Enter Css Marks :");
			int css=Integer.parseInt(ob1.readLine());

			int totalMarks=300;
			int obtain=java+css+php;


			 th.println("Your Name :"+name);
			 th.println("Your University :"+uni);
			 th.println("Your Department :"+dep);
			 th.println("\nJava Marks :"+java);
			 th.println("Php Marks :"+php);
			 th.println("Css Marks :"+css);
			 th.println("Total Marks :"+totalMarks);
			 th.println("Obtained Marks :"+obtain);



			System.out.println("\n Your Name :"+name);
			System.out.println("Your University Name :"+uni);
			System.out.println(" Your Department :"+dep);
			System.out.println(" Java Marks :"+java);
			System.out.println(" Php Marks :"+php);
			System.out.println(" Total Marks :"+totalMarks);
			System.out.println(" Obtained Marks :"+obtain);


			 th.println("Your Name :"+name);
			 th.println("Your University :"+uni);
			 th.println("Your Department :"+dep);
			 th.println("\nJava Marks :"+java);
			 th.println("Php Marks :"+php);
			 th.println("Css Marks :"+css);
			 th.println("Total Marks :"+totalMarks);
			 th.println("Obtained Marks :"+obtain);
 
			// th.println("Your Name :"+name);
			// th.println("Your University :"+uni);
			// th.println("Your Department :"+dep);
			// th.println("\nJava Marks :"+java);
			// th.println("Php Marks :"+php);
			// th.println("Css Marks :"+css);
			// th.println("Total Marks :"+totalMarks);
			// th.println("Obtained Marks :"+obtain);

			String line=" "; 
			while((line=ob.readLine()) !=null)
				System.out.println(line);
			

		}

}