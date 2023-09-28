import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

public class SIImpl extends UnicastRemoteObject implements SI
{
	public SIImpl()throws java.rmi.RemoteException
	{
		super();	
	} 
	public int add(int p,int r,int n)throws java.rmi.RemoteException
	{
		return p * r * n/100;
	}
}
