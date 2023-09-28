import java.rmi.*;
import java.rmi.registry.*;
public class TotalServer
{
	public static void main(String args[])
	{
		try
		{
			System.out.println("Server Start");
			Total t1 = new TotalImpl();
			Registry r1 = LocateRegistry.createRegistry(8888);
			r1.bind("TotalService",t1);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	
	}
}