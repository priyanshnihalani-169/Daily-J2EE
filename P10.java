import java.sql.*;
class P10
{
	public static void main(String args[])
	{
		Connection cn;
		CallableStatement c1;
		int no;
		String nm,ejob;
		try
		{
			System.out.print("Enter Employee No :");
			no = Integer.parseInt(System.console().readLine());
			 

			Class.forName("oracle.jdbc.driver.OracleDriver");
			cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","priya","priya");
			 
		
			c1 = cn.prepareCall("{call pro2(?,?,?)}");
			c1.setInt(1,no);
			c1.registerOutParameter(2,Types.VARCHAR);
			c1.registerOutParameter(3,Types.VARCHAR);
		
			c1.executeUpdate();

			nm = c1.getString(2);
			ejob = c1.getString(3);

			System.out.println("Employee Name :"+nm);
			System.out.println("Employee Job :"+ejob);
		} 
		catch(Exception e){
			System.out.println("Record Not Found ....");
		}
	}
} 