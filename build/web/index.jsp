<%-- 
    Document   : index
    Created on : 3/02/2022, 7:30:10 a.m.
    Author     : Gigabyte
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">        
        <title>JSP Page</title>
    </head>
    <body>
        <div class="modal-dialog text-center">
            <div class = "col-lg-8">
                <div class = "modal-content">
                    <div class="col-12">
                        <img src="Img/avatar.png" alt="avatar" height="126" width="126">    
                    </div>
                    <form action="MisesionCTO?accion=validar" method="POST" class="col-12">
                        <div class="foirm-goup text-center">
                            <p>
                                Bienvenido al sistema
                            </p>
                        </div>
                        <div class="form-group">
                            <label>Usuario:</label>
                            <input type="text" name="txtusuario" placeholder="ejemplo@correo.com" class="form-control" required>
 
                        </div>
                        <div class="form-group">
                            <label>Clave de acceso:</label>
                            <input type="password" name="txtclave" placeholder="clave" class="form-control" required>
                        </div>    
                        
                        <input type="submit" name="btningresar" value="Ingresar" class="form-control"  required>
                    </form>
                </div>
            </div> 
        </div>
        <a href="ProductoCTL?accion=listar">Listar Productos</a>
        <a href="UsuarioCTL">Listar Usuarios</a>
        <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF" crossorigin="anonymous"></script>           
    </body>
</html>
