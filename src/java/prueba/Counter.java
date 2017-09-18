/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author Alejandro
 */
public class Counter {
   private int number, reused;
   public void add(){
      number++;
   }

   public Counter() {
      this.number = 0;
      this.reused = 0;
   }

   public void Reset() {
      this.number = 0;
      reused++;
   }   

   public int getNumber() {
      return number;
   }

   public int getReused() {
      return reused;
   }
   
}
