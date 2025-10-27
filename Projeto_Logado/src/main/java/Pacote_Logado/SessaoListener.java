package Pacote_Logado;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;


@WebListener
public class SessaoListener implements HttpSessionListener {

	@Override
 	public void sessionCreated(HttpSessionEvent se)  { 
		System.out.println("Sessão criada: ID = " + se.getSession().getId());
    }

	@Override
    public void sessionDestroyed(HttpSessionEvent se)  { 
        System.out.println("Mais uma sessão encerrada, prenda melhor a atenção dos seus usuários!");
    }
	
}
