/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examenes;


/**
 *
 * @author ppier
 */
public class Examen_01 {
    
   public static void main(String[] args) {
    int [] a  = {8,7,8,4,2,4};//creamos nuestro array
    int iterador = 0;//creamos variable que recorra nuestro array 

    for (int i = 0; i < 6 ; i++) { //comparamos los elementos  de nuestro array 
        for (int j = 1; j < (6 - i); j++) {
            if (a[j - 1] > a[j]) {
                iterador = a[j - 1];
                a[j - 1] = a[j];
                a[j] = iterador;
            }
        }
    }
    System.out.println("Ordenado de menor a mayor:");
    for (int i = 0; i < 6 ; i++){
    System.out.print(a[i]+" ");
    }
    //hacemos la sumatoria 
    
    int acumulado =0 ;
    for (int i = 0; i < 6 ; i++) { //sumamos los elementos 
       
           acumulado=acumulado + a[i];
            
            
        }
    System.out.print("\nEl acumulado es: \n" + acumulado+"\n");
    
   //soltar el promedio 
  double promedio = (double)acumulado/a.length;

   System.out.print("El promedio de los elementos de el arreglo es: \n");
   System.out.println(promedio);
   
   //mostar los números pare de el array
   int  b [];
   b= new int [6];
   
   for (int i = 0; i < 6 ; i++){{
       if (a[i]%2==0){
           a[i]=b[i];
       }
   }
    System.out.print("Los numeros pares de el array son: ");
   for (i=0; i<6; i++){
       System.out.println(b[i]);
   }
   
   
}
 }
}
