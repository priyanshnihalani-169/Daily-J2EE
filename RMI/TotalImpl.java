import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

public class TotalImpl extends UnicastRemoteObject implements Total
{
	public TotalImpl()throws java.rmi.RemoteException
	{
		super();	
	} 
	public int add(int a,int b)throws java.rmi.RemoteException
	{
		return a + b;
	}
}
