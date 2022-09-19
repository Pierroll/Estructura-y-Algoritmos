/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEMANA_04;

/**
 *
 * @author ppier
 */

class Perro {
    private String name;
    private String raza;
    private char sexo;

    public Perro(String name, String raza, char sexo) {
        this.name = name;
        this.raza = raza;
        this.sexo = sexo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    public String getRaza() {
        return raza;
    }

    public char getSexo() {
        return sexo;
    }

   
    public String informacion() {
        return "Perro{" + "name=" + this.name + ", raza=" + this.raza + ", sexo=" +this. sexo + '}';
    }
    
    
    
    

}
public class Ejercicio_01 {
    
    public static void main(String[] args) {
         Perro p= new Perro("Dukequesa","Chusco",'F');
         System.out.println(p.informacion());
         p.setName("Luna");
         System.out.println(p.informacion());
         
         
    }
        
}
