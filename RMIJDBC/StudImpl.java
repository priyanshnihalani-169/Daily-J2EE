import java.sql.*;
import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

public class StudImpl extends UnicastRemoteObject implements Stud
{
	public StudImpl()throws java.rmi.RemoteException
	{
		super();	
	} 
	public int addRec(String snm,String scity,String scno)throws java.rmi.RemoteException
	{
		int flag=0;
		try
		{
			Connection cn =DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","");

			Statement st = cn.createStatement();
			st.execute("insert into stud(snm,scity,scno) values('"+snm+"','"+scity+"','"+scno+"')");
			ResultSet rs = st.getResultSet();
			flag = 1;
     		}
		catch(Exception e)
		{
			flag = 0;
		}
		finally{
			return flag;
		}	
	}
}
