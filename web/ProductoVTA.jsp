<%-- 
    Document   : ProductoVTA
    Created on : 3/02/2022, 7:30:34 a.m.
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
              <title> Vista de productos</title>
    </head>
    <body>
        <div class="container">
        <h1>Productos</h1>
        
        <table class="table">
            <thead class="thead-dark">
                <tr>
                    <th scope="col">N° ID</th>
                    <th scope="col">Nombre</th>
                    <th scope="col">Descripcion</th>
                    <th scope="col">Unidades</th>
                    <th scope="col">Valor</th>
                    <th scope="col">Acciones</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="objP" items="${Lista_productos}">
                    <tr>
                        <td>${objP.getId_prod()}</td>
                        <td>${objP.getNombre()}</td>
                        <td>${objP.getDescripcion()}</td>
                        <td>${objP.getUnd()}</td>
                        <td>${objP.getValor()}</td>
                        <td>
                            <a type="button" class="btn btn-outline-primary">Editar</a>
                            <a type="button" class="btn btn-outline-danger" href="ProductoCTL?accion=eliminar&id=${objP.getId_prod()}">Eliminar</a>
                            <a type="button" class="btn btn-outline-success">Ver</a>
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
