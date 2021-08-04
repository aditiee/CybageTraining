package basics;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class GenericExample
 */
@WebServlet("/GenericExample")
public class GenericExample extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public GenericExample() {
        super();
        System.out.println("In constructor");
    }
    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	  System.out.println("In init()...");
    }
	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		  System.out.println("In service"+getServletContext().getInitParameter("email"));
	}

	
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		  System.out.println("In destroy()...");
	}
}
