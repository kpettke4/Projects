	import javax.servlet.RequestDispatcher;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import javax.servlet.http.HttpSession;
	import java.io.IOException;
	import java.util.ArrayList;
	@WebServlet("/listaStanu")
public class servletListaStanu extends HttpServlet {



		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	    }

	    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	        daoAutohandel dao=new daoAutohandel();
	        HttpSession sesja=request.getSession();

	        String nextURL="/listaStanu.jsp";
	       



	        ArrayList<modelStan> lst = dao.listaStanu();
	        sesja.setAttribute("lst",lst);
	        
	    
	   



	        RequestDispatcher rd = getServletContext().getRequestDispatcher(nextURL);
	        rd.forward(request,response);


	    
	}


}
