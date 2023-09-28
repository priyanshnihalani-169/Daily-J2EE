import java.sql.*;
public class J2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","scott","tiger");
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("Select * from emp");
			System.out.println("\nEMPNO\tENAME\tJOB\tSAL");
			while(rs.next())
			{
				System.out.println("\n"+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(6));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
