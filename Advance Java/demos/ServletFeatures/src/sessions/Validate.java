package sessions;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Validate
 */
@WebServlet("/Validate")
public class Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Validate() {
        // TODO Auto-generated constructor stub
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        String user = request.getParameter("uname");
        String pass = request.getParameter("pass");
        
        if(pass.equals("123"))
        {
            //creating a session
    HttpSession session = request.getSession(true);
            // true will check for existing and will create if not there and false will also check but will not create if not found
    System.out.println(session.isNew());
     session.setAttribute("user", user);
    response.sendRedirect("Welcome");
            
           
            //for cookies
             /*Cookie ck = new Cookie("username",user);
                     
               response.addCookie(ck);
               response.sendRedirect("Welcome");
            */
            //for url rewritting
        //   response.sendRedirect("Welcome?user_name="+user+"");
            
          //creating a new hidden form field
     /* out.println("<form action='Welcome'>");
 out.println("<input
  type='hidden' name='user' value='"+user+"'>");
out.println("<input type='submit' value='submit' >");
out.println("</form>");*/
            
        }
        else
        	response.getWriter().append("Sorry Wrong Password");
        
        
    }
}
