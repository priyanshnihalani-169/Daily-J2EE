import java.rmi.*;
import java.rmi.registry.*;
class SIClient
{
	public static void main(String args[])
	{
		int p,r,n;
		System.out.print("Enter Amount ::");
		p = Integer.parseInt(System.console().readLine());
		System.out.print("Enter Rate of Amount ::");
		r = Integer.parseInt(System.console().readLine());
		System.out.print("Enter Number of Year ::");
		n = Integer.parseInt(System.console().readLine());
		
		try
		{
			Registry r1 = LocateRegistry.getRegistry("localhost",8888);
			SI s1 = (SI)r1.lookup("SIService");
			System.out.println("\nSimple Interest is ::"+s1.add(p,r,n));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
}

