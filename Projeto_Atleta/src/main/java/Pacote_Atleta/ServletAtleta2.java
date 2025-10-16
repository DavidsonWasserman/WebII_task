package Pacote_Atleta;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/Atleta2")
public class ServletAtleta2 extends HttpServlet {
    private static final long serialVersionUID = 1L;

	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        Atleta atleta = (Atleta) request.getAttribute("atleta");

        if (atleta != null) {
            out.println("<h1>Dados do Atleta</h1>");
            out.println("<p>Nome: " + atleta.getNome() + "</p>");
            out.println("<p>Esporte: " + atleta.getEsporte() + "</p>");
            out.println("<p>Idade: " + atleta.getIdade() + "</p>");
        } else {
            out.println("<h1>Nenhum atleta encontrado!</h1>");
        }
    }
}
