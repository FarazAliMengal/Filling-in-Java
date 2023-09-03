import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.DataInputStream;
import java.io.FileInputStream;

class Filing10
{
	public static void main(String[] args) throws IOException,FileNotFoundException
	{	

		File file=new File("F:\\Filling\\MiniProjet.txt");
		

		PrintStream th=new PrintStream(file);
		FileInputStream th1=new FileInputStream(file);
		DataInputStream ob1=new DataInputStream(th1);
	   	DataInputStream ob=new DataInputStream(System.in);

	   
		System.out.println("\n__________________________\n");
	   	System.out.println("WELLCOME TO MINI PROJECT");
	   SystemSystem.out.println("\n__________________________\n");

	   System.out.println("\n1.Calculator");
	   System.out.println("2.Hesco-Billing");
	   System.out.println("3.Marksheet");
	   System.out.println("4.Trolly-Load");
	   System.out.println("5.Even-Odd");

	   th.println("\n_________________________\n");
	   th.println("WELLCOME TO MINI PROJECT");
	   th.println("\n_________________________\n");

	   th.println("\n1.Calculator");
	   th.println("2.Hesco-Billing");
	   th.println("3.Marksheet");
	   th.println("4.Trolly-Load");
	   th.println("5.Even-Odd");

	   System.out.print("\nEnter Your Choice :");
	   int num=Integer.parseInt(ob.readLine());

	   th.println("\nEnter Your Choice :"+num);

	   if(num==1)
	   {

	   		System.out.println("\n________________________\n");
	   		System.out.println("WELLCOME TO Calculator");
	   		System.out.println("\n________________________\n");

	   		System.out.println("\n1.Addition");
	   		System.out.println("2.Subtraction");
	   		System.out.println("3.Division");
	   		System.out.println("4.Multiplication");

	   		th.println("\n______________________\n");
	   		th.println("WELLCOME TO Calculator");
	   		th.println("\n______________________\n");

	   		th.println("\n1.Addition");
	   		th.println("2.Subtraction");
	   		th.println("3.Division");
	   		th.println("4.Multiplication");

	   		System.out.print("\nEnter Your Choice :");
	   		int num1=Integer.parseInt(ob.readLine());

	   		th.println("\nEnter Your Choice :"+num);

	   		if(num1==1)
	   		{
	   			System.out.print("Enter 1st Number :");
	   			int a=Integer.parseInt(ob.readLine());

	   			System.out.print("Enter 2nd Number :");
	   			int b=Integer.parseInt(ob.readLine());

	   			int add=a+b;
	   			System.out.print("\nAddition is :"+add);

	   			th.println("Enter 1st Number :"+a);
	   			th.println("Enter 2nd Number :"+b);
	   			th.println("Addition is :"+add);
	   		}

	   		if(num1==2)
	   		{
	   			System.out.print("Enter 1st Number :");
	   			int a=Integer.parseInt(ob.readLine());

	   			System.out.print("Enter 2nd Number :");
	   			int b=Integer.parseInt(ob.readLine());

	   			int sub=a-b;
	   			System.out.print("\nSubtraction is :"+sub);

	   			th.println("Enter 1st Number :"+a);
	   			th.println("Enter 2nd Number :"+b);
	   			th.println("Subtraction is :"+sub);
	   		}

	   		if(num1==3)
	   		{
	   			System.out.print("Enter 1st Number :");
	   			int a=Integer.parseInt(ob.readLine());

	   			System.out.print("Enter 2nd Number :");
	   			int b=Integer.parseInt(ob.readLine());

	   			int div=a/b;
	   			System.out.print("\nDivision is :"+div);

	   			th.println("Enter 1st Number :"+a);
	   			th.println("Enter 2nd Number :"+b);
	   			th.println("Division is :"+div);
	   		}

	   		if(num1==4)
	   		{
	   			System.out.print("Enter 1st Number :");
	   			int a=Integer.parseInt(ob.readLine());

	   			System.out.print("Enter 2nd Number :");
	   			int b=Integer.parseInt(ob.readLine());

	   			int multi=a*b;
	   			System.out.print("\nMultiPlication is :"+multi);

	   			th.println("Enter 1st Number :"+a);
	   			th.println("Enter 2nd Number :"+b);
	   			th.println("Multiplication is :"+multi);
	   		}

	   		String line="";
	   		while((line=ob1.readLine()) !=null)
	   			System.out.println(line);
	   }

	   if(num==2)
	   {

	   		System.out.println("\n__________________________\n");
	   		System.out.println("WELLCOME TO Hesco-Billing");
	   		System.out.println("\n__________________________\n");

	   		th.println("\n__________________________\n");
	   		th.println("WELLCOME TO HESCO-BILLING");
	   		th.println("\n__________________________\n");

	   		System.out.print("Enter Units (0-500):");
	   		int unit=Integer.parseInt(ob.readLine());

	   		th.println("Enter Units :"+unit);

	   		if(unit>=0 && unit<=100)
	   		{
	   			System.out.print("Your Bill :"+(unit*2));

	   			th.println("Your Bill :"+(unit*2));
	   		}

	   		if(unit>100 && unit<=200)
	   		{
	   			int temp1=unit-100;
	   			int total1=temp1*4;

	   			int temp2=unit-temp1;
	   			int total2=temp2*2;

	   			int total=total1+total2;
	   			System.out.print("Your Bill :"+total);

	   			th.println("Your Bill :"+total);
	   		}

	   		if(unit>200 && unit<=300)
	   		{
	   			int temp1=unit-200;
	   			int total1=temp1*6;

	   			int temp2=unit-temp1-100;
	   			int total2=temp2*4;

	   			int temp3=unit-temp1-temp2;
	   			int total3=temp3*2;

	   			int total=total1+total2+total3;
	   			System.out.print("Your Bill :"+total);

	   			th.println("Your Bill :"+total);
	   		}

	   		if(unit>300 && unit<=400)
	   		{
	   			int temp1=unit-300;
	   			int total1=temp1*8;

	   			int temp2=unit-temp1-200;
	   			int total2=temp2*6;

	   			int temp3=unit-temp1-temp2-100;
	   			int total3=temp3*4;

	   			int temp4=unit-temp1-temp2-temp3;
	   			int total4=temp4*2;

	   			int total=total1+total2+total3+total4;
	   			System.out.print("Your Bill :"+total);

	   			th.println("Your Bill :"+total);
	   		}

	   		if(unit>400 && unit<=500)
	   		{
	   			int temp1=unit-400;
	   			int total1=temp1*10;

	   			int temp2=unit-temp1-300;
	   			int total2=temp2*8;

	   			int temp3=unit-temp1-temp2-200;
	   			int total3=temp3*6;

	   			int temp4=unit-temp1-temp2-temp3-100;
	   			int total4=temp4*4;

	   			int temp5=unit-temp1-temp2-temp3-temp4;
	   			int total5=temp5*2;

	   			int total=total1+total2+total3+total4+total5;
	   			System.out.print("Your Bill :"+total);

	   			th.println("Your Bill :"+total);
	   		}

	   		String line="";
	   		while((line=ob1.readLine()) !=null)
	   			System.out.println(line);
	   }

	   if(num==3)
	   {

	   		System.out.println("\n_______________________\n");
	   		System.out.println("WELLCOME TO MARKSHEET");
	   		System.out.println("\n_______________________\n");

	   		th.println("\n________________________\n");
	   		th.println("WELLCOME TO MARKSHEET");
	   		th.println("\n________________________\n");
	   		
	   		System.out.print("Enter Your Name :");
	   		String name=ob.readLine();

	   		System.out.print("Enter University :");
	   		String uni=ob.readLine();

	   		System.out.print("Enter DepartMent :");
	   		String dep=ob.readLine();

	   		System.out.print("Enter Year :");
	   		String year=ob.readLine();

	   		System.out.print("Enter Java Marks :");
	   		int java=Integer.parseInt(ob.readLine());

	   		System.out.print("Enter Php Marks :");
	   		int php=Integer.parseInt(ob.readLine());

	   		System.out.print("Enter Css Marks :");
	   		int css=Integer.parseInt(ob.readLine());

	   		int total=300;
	   		int obtain=java+php+css;

	   		System.out.println("\nName :"+name);
	   		System.out.println("University :"+uni);
	   		System.out.println("DepartMent :"+dep);
	   		System.out.println("Year :"+year);

	   		System.out.println("\nJava Marks :"+java);
	   		System.out.println("Php Marks :"+php);
	   		System.out.println("Css Marks :"+css);

	   		System.out.println("Total Marks :"+total);
	   		System.out.println("Obtain Marks :"+obtain);

	   		th.println("Enter Your Name :"+name);
	   		th.println("Enter University :"+uni);
	   		th.println("Enter DepartMent :"+dep);
	   		th.println("Enter Year :"+year);
	   		th.println("\nEnter Java Marks :"+java);
	   		th.println("Enter Php Marks :"+php);
	   		th.println("Enter Css Marks :"+css);

	   		th.println("\nName :"+name);
	   		th.println("University :"+uni);
	   		th.println("DepartMent :"+dep);
	   		th.println("Year :"+year);

	   		th.println("\nJava Marks :"+java);
	   		th.println("Php Marks :"+php);
	   		th.println("Css Marks :"+css);
	   		th.println("Total Marks :"+total);
	   		th.println("Obtain Marks :"+obtain);

	   		String line="";
	   		while((line=ob1.readLine()) !=null)
	   			System.out.println(line);
	   }

	   if(num==4)
	   {
	   		System.out.print("Total Atoms :");
	   		int atom=Integer.parseInt(ob.readLine());

	   		System.out.print("Enter Per Load Price :");
	   		int load=Integer.parseInt(ob.readLine());

	   		int totalincome=atom*load;

	   		int driverpay=totalincome*25/100;
	   		int tool=totalincome*12/100;
	   		int diesal=totalincome*10/100;

	   		int profit=totalincome-driverpay-tool-diesal;

	   		System.out.println("Total Income is :"+totalincome);
	   		System.out.println("Driver-Pay :"+driverpay);
	   		System.out.println("Tool Tax :"+tool);
	   		System.out.println("Diesal :"+diesal);

	   		System.out.println("\nDriver Profit :"+profit);

	   		th.println("Enter Total Atoms :"+atom);
	   		th.println("Enter Per Load Price :"+load);

	   		th.println("\nTotal Income :"+totalincome);
	   		th.println("Driver-Pay :"+driverpay);
	   		th.println("Tool Tax :"+tool);
	   		th.println("Diesal :"+diesal);

	   		th.println("\nDriver Profit :"+profit);

	   		String line="";
	   		while((line=ob1.readLine()) !=null)
	   			System.out.println(line);
	   }

	   if(num==5)
	   {
	   		System.out.print("Enter Any Number :");
	   		int num1=Integer.parseInt(ob.readLine());

	   		th.println("Enter Any Number :"+num1);

	   		if(num1%2==0)
	   		{
	   			System.out.print("It is Even Number ");
	   			th.println("It is Even Number");
	   		}

	   		else 
	   		{
	   			System.out.print("It is Odd Number ");
	   			th.print("It is Odd Number ");
	   		}

	   		String line="";
	   		while((line=ob1.readLine()) !=null)
	   			System.out.println(line);
	   }

	   if(num==6)
	   	System.exit(0);
	   	
	}
}