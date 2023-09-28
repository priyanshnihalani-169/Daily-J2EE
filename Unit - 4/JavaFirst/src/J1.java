import java.sql.*;
public class J1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn =DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","");

			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("Select * from stud");

			System.out.println("\nID\tName\tCity\tCno");
	
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
