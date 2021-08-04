package basics;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class FirstSevlet
 */
@WebServlet(urlPatterns="/f1", initParams={
			@WebInitParam(name="dbName",value="Oracle"),
			@WebInitParam(name="uname",value="admin")
})
public class FirstSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
String dbname;
    /**
     * Default constructor. 
     */
    public FirstSevlet() {
        System.out.println("inside const");
    }
    @Override
    public void init(ServletConfig config) throws ServletException {
	// TODO Auto-generated method stub
	dbname=config.getInitParameter("dbName");
	config.getServletContext();
}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	 response.setContentType("text/html");
	 PrintWriter out=response.getWriter();	 
	 out.print("Welcome to get"+getServletContext().getAttribute("e"));
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Welcome to post Request");
	}

}
