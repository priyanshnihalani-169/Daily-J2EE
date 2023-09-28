import java.rmi.*;
import java.rmi.registry.*;
public class StudServer
{
	public static void main(String args[])
	{
		try
		{
			System.out.println("Server Start");
			Stud s1 = new StudImpl();
			Registry r1 = LocateRegistry.createRegistry(8888);
			r1.bind("insert",s1);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	
	}
}