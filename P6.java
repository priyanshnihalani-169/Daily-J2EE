import java.sql.*;
class P6
{
	public static void main(String args[])
	{
		try
		{
			System.out.println(" 1 ");			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","priya","priya");
			Statement st = cn.createStatement();
			System.out.println(" 2 ");
			st.execute("create table stud(id number(3) primary key,name varchar2(50),city varchar2(50),cno varchar2(10))"); 
			System.out.println(" 3 ");
			st.execute("insert into stud values(1,'Aaaa','Jun','1234567890')");
			st.executeQuery("Select * from stud");
			ResultSet rs = st.getResultSet();
			System.out.println("\nId\tName\tCity\tCno");
			while(rs.next())
			{
				System.out.println("\n"+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}