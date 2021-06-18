	import javax.servlet.RequestDispatcher;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import javax.servlet.http.HttpSession;
	import java.io.IOException;
	import java.util.ArrayList;
	@WebServlet("/listaCzesci")
public class servletListaCzesci extends HttpServlet {



		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	    }

	    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	        daoAutohandel dao=new daoAutohandel();
	        HttpSession sesja=request.getSession();

	        String nextURL="/listaCzesci.jsp";
	       


	        ArrayList<modelCzesci> lcz = dao.listaCzesci();
	        sesja.setAttribute("lcz", lcz);
	        

	        if(request.getParameterMap().containsKey("idkat")) {

	           
	            String numer_cz = request.getParameter("numer");
	            ArrayList<modelCzesci> tk = dao.listaCzesci();
	            sesja.setAttribute("tk", tk);
	            sesja.setAttribute("numer", numer_cz);

	        }else {

	            ArrayList<modelCzesci> tk = dao.listaCzesci();
	            sesja.setAttribute("tk", tk);
	        }

/*	        ArrayList<modelKlienci> lkl = dao.listaKlientów();
	        sesja.setAttribute("lkl",lkl);
	        
	        ArrayList<modelZamowienia> lza = dao.listaZamowien();
	        sesja.setAttribute("lza",lza);
	        
	        ArrayList<modelModel> lmo = dao.listaModeli();
	        sesja.setAttribute("lmo",lmo);*/
	        
	    
	   



	        RequestDispatcher rd = getServletContext().getRequestDispatcher(nextURL);
	        rd.forward(request,response);


	    
	}


}
