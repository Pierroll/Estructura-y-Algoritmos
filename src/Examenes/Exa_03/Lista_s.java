/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examenes.Exa_03;

/**
 *
 * @author ppier
 */
public class Lista_s {
    protected Nodo inicio,fin;//punteros al /*inicio*/ y al fin 
    public Lista_s(){
        inicio=null;
        fin=null;
}
    public void agregarAlInicio (String nb, int e, String ep, String des){
    inicio=new Nodo(nb, e, ep, des, inicio);
     if(fin==null) {
       fin=inicio;       
      }
    }
    public void mostartarlista(){
           Nodo recorrer=inicio;
           while (recorrer!=null) 
            recorrer=recorrer.siguiente;
     } 
}