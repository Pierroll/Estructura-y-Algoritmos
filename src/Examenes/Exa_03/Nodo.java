/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examenes.Exa_03;

/**
 *
 * @author ppier
 */
public class Nodo {
    public String nombre;  
    public int    edad;
    public String especie;
    public String desplazamiento;
    public Nodo siguiente;

    public Nodo(String nb, int e, String ep, String des) {
        this.nombre = nb;
        this.edad = e;
        this.especie = ep;
        this.desplazamiento = des;
    }

    public Nodo(String nb, int e, String ep, String des, Nodo sig) {
            nombre = nb;
            edad = e;
            especie = ep;
            desplazamiento = des;
            siguiente = sig;  
    }
}
