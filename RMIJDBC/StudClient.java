import java.rmi.*;
import java.rmi.registry.*;
class StudClient
{
	public static void main(String args[])
	{
		
		System.out.print("Enter Name ::");
		String snm = System.console().readLine();

		System.out.print("Enter City ::");
		String scity = System.console().readLine();

		System.out.print("Enter Cno ::");
		String scno = System.console().readLine();
		
		try
		{
			Registry r1 = LocateRegistry.getRegistry("localhost",8888);
			Stud s1 = (Stud)r1.lookup("insert");
			int flag = s1.addRec(snm,scity,scno); 
			if(flag == 1)
			{
				System.out.println("1 Record Inserted");
			}
			else
			{
				System.out.println("Record is Not Inserted");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
}

