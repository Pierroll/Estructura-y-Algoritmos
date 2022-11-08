/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examenes;

import java.util.Scanner;

/**
 *
 * @author ppier
 */

public class quicksort {
public static void main(String[] args)
	{
		quicksort qs = new quicksort();
		
         System.out.println("Escribe el tamaño del array que deseas crear");
          Scanner reader = new Scanner(System.in);
         int x= reader.nextInt();
         int[] numerosAOrdenar = new int[x];
         Scanner teclado = new Scanner(System.in);
         int i;
        for(i=0; i<numerosAOrdenar.length; i++) {
            System.out.printf("Introduzca número %d: ", i+1);
            numerosAOrdenar[i] = teclado.nextInt();}
		
		qs.quickSort(numerosAOrdenar, 0, numerosAOrdenar.length-1);
		
		for(int j=0; j<numerosAOrdenar.length;j++)
		{
			System.out.print(numerosAOrdenar[j]+", ");
		}

	}
	

	private void quickSort(int numerosAOrdenar[], int izq, int der) 
	{
		  int pivote = numerosAOrdenar[izq]; 
		  int i=izq;        
		  int j=der;    
		  int auxiliar;
		 
		  while(i < j)
		  {                                                    
		     while(numerosAOrdenar[i] <= pivote && i < j) i++; 
		     while(numerosAOrdenar[j] > pivote) j--;          
		     if (i < j) 
		     {                                         
		    	 auxiliar = numerosAOrdenar[i];                   
		    	 numerosAOrdenar[i] = numerosAOrdenar[j];
		    	 numerosAOrdenar[j] = auxiliar;
		     }
		   }
		   
		  numerosAOrdenar[izq] = numerosAOrdenar[j];                                      
		  numerosAOrdenar[j] = pivote;     
		   
		   if(izq < j-1)
		   {
			   quickSort(numerosAOrdenar,izq,j-1);          
		   }
		   if(j+1 < der)
		   {
			   quickSort(numerosAOrdenar,j+1,der);          
		   } 
	}

}