
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.hackaboss.logica.Ciudadano"%>
<%@page import="com.hackaboss.logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tramites GobMX</title>
         <!--estilos -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    </head>
    <body>
        <%
            String usu = (String)request.getSession().getAttribute("email");
            if(usu != null){
        %>
        
        <div class="container mt-4">
        <h1>Formulario Turnos tramites </h1>
        <form action="SvCiudadano" method="POST">
        <div class="form-group">
            <label for="nombre">Nombre :</label>
            <input type="text" class="form-control" id="nombre" name="nombre">
        </div>
        <div class="form-group">
            <label for="apellido">Apellido:</label>
            <input type="text" class="form-control" id="apellido" name="apellido">
        </div>
        <div class="form-group">
            <label for="telefono">CURP:</label>
            <input type="text" class="form-control" id="curp" name="curp">
        </div>
        <div class="form-group">
            <label for="telefono">Tramite</label>
            <input type="text" class="form-control" id="curp" name="tramite">
        </div>
        <div class="form-group">
            <label for="telefono">Fecha:</label>
            <input type="text" class="form-control" id="curp" name="fecha">
        </div>
          <div class="form-group">
            <label for="telefono">Estado</label>
            <input type="text" class="form-control" id="curp" name="estado">
        </div>
        <button type="submit" class="btn btn-primary">Enviar</button>
        </form>
        
        <!--busqueda -->
        
        <h1 class="mt-4">Busqueda por Curp</h1>
         <form action="SvCiudadano" method="GET">
         <div class="form-group">
                <label for="busquedaCurp">Buscar por curp:</label>
                <input type="text" class="form-control" id="busquedaCurp" name="busquedaCurp">
            </div>
            <button type="submit" class="btn btn-primary">Buscar</button>
         
        </form>
        <!--busqueda resultado  -->
        <div class="results-table mt-4">
            <h3>Busqueda</h3>
            <table class="table">
                <thead>
                     <tr>
                         <th>Nombre</th>
                         <th>Apellido</th>
                         <th>CURP</th>
                         <th>Tramite</th>
                         <th>Fecha</th>
                         <th>Estado</th>                         
                         <th>Acción</th>
                     </tr>    
                 </thead>
                 <tbody>
                    
                      <%
                           List<Ciudadano> listaCiudadanos = (List)request.getSession().getAttribute("listaCiudadanos");
                        if (listaCiudadanos!=null) { 
                        
                        for (Ciudadano ciudada:listaCiudadanos) {
                      %>
                      <tr>
                          <td><%=ciudada.getNombre()%> </td>
                          <td><%=ciudada.getApellido()%> </td>
                          <td><%=ciudada.getCurp()%> </td>
                          <td  style="display: flex; width: 230px;"> 
                                      <form name="eliminar" action="SvEliminarCiudadano" method="POST"> 
                                                            <button type="submit" class="btn btn-primary btn-user btn-block" style="background-color:red; margin-right: 5px; "> 
                                                              <i class="fas fa-trash-alt"></i>Eliminar</button>
                                          <input type="hidden" name="id" value="<%=ciudada.getId()%>"> 
                                                </form>
                                                <form name="editar" action="SvEditarCiudadano" method="GET"> 
                                                            <button type="submit" class="btn btn-primary btn-user btn-block"; style="margin-left: 5px;"> 
                                                              <i class="fas fa-pencil-alt"></i>Editar  </button>
                                                            <input type="hidden" name="id" value="<%=ciudada.getId()%>"> 
                                                </form> 
                                               
                            </td>
                          
                      </tr> 
                       <% }  %>
                 </tbody>
                <% } %>
                
            </table>
            
        </div>
            
                
       
        
        </div>
                <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
                <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    </body>
</html>
<% }
else{
response.sendRedirect("login.jsp");
}
 
%>
