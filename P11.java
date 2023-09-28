import java.sql.*;
class P11
{
	public static void main(String args[])
	{
		 
		CallableStatement c1;
		int no;
		String nm,ct;
		try
		{
			System.out.print("Enter Student Id :");
			no = Integer.parseInt(System.console().readLine());


			 
			Connection cn =DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","");
			 

		
			c1 = cn.prepareCall("{call disprec(?,?,?)}");
			c1.setInt(1,no);
			c1.registerOutParameter(2,Types.VARCHAR);
			c1.registerOutParameter(3,Types.VARCHAR);
		
			c1.executeUpdate();

			nm = c1.getString(2);
			ct = c1.getString(3);

			System.out.println("Employee Name :"+nm);
			System.out.println("Employee Job :"+ct);
		} 
		catch(Exception e){
			System.out.println("Record Not Found ....");
		}
	}
} 