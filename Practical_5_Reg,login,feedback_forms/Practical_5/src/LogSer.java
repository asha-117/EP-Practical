

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LogSer
 */
public class LogSer extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		Bean b=new Bean();
		b.setEmail(email);
		DAO dao=new DAO();
		try {
			int i=dao.Insert2(b);
			if(i>0)
			{
				request.getRequestDispatcher("feedback.html").include(request, response);
			}
			else
			{
				request.getRequestDispatcher("index.html").include(request, response);
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
