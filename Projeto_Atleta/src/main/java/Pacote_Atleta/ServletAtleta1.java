package Pacote_Atleta;

import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/Atleta")
public class ServletAtleta1 extends HttpServlet {
    private static final long serialVersionUID = 1L;

	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        Atleta atleta = null;

        switch (id) {
            case 1:
                atleta = new Atleta("João", "Esporte1", 20);
                break;
            case 2:
                atleta = new Atleta("Ana", "Esporte2", 21);
                break;
            case 3:
                atleta = new Atleta("José", "Esporte3", 22);
                break;
            default:
                atleta = new Atleta("Sem Nome", "Nenhum", 0);
        }

        request.setAttribute("atleta", atleta);
        RequestDispatcher rd = request.getRequestDispatcher("Atleta2");
        rd.forward(request, response);
    }
}
