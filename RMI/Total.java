import java.rmi.*;
import java.rmi.registry.*;
public interface Total extends Remote
{
	public int add(int a,int b)throws java.rmi.RemoteException;
}
