import java.rmi.*;
import java.rmi.registry.*;
public interface Stud extends Remote
{
	public int addRec(String snm,String scity,String scno)throws java.rmi.RemoteException;
}
