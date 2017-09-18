<%-- 
    Document   : index
    Created on : 17-sep-2017, 19:12:26
    Author     : Alejandro
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
      <title>Formulario</title>
   </head>
   <body>
      <div id="principal" >
         <h1>Formulario</h1>
         <form method="get" action="GuardarRegistro">
            <label for="nombre ">Nombre: </label>
            <input id="nombre" type="text" name="nombre" required> <br>

            <label for="aPaterno">Apellido Paterno: </label>
            <input id="aPaterno" name="aPaterno" type="text"  required> <br>

            <label for="aMaterno">Apellido Materno: </label>
            <input id="aMaterno"  name="aMaterno" type="text"  > <br>

            <label for="fNacimieno" required>Fecha de nacimiento: </label>
            <input id="fNacimiento" name="fNacimiento" type="date" > <br>

            <label for="email" required>E-mail: </label>
            <input id="email" name="email" type="email"  required> <br>

            <label for="curp" required>CURP: </label>
            <input id="curp" name="curp" type="text" > <br>

            <label for="sexo" >Sexo: </label>
            <select name="sexo" required>
               <option value="Masculino">Masculino</option>
               <option value="Femenino">Femenino</option>
               <option value="Otro">Otro</option>
            </select>
            <br>
            <input type="submit" value="Añadir">
         </form>
      </div>
   </body>
</html>
<a href=""></a>