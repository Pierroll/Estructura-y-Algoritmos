/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEMANA_05;

import java.util.Random;

/**
 *
 * @author ppier
 */

public class Ejercicio_02 {
    
    static void llenar(int  []  array){
        
        Random  rc= new   Random();
        for (int i = 0; i < array.length; i++) {
                 array[i ]=rc.nextInt(11);
        }
    
    }
    
    static void  mostrar(int []  array){
        for (int i = 0; i < array.length; i++) {
                System.out.println("El numero " +(i+1) +": "+  array[i]);
        }
    }
    public static void main(String[] args) {
             int vec[]= new int[7];
             
             llenar(vec);
             mostrar(vec );
    }
}
