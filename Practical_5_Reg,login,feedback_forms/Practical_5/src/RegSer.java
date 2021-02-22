

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegSer
 */
public class RegSer extends HttpServlet {
	private static final long serialVersionUID = 1L;

  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int regno=Integer.parseInt(request.getParameter("regno"));
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		Bean rb=new Bean();
		rb.setRegno(regno);
		rb.setName(name);
		rb.setEmail(email);
		DAO dao=new DAO();
		try {
			int i=dao.Insert1(rb);
			if(i>0)
			{
				request.getRequestDispatcher("login.html").include(request, response);
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
