/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEMANA_03;

/**
 *
 * @author ppier
 */
import java.util.Scanner;

public class Ejercicio_04 {
    
    public static void main(String[] args) {
        Scanner tecla= new Scanner(System.in); 
        int array [] = new int [20];
 
        for (int i=0; i<20; i++){
            System.out.print("Ingrese dato "+ (i+1)+" : " );
            array [i] = tecla.nextInt(); 
        }

     int iterador=0;
     for (int i = 0; i < 20 ; i++) {
        
           for (int j = 1; j < (20 - i); j++) {
                  if (array[j - 1] > array[j]) {
                 iterador = array[j - 1];
                 array[j - 1] = array[j];
                  array[j] = iterador;
                }
            }
        }
     System.out.println("El numero menor de le array es : "+array[1]);
     } 
}
