import java.sql.*;
class P15
{
	public static void main(String args[])
	{
		try
		{
			 
			Connection cn =DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","");
			DatabaseMetaData dmd = cn.getMetaData();
			System.out.println("Product Name :"+dmd.getDatabaseProductName());
			System.out.println("Product Version :"+dmd.getDatabaseProductVersion());
			System.out.println("Driver Name :"+dmd.getDriverName());
			System.out.println("User Name :"+dmd.getUserName());
		}
		catch(Exception e)
		{
			System.out.println("Record Not Found");
		}
	}
}

