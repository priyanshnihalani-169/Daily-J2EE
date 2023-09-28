import java.sql.*;
class P8
{
	public static void main(String args[])
	{
		Connection cn;
		PreparedStatement st;
		ResultSet rs;
		String sql;
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
			cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","priya","priya");
			
			sql = "insert into stud values(?,?,?,?)";

			st = cn.prepareStatement(sql);
			st.setInt(1,id);
			st.setString(2,name);
			st.setString(3,city);
			st.setString(4,cno);
			st.execute();
			st.execute("select * from stud");
			rs = st.getResultSet();

			System.out.println("\nRollNo\tName\tCity\tContact");
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