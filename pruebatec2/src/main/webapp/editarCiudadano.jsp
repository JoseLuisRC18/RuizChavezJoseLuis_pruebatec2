

<%@page import="com.hackaboss.logica.Ciudadano"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tramites GobMX</title>
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    </head>
    <body>
       <div class="container mt-4">
        <h1>Formulario Ciudadanos </h1>
        <form action="SvCiudadano" method="POST">
            <%Ciudadano ciudada = (Ciudadano)request.getSession().getAttribute("editarCiudadano"); %>
        <div class="form-group">
            <label for="nombre">Nombre :</label>
            <input type="text" class="form-control" id="nombre" name="nombre" value="<%=ciudada.getNombre() %>">
        </div>
        <div class="form-group">
            <label for="apellido">Apellido:</label>
            <input type="text" class="form-control" id="apellido" name="apellido" value="<%=ciudada.getApellido()%>"  >
        </div>
        <div class="form-group">
            <label for="telefono">CURP:</label>
            <input type="text" class="form-control" id="curp" name="curp" value="<%=ciudada.getCurp()%>">
        </div>
        <button type="submit" class="btn btn-primary">Modificar</button>
        </form>
         </div>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
         <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    </body>
</html>
