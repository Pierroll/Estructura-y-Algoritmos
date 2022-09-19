/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package SEMANA_07;

/**
 *
 * @author ppier
 */

abstract  class Animal{
    abstract void comer();
}

class Perro  extends Animal{
    
    void comer(){
        System.out.println("Come ricocang");
    }
}

class Gato  extends Animal{
   void comer(){
       System.out.println("Come carne ");
   }
}
public class Ejercicio_02 {
    public static void main(String[] args) {
         Animal  perro1 = new  Perro();
         Animal gato1 = new  Gato();
         
         perro1.comer();
         gato1.comer();
    }
}