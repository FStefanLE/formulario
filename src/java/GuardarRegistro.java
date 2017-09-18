/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import prueba.Formulario;

/**
 *
 * @author Alejandro
 */
public class GuardarRegistro extends HttpServlet 
{

   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {/*
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        final String nombre= request.getParameter("nombre");
        final String aPaterno= request.getParameter("aPaterno");
        final String aMaterno= request.getParameter("aMaterno");
       // SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
//        Date fNacimiento = null;
//        try {
          final String fNacimiento = request.getParameter("fNacimiento");
//           fNacimiento = formatter.parse(request.getParameter("fNacimiento"));
//        } catch (ParseException ex) { }
        final String email = request.getParameter("email");
        final String curp = request.getParameter("CURP");
        final String sexo = request.getParameter("sexo");
        Formulario form1=new Formulario();
        
        form1.setNombre(nombre);
        form1.setaPaterno(aPaterno);
        form1.setaMaterno(aMaterno);
        form1.setfNacimiento(fNacimiento);
        form1.setemail(email);
        form1.setCurp(curp);
        form1.setSexo(sexo);
        
        try{
        Class.forName("com.mysql.jdbc.Driver");

         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/formulario","root","alex");
         Statement stmt= (Statement) con.createStatement();

        // ResultSet rs=
                 //stmt.executeUpdate("INSERT INTO `formulario`.`usuarios` (`nombre`, `aPaterno`, `aMaterno`, `fNacimento`, `email`, `curp`, `sexo`) VALUES ('alex', 'esq', 'asd', '1992-12-12', 'aesquivel.com', 'nada', 'masculino');");
         stmt.executeUpdate("INSERT INTO `formulario`.`usuarios` "
                 + "(`nombre`, `aPaterno`, `aMaterno`, `fNacimento`, `email`, `curp`, `sexo`)"
                 + " VALUES ("
                 + "'"+form1.getNombre()+"', "
                 + "'"+form1.getaPaterno()+"', "
                 + "'"+form1.getaMaterno()+"',"
                 + " '"+form1.getfNacimiento()+"', "
                 + "'"+form1.getemail()+"', "
                 + "'"+form1.getCurp()+"', "
                 + "'"+form1.getSexo()+"');");
         con.close();
        }catch(Exception e){ System.out.println(e);}
        
        out.print(form1.getNombre());
out.print(form1.getaPaterno());
out.print(form1.getaMaterno());
out.print(form1.getfNacimiento());
out.print(form1.getemail());
out.print(form1.getCurp());
out.print(form1.getSexo());
        
        out.print("<a href='index.jsp'>Regresar</a>  ");*/
    }
    

}
