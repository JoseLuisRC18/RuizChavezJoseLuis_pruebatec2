
package com.hackaboss.servlets;

import com.hackaboss.logica.Ciudadano;
import com.hackaboss.logica.ControladoraLogica;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "SvCiudadano", urlPatterns = {"/SvCiudadano"})
public class SvCiudadano extends HttpServlet {

    ControladoraLogica control = new ControladoraLogica();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String busquedaCurp = request.getParameter("busquedaCurp");
        ArrayList<Ciudadano> listaCiudadanos = control.buscarPorCurp(busquedaCurp);
        HttpSession miSesion = request.getSession();
        miSesion.setAttribute("listaCiudadanos", listaCiudadanos);
        response.sendRedirect("index.jsp");
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String curp = request.getParameter("curp");
        
         //metodo de logica
        control.crearCiudadano(nombre, apellido, curp);
       
        //redirecciona al index
        response.sendRedirect("index.jsp");
        
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
