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

class  TrianguloRectangulo{
    private double cateto1;
    private double  cateto2;

    public TrianguloRectangulo(double cateto1, double cateto2) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }

    public double getCateto1() {
        return cateto1;
    }

    public double getCateto2() {
        return cateto2;
    }
    
    
    double calularArea(){
        return (cateto1*cateto2)/2;
    }
      double calcularHipotenusa() {
        return Math.pow(cateto1 * cateto1 + cateto2* cateto2, 0.5);
    }
      
      void determinarTipoTriangulo() {
        if ((cateto1 == cateto2) && (cateto1 == calcularHipotenusa()) && (cateto2== calcularHipotenusa())) {
            
          System.out.println("Es un triángulo equilátero");
                    } else if  ((cateto1 != cateto2) && (cateto1 != calcularHipotenusa()) &&(cateto2 != calcularHipotenusa())) {
                       System.out.println("Es un triángulo escaleno");
                       
                       
        }else 
                        System.out.println("Es un triángulo isósceles");
                                
    }  
}

public class Ejercicio_01 {
    
    public static  int NumeroAletorioEntero(int min,int max){
           Random rd = new  Random();
        int r = rd.nextInt((max - min) + 1) + min;
        return r; 
    }
    public static void main(String[] args) {
         // int a,b;
         // Random random = new Random();
            //  a=random.nextInt((20-1)+0)+0;
          //    b=random.nextInt((20-1)+0)+0;
          TrianguloRectangulo  p = new   TrianguloRectangulo( NumeroAletorioEntero(0,20), NumeroAletorioEntero(0,30));
          System.out.println("La hipotenusa es :  "+      p.calcularHipotenusa());
          System.out.println("El Area es  :  "+p.calularArea());
          p.determinarTipoTriangulo();
          System.out.println("Catet1 es :  "+p.getCateto1()+"\tCateto2 es :   "+p.getCateto2()+"\tLa Hipotenusa es :  "+p.calcularHipotenusa());
    }
}