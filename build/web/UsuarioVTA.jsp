<%-- 
    Document   : UsuarioVTA
    Created on : 3/02/2022, 10:51:59 p.m.
    Author     : Gigabyte
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale = 1, shrink-ti-fit = no">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
        <title>Vista de Usuario</title>
    </head>
    <body>
        <div class="container">
            <h1>Usuarios</h1>
            <table class="table">
                <thead class="thead-dark">
                    <th scope="col">N° ID</th>
                    <th scope="col">Primer nombre</th>
                    <th scope="col">Segundo nombre</th>
                    <th scope="col">Primer apellido</th>
                    <th scope="col">Segundo apellido</th>
                    <th scope="col">Identificacion</th>
                    <th scope="col">Correo</th>
                    <th scope="col">Clave</th>
                    <th scope="col">Sexo</th>
                    <th scope="col">Estado</th>
                    <th scope="col">Fecha de nacimiento</th>
                    <th scope="col">Acciones</th>
                </thead>
                <tbody>
                    <c:forEach var="objU" items="${Lista_Usuarios}">
                        <tr>
                            <td>${objU.getID()}</td>
                            <td>${objU.getPri_Nombre()}</td>
                            <td>${objU.getSeg_Nombre()}</td>
                            <td>${objU.getPri_Apellido()}</td>
                            <td>${objU.getSeg_Apellido()}</td>
                            <td>${objU.getIdentificacion()}</td>            
                            <td>${objU.getCorreo()}</td>
                            <td>${objU.getClave()}</td>
                            <td>${objU.getSexo()}</td>
                            <td>${objU.getFecha_nac()}</td>
                            <td>${objU.getEstado()}</td>  
                            <td>
                                <a class="btn btn-outline-primary">Editar</a>
                                <a class="btn btn-outline-danger">Eliminar</a>
                                <a class="btn btn-outline-success">Ver</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF" crossorigin="anonymous"></script>        
    </body>
</html>
