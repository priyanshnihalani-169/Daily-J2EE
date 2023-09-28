import java.sql.*;
class P14
{
	public static void main(String args[])
	{
		 
 
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","scott","tiger");
			Statement s1 = cn.createStatement();
			ResultSet r1 = s1.executeQuery("select * from emp");
			ResultSetMetaData rs1 = r1.getMetaData();

			int no = rs1.getColumnCount();
			System.out.println("Number of Column :"+no);	
			for(int i=1;i<=no;i++)
			{
				System.out.println(i+"Column Name :"+rs1.getColumnName(i)+" -- "+rs1.getColumnTypeName(i)+" -- "+rs1.getColumnDisplaySize(i));
			}
		
		
		}catch(Exception e){
			System.out.println("Record Not Found");
		}
	}
}

