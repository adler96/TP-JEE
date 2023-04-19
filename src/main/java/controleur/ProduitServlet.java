package controleur;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Servlet implementation class ProduitServlet
 */
public class ProduitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProduitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String libelle = request.getParameter("libelle");
		int prixU = Integer.parseInt(request.getParameter("prixU"));
		String description = request.getParameter("description");
		String dateFab = request.getParameter("dateFab");
		String dateExp = request.getParameter("dateExp");
		
		PrintWriter pw = response.getWriter();
		pw.println("Libelle: "+libelle+"\nprix Unitaire: "+prixU+"\ndescription: "+description+"\ndate de fabrication: "+dateFab+"\ndate d'expiration: "+dateExp);
		
	}

}
