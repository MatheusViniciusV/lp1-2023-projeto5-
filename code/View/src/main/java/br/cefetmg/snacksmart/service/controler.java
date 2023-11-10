
package br.cefetmg.snacksmart.service;

import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author marco
 */
@WebServlet(name = "controler", urlPatterns = {"/controler"})
public class controler extends HttpServlet {
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        request.setCharacterEncoding("UTF-8");
        String pagina = request.getParameter("pagina");
        
        if(pagina.equals("EmitirRelatorio"))
            response.sendRedirect("RelatororioGerente.jsp");
        
    }
    
}
