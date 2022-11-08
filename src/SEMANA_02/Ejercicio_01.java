/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Carclular la hipotenusa
package SEMANA_02;
import java.util.Scanner;
/**
 *
 * @author Pierol
 */
public class Ejercicio_01 {
   public static void main(String[] args) {
        
    double cateto_01, cateto_02;
    Scanner sc=new Scanner(System.in);
       System.out.println("Introducción el valor del primer cateto: "); 
       cateto_01=sc.nextDouble();  
       System.out.println("Introducción el valor del segundo cateto: "); 
       cateto_02=sc.nextDouble();  
       double Hipotenusa=Math.sqrt(Math.pow(cateto_01,2)+Math.pow(cateto_02, 2));
       System.out.println("La hipotenusa es: "+Hipotenusa);
     }
}
