package Pacote_Logado;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Ola(nome)")
public class OlaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 
	@Override
	    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {

	        response.setContentType("text/html;charset=UTF-8");
	        
	        PrintWriter out = response.getWriter();

	        HttpSession sessao = request.getSession(false);

	        if (sessao != null && sessao.getAttribute("usuario") != null) {
	            String nome = (String) sessao.getAttribute("usuario");
	            out.println("<h1>Olá, " + nome + "!</h1>");
	        } else {
	            response.sendRedirect("login.html");
	        }
	}
}
