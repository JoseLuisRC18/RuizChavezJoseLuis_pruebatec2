
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


@WebServlet(name = "SvEditarCiudadano", urlPatterns = {"/SvEditarCiudadano"})
public class SvEditarCiudadano extends HttpServlet {
    ControladoraLogica control = new ControladoraLogica();

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         Long id = Long.parseLong(request.getParameter("id"));
         Ciudadano  ciudada = control.buscarCiudadano(id);
       
       
        HttpSession miSesion = request.getSession();
        miSesion.setAttribute("ciudadanoEditar", ciudada);
          response.sendRedirect("editarCiudadano.jsp");
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String curp = request.getParameter("curp");
        
        Ciudadano ciudada = (Ciudadano)request.getSession().getAttribute("ciudadanoEditar");
        ciudada.setNombre(nombre);
        ciudada.setApellido(apellido);
        ciudada.setCurp(curp);
        
       control.editarCiudadano(ciudada);
       List <Ciudadano>listaCiudadanos = control.buscarPorCurp(curp);
        HttpSession miSesion = request.getSession();
        miSesion.setAttribute("listaCiudadanos", listaCiudadanos);
       response.sendRedirect("index.jsp");
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
