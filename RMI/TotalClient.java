import java.rmi.*;
import java.rmi.registry.*;
class TotalClient
{
	public static void main(String args[])
	{
		int a,b,c;
		System.out.print("Enter First Number ::");
		a = Integer.parseInt(System.console().readLine());
		System.out.print("Enter Second Number ::");
		b = Integer.parseInt(System.console().readLine());
		
		try
		{
			Registry r1 = LocateRegistry.getRegistry("localhost",8888);
			Total t1 = (Total)r1.lookup("TotalService");
			System.out.println("\nTotal is ::"+t1.add(a,b));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
}

