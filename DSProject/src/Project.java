import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Project")
public class Project extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
	public DoveQuery dove;
	
	public Project() {
		
		super();
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		if(request.getParameter("keyword")== null) {
			String requestUri = request.getRequestURI();
			request.setAttribute("requestUri", requestUri);
			request.getRequestDispatcher("s.jsp").forward(request, response);
			return;
		}
//		dove = new DoveQuery(request.getParameter("keyword"),Integer.parseInt(request.getParameter("searchNum")),request.getParameter("language"));
		dove = new DoveQuery(request.getParameter("keyword"),10,"chinese");
		WebHeap query = dove.orderedResults;
		
		
		String[][] s = new String[query.heap.size()][2];
		request.setAttribute("query", s);
		int num = 0;
		for(WebNode entry : query.heap) {
		    String key = entry.webPage.name;
		    String value = entry.webPage.url;
		    s[num][0] = key;
		    s[num][1] = value;
		    num++;
		}
		
		request.getRequestDispatcher("doveitem.jsp").forward(request, response); 
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		dove.printResult();
	}

}
