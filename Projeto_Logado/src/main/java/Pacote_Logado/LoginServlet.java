package Pacote_Logado;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 @Override
	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
		 
	        String nome = request.getParameter("nome");
	        HttpSession sessao = request.getSession(true);
	        sessao.setAttribute("usuario", nome);
	        sessao.setMaxInactiveInterval(60);
	        response.sendRedirect("Ola(nome)");
	    }

}
