import java.sql.*;
class P5
{
	public static void main(String args[])
	{
		try
		{
			System.out.print("Enter Your Department Number ::");
			int no = Integer.parseInt(System.console().readLine());
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","scott","tiger");
			Statement st = cn.createStatement();
			
			ResultSet rs = st.executeQuery("Select * from emp where deptno ="+no);
			System.out.println("\nENAME\tDEPTNO");
			while(rs.next())
			{
				System.out.println("\n"+rs.getString(2)+"\t"+rs.getInt(8));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}