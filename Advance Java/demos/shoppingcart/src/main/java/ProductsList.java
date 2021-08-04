

import java.io.IOException;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ProductsList
 */

public class ProductsList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductsList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession mys=request.getSession(false);
		response.getWriter().println("Welcome: "+mys.getAttribute("n"));
		response.getWriter().println("<form method='get' action='Logout'>");
		response.getWriter().println("<input type='checkbox' name='item1' value='Toys'> Toys");
		response.getWriter().println("<br><input type='checkbox' name='item2' value='Soft Toys'> Soft Toys");
		response.getWriter().println("<br><input type='checkbox' name='item3' value='Puzzels'> Puzzels");
		response.getWriter().println("<br><input type='submit' value='Add to Cart'></form>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
