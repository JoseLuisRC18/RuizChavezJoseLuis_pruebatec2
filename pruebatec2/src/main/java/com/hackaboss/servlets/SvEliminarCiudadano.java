
package com.hackaboss.servlets;

import com.hackaboss.logica.Ciudadano;
import com.hackaboss.logica.ControladoraLogica;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "SvEliminarCiudadano", urlPatterns = {"/SvEliminarCiudadano"})
public class SvEliminarCiudadano extends HttpServlet {
    ControladoraLogica control = new ControladoraLogica();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    
    

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Long id = Long.parseLong(request.getParameter("id"));
        
        Ciudadano  ciudadano = control.buscarCiudadano(id);
        control.eliminarCiudadano(id);
        
        List <Ciudadano>listaCiudadanos = control.buscarPorCurp(ciudadano.getCurp());
        HttpSession miSesion = request.getSession();
        miSesion.setAttribute("listaCiudadanos", listaCiudadanos);
          response.sendRedirect("index.jsp");
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
