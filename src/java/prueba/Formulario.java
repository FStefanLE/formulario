/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.Date;

/**
 *
 * @author Alejandro
 */
public class Formulario {
   private String Nombre, aPaterno, aMaterno, curp, sexo, email;
   String fNacimiento;

   public void setNombre(String Nombre) {
      this.Nombre = Nombre;
   }

   public void setaPaterno(String aPaterno) {
      this.aPaterno = aPaterno;
   }

   public void setaMaterno(String aMaterno) {
      this.aMaterno = aMaterno;
   }

   public void setCurp(String curp) {
      this.curp = curp;
   }
   
   public void setemail(String email) {
      this.email = email;
   }

   public void setSexo(String sexo) {
      this.sexo = sexo;
   }

   public void setfNacimiento(String fNacimiento) {
      this.fNacimiento = fNacimiento;
   }

   public String getNombre() {
      return Nombre;
   }

   public String getaPaterno() {
      return aPaterno;
   }

   public String getaMaterno() {
      return aMaterno;
   }

   public String getCurp() {
      return curp;
   }

   public String getSexo() {
      return sexo;
   }

   public String getfNacimiento() {
      return fNacimiento;
   }
   
   public void guardarRegistro(){
      
   }

   public String getemail() {
      return email;
   }
   

   
   
}
