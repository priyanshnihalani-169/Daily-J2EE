import java.io.IOException;
import java.io.PrintWriter;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloWorldExample extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException, ServletException
    {
         
       response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html><html>");
        out.println("<head>");
        out.println("<title>First servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Welcome To Ruparel</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}



