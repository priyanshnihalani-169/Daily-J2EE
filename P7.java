import java.sql.*;
class P7
{
	public static void main(String args[])
	{
		try
		{
			System.out.print("Enter ID ::");
			int id = Integer.parseInt(System.console().readLine());
			System.out.print("Enter Your Name ::");
			String name = System.console().readLine();			
			System.out.print("Enter Your City ::");
			String city = System.console().readLine();			
			System.out.print("Enter Your Number ::");
			String cno = System.console().readLine();			


			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","priya","priya");
			Statement st = cn.createStatement();

			  
	
			st.execute("insert into stud values('"+id+"','"+name+"','"+city+"','"+cno+"')");
			ResultSet rs = st.getResultSet();
			 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}