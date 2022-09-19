/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEMANA_02;

import java.util.Random;

/**
 *
 * @author ppier
 */

class Circulo {
   private  double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
   
   double calularArea(){
      return Math.PI*Math.pow(radio, 2);
   }

    public double getRadio() {
        return radio;
    }
   

}
public class Ejercicio_02 {
    
     public static  int NumeroAletorioEntero(int min,int max){
           Random rd = new Random();
        int r = rd.nextInt((max - min) + 1) + min;
        return r; 
    }
    public static void main(String[] args) {
           Circulo p =new Circulo(NumeroAletorioEntero(1,100));
           
           System.out.println("El radio es :  "+p.getRadio()+"\tEl valor de  Pi   es : "+Math.PI);
           System.out.println("El Area del  circulo es :  "+p.calularArea());
    } 
}
