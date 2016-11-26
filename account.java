import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;
import java.util.Date;
class signup
{
	Scanner scan=new Scanner(System.in);
    void signupm(){
      try{
		  int temp=5;
    	FileWriter fw = new FileWriter("signup.txt",true);
		FileReader fr = new FileReader("signup.txt");
		BufferedReader br = new BufferedReader(fr);
		while(temp!=0){
		String s="";
		System.out.print("Enter the User name:");
		String username = scan.next();
		System.out.print("Enter the password:");
		String password = scan.next();
		int r=1;
			while((s=br.readLine())!=null)
			{
				String word[] = s.split(" ");
				if((word[0].equals(username)))
				{
					r=0;
				}
			}
			if(r==1)
			{
				fw.write("\r\n"+username+" "+password);
				System.out.println("WELCOME..!");
				break;
			}
			else
			{
				System.out.println("INVALID EXISTS");
				temp--;
			}
		}
		fw.close();		
	  }
        catch(Exception E)
        {
         System.out.println("Y<------------------>O");
        }
    }
}
class login
{
	int r=1;
	Scanner scan=new Scanner(System.in);
	void loginm()
	{
		try{
		FileReader fr = new FileReader("signup.txt");
    	//FileWriter fw = new FileWriter("signup.txt",true);
		BufferedReader br = new BufferedReader(fr);
		int temp=5;
		while(temp!=0)
		{
		String s="";
		System.out.println("Enter the User name:");
		String username = scan.next();
		System.out.println("Enter the password:");
		String password = scan.next();
			while((s=br.readLine())!=null)
			{
				String word[] = s.split(" ");
				if(word[0].equals(username))
				{
					if(word[1].equals(password))
					{
						r=0;
					}
				}
			}
			if(r==0)
			{
				System.out.println("login succ.");
				break;
			}
			else
			{
				System.out.println("INVALID");
				temp--;
			}
		}
	}
		catch(Exception e)
		{
			
		}
	}
}
class student
{
	void studentm(){
	try{
	//FileWriter fw = new FileWriter("signup.txt",true);
	FileReader fr = new FileReader("student.txt");
	BufferedReader br = new BufferedReader(fr);
	String s="";
	Scanner scan= new Scanner(System.in);
	//String name=scan.nextLine();
	String name=scan.nextLine();
	while((s=br.readLine())!=null)
	{
		String word[] = s.split(" ");
		String s2=word[1]+" "+word[2];
		if(s2.equals(name))
		{
		System.out.println("Roll no : "+word[0]+"\tname : "+s2+"\tsem 1 : "+word[3]+"\tsem 2 : "+word[4]+"\tsem 3 : "+word[5]);
		int date1=30,month1=10,year1=2016;
		int date2=20,month2=10,year2=2016;
		int date3=30,month3=10,year3=2017;
		int date4=30,month4=16,year4=2018;
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SS");
		String strDate = sdf.format(cal.getTime());
		String date=strDate.substring(0,2);
		String month=strDate.substring(3,5);
		String year=strDate.substring(6,10);
		int dates=Integer.parseInt(date);
		int months=Integer.parseInt(month);
		int years=Integer.parseInt(year);
		int z=Integer.parseInt(word[7]);
		if(word[2].equals("pending")){
		if(z==1)
		{
			if(years>=year1)
			{
				if(months>=month1)
				{
					if(dates>=date1)
					{
						System.out.println("sem 1 fees PENDING..");
					}
				}
			}
		}
	}
	if(word[2].equals("pending")){
		if(z==2)
		{
			if(years>=year2)
			{
				if(months>=month2)
				{
					if(dates>=date2)
					{
						System.out.println("sem 2 fees PENDING..");
					}
				}
			}
		}
	}
	if(word[2].equals("pending")){
		if(z==3)
		{
			if(years>=year3)
			{
				if(months>=month3)
				{
					if(dates>=date3)
					{
						System.out.println("sem 3 fees PENDING...");
					}
				}
			}
		}
	}
	if(word[2].equals("pending")){
		if(z==4)
		{
			if(years>=year4)
			{
				if(months>=month4)
				{
					if(dates>=date4)
					{
						System.out.println("sem 4 fees PENDING..");
					}
				}
			}
		}
	}
}
	}
	}
catch(Exception e)
{
	
}
}
}
class demo
{	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		signup s1 = new signup();
		student st1 = new student();
		login l1=new login();
		System.out.println("\n\n\t\tWelcome to DV Life class\n\n");
		System.out.println("Hey Are you new user if yes---> press 1 --->else 2 :)");
		int a=scan.nextInt();
		switch(a)
		{
			case 1:
			System.out.println("Signup");
			s1.signupm();
			
			case 2:
			System.out.println("Login");
			l1.loginm();
			break;
			
			default :
			System.out.println("!!..SELECT 1 Or 2 ONLY..!!");
		}
		if((l1.r)==0)
		{
			System.out.println("enter the student name : ");
			st1.studentm();
		}
	}
}



