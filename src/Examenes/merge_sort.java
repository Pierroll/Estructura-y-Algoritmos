/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examenes;
 import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author ppier
 */



// Merge sort in Java

class Main {

  // Merge two sub arrays L and M into array
  void merge(int array[], int p, int q, int r) {

    int n1 = q - p + 1;
    int n2 = r - q;

    int L[] = new int[n1];
    int M[] = new int[n2];

    // fill the left and right array
    for (int i = 0; i < n1; i++)
      L[i] = array[p + i];
    for (int j = 0; j < n2; j++)
      M[j] = array[q + 1 + j];

    // Maintain current index of sub-arrays and main array
    int i, j, k;
    i = 0;
    j = 0;
    k = p;

    // Until we reach either end of either L or M, pick larger among
    // elements L and M and place them in the correct position at A[p..r]
    // for sorting in descending
    // use if(L[i] >= <[j])
    while (i < n1 && j < n2) {
      if (L[i] <= M[j]) {
        array[k] = L[i];
        i++;
      } else {
        array[k] = M[j];
        j++;
      }
      k++;
    }

    // When we run out of elements in either L or M,
    // pick up the remaining elements and put in A[p..r]
    while (i < n1) {
      array[k] = L[i];
      i++;
      k++;
    }

    while (j < n2) {
      array[k] = M[j];
      j++;
      k++;
    }
  }

  // Divide the array into two sub arrays, sort them and merge them
  void mergeSort(int array[], int left, int right) {
    if (left < right) {

      // m is the point where the array is divided into two sub arrays
      int mid = (left + right) / 2;

      // recursive call to each sub arrays
      mergeSort(array, left, mid);
      mergeSort(array, mid + 1, right);

      // Merge the sorted sub arrays
      merge(array, left, mid, right);
    }
  }

  public static void main(String args[]) {

    // created an unsorted array
      System.out.println("Escribe el tamaño del array que deseas crear");
      Scanner reader = new Scanner(System.in);
          int x= reader.nextInt();
      
       int[] elementos = new int[x];

    Main ob = new Main();
 Scanner teclado = new Scanner(System.in);
    int i;
        for(i=0; i<elementos.length; i++)
        {
            System.out.printf("Introduzca número %d: ", i+1);
            elementos[i] = teclado.nextInt();
        }
    // call the method mergeSort()
    // pass argument: array, first index and last index
    ob.mergeSort(elementos, 0, elementos.length - 1);

    System.out.println("ordenado Array:");
    System.out.println(Arrays.toString(elementos));
  }
}