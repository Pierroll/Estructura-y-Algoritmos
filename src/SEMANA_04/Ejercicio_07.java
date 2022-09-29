/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEMANA_04;

/**
 *
 * @author ppier
 */
public class Ejercicio_07 {
    public static void main(String[] args) {
        int array []=new  int [10];
        System.out.println("Array Desordenado: ");
     for (int i=0; i<9;i++){
          array [i] =(int)(Math.random()*15+5);
          System.out.print(array[i]+" " );
          }       
      int iterador = 0;//creamos variable que recorra nuestro array 

      for (int i = 0; i < 9 ; i++) { //comparamos los elementos  de nuestro array 
          for (int j = 1; j < (9 - i); j++) {
            if (array[j - 1] > array[j]) {
                   iterador = array[j - 1];
                   array[j - 1] = array[j];
                   array[j] = iterador;
                }
            } 
           System.out.println();
        }
        System.out.println("Array ordenado: ");
         for (int i = 0; i < 9 ; i++){
          System.out.print(array[i]+" ");
         }
      
     }
    
}   
