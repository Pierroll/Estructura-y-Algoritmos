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

class Producto{
   private int  codigo;
       String descripcion;
       int cantidad;
       double  precio_Unitario; 

    public Producto(int codigo, String descripcion, int cantidad, double precio_Unitario) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio_Unitario = precio_Unitario;
    }
      double calcularPrecioTotal(){
          
          return   cantidad*precio_Unitario;
      }
      
      double calcularIGV(){
           return calcularPrecioTotal()*0.18;
      }
      
      double calcularMontoToataPagar(){
          return  calcularPrecioTotal()+calcularIGV();
      }
      
      
    
    public String mostrarProducto(){
        return "Codigo : " + codigo + "\nDescripcion :  " +    descripcion  + " \nCantidad :  " + cantidad + "\nprecio_Unitario :  " + precio_Unitario ;
    }

}
public class Ejercicio_03 {
     public static  int     numeroAletorioEntero(int min,int max){
           Random rd = new Random();
        int r = rd.nextInt((max - min) + 1) + min;
        return r; 
    }
      double numeroAletorioDecimal(int min, int max) {
        Random r1= new Random();
        double s = min + (max - min) * r1.nextDouble();
        return s;
    }
    public static void main(String[] args) {
      
           Producto p =  new Producto(numeroAletorioEntero(100,1000),"Tv",numeroAletorioEntero(1,1000),numeroAletorioEntero( 1,100));
           System.out.println("Datos de Producto:  \n "+p.mostrarProducto()+"\n\nEl Precio Total : "+p. calcularPrecioTotal()+"\nEl IGV  es :  "+p.calcularIGV());
           System.out.println("El monto  Total a pagar es : "+p.calcularMontoToataPagar());
    }
}
