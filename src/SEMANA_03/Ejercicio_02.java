/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEMANA_03;

import javax.swing.JOptionPane;

/**
 *
 * @author ppier
 */

public class Ejercicio_02  {
     public static void main(String[] args) {
         int seleccion = JOptionPane.showOptionDialog(
   null,
   "Seleccione opcion", 
   "Selector de opciones",
   JOptionPane.YES_NO_CANCEL_OPTION,
   JOptionPane.QUESTION_MESSAGE,
   null,    // null para icono por defecto.
   new Object[] { "1. opcion 1", "opcion 2", "opcion 3" },   // null para YES, NO y CANCEL
   "opcion 1");
    }
}
