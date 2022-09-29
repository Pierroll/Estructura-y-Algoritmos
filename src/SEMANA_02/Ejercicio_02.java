/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEMANA_02;
//Calcular el área de un círculo 
import java.util.Scanner;
/**
 *
 * @author ppier
 */
public class Ejercicio_02 {
    
    public static void main(String[] args) {
        Scanner tecla=new  Scanner  (System.in);
        double radio, area, pi;
        pi=3.1416;
        System.out.println("Introduce el radio de el circulo: ");        
        radio=tecla.nextDouble();       
        area=pi*Math.pow(radio, 2);
        System.out.println("El área del circulo es : "+ area +" u^2");    
    }
}
