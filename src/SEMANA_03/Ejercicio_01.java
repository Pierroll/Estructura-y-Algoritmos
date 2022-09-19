/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEMANA_03;

/**
 *
 * @author ppier
 */
import javax.swing.JOptionPane;

public class Ejercicio_01 {
       public static void main(String[] args) {
             int numero,fact=1;
             
             numero =Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero a sacar el  Factorial"));
             
             for (int i = 1; i <= numero ; i++) {
                       fact *=i;
           }
             JOptionPane.showMessageDialog(null,"El factoeial del numero  es:   "+fact);         
    }
}