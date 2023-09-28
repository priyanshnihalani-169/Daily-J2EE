import java.rmi.*;
import java.rmi.registry.*;
public class SIServer
{
	public static void main(String args[])
	{
		try
		{
			System.out.println("Server Start");
			SI s1 = new SIImpl();
			Registry r1 = LocateRegistry.createRegistry(8888);
			r1.bind("SIService",s1);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	
	}
}