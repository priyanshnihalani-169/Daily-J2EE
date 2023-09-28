import java.sql.*;
class P9
{
	public static void main(String args[])
	{
		Connection cn;
		PreparedStatement st;
		ResultSet rs;
		int deptno;
		String job;
		String sql;
		try
		{
			System.out.print("Enter DEPT No ::");
			deptno = Integer.parseInt(System.console().readLine());
			System.out.print("Enter Job Name ::");
			 job = System.console().readLine();			
			 		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","priya","priya");
			System.out.println(" 1 ");
			sql = "select * from emp where deptno =  ?  and job like ? ";
			System.out.println(" 2 ");
			st = cn.prepareStatement(sql);
			st.setInt(1,deptno);
			st.setString(2,job);
			System.out.println(" 3 ");
			st.execute();
			System.out.println(" 4 ");
			rs = st.getResultSet();
			System.out.println(" 5 ");
			 
			System.out.println("\nEmpNo\tEmpName\tDeptNo\tJob");
			 
			while(rs.next())
			{
				System.out.println("\n"+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(8));
			}
			 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}