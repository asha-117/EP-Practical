

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FeedSer extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		String email=request.getParameter("mailid");
		String comments=request.getParameter("comments");
		Bean rb=new Bean();
		rb.setName(name);
		rb.setEmail(email);
		rb.setComments(comments);
		DAO dao=new DAO();
		try {
			int i=dao.Insert3(rb);
			if(i>0)
			{
				request.getRequestDispatcher("tq.html").include(request, response);
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
