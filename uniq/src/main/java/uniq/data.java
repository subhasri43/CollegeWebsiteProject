package uniq;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class data
 */
@WebServlet("/data")
public class data extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("html/text");
		PrintWriter out=response.getWriter();
		String ename=request.getParameter("name");
		String epass=request.getParameter("pass");
		String eemail=request.getParameter("email");
		String ephoneno=request.getParameter("phoneno");
		empbean empb=new empbean();
		empb.setname(ename);
		empb.setpass(epass);
		empb.setmail(eemail);
		empb.setphoneno(ephoneno);
		
		
		int c=0;
		try {
			c= sign.save(empb);
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		if(c>0) {
		 response.sendRedirect("front.jsp");
			
		}
		else {
			out.println("go");
		}
	
	}

}
