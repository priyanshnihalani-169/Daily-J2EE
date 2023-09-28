import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
 
public class Stud extends HttpServlet {
	String unm,ct,cno;
	@Override	
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException, ServletException
    	{
         	res.setContentType("text/html");
        	PrintWriter out = res.getWriter();

        	out.println("<!DOCTYPE html><html>");
        	out.println("<head>");
        	out.println("<title>First servlet</title>");
        	out.println("</head>");
        	out.println("<body>");
		unm = req.getParameter("unm");
		ct = req.getParameter("ct");
		cno = req.getParameter("cno");
        	out.println("<h1>Student Information</h1>");
		out.println("<table border = 1>");
		out.println("<tr><td><h2>Student Name ::</h2></td><td><h2>"+unm+"</h2></td> </tr>");
		out.println("<tr><td><h2>Student City ::</h2></td><td><h2>"+ct+"</h2></td> </tr>");
		out.println("<tr><td><h2>Student Cno ::</h2></td><td><h2>"+cno+"</h2></td> </tr>");
		out.println("</table>");
        	

		try
		{
			 
			Connection cn =DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","");	 
			Statement st = cn.createStatement();
			st.execute("insert into stud(snm,scity,scno)values('"+unm+"','"+ct+"','"+cno+"')");
			ResultSet rs = st.getResultSet();
			out.println("<h2>Record Insert successfully....</h2>");
		}
		catch(Exception e)
		{
			out.println(e);
		}
		out.println("</body>");
        	out.println("</html>");	
    	}
}



