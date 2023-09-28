import java.rmi.*;
import java.rmi.registry.*;
public interface SI extends Remote
{
	public int add(int p,int r,int n)throws java.rmi.RemoteException;
}
