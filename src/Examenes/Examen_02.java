/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examenes;

import java.util.Scanner;

/**
 *
 * @author Pierol
 */

class sistema_operativo{
    String nombre;
    String tipo;
    String fecha_creacion;
    float  version;
}
class windows extends sistema_operativo   {
    public windows (String nombre,String tipo,String fecha_creacion,float version){
         this.nombre=nombre;
      this.tipo=tipo;
      this.fecha_creacion=fecha_creacion;
      this.version=version;
    }
    
}

class linux extends sistema_operativo  {
     public linux (String nombre,String tipo,String fecha_creacion,float version ){
      this.nombre=nombre;
      this.tipo=tipo;
      this.fecha_creacion=fecha_creacion;
      this.version=version;
      
     }
     
     
}
class mac extends sistema_operativo{
      public mac (String nombre,String tipo,String fecha_creacion,float version){
      this.nombre=nombre;
      this.tipo=tipo;
      this.fecha_creacion=fecha_creacion;
      this.version=version;
      } 
}

public class Examen_02 {
    public static void main(String[] args) {
     sistema_operativo[] array= new sistema_operativo[5];
     
        for (int i = 0; i < 1; i++) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Ingrese el sistema operativo");
            String so = scn.nextLine();
            array[i] = crearSO(so.toLowerCase());
        }
        
        
        for (int i = 0; i < 1; i++) {
            System.out.println("Sistema operativo: " + array[i].nombre +" "+ array[i].tipo + " " +array[i].fecha_creacion +" "+ array[i].version);
        }
     
     }
   public static sistema_operativo crearSO(String So){
         Scanner in = new Scanner(System.in);
         String nombre = in.nextLine();
         String tipo = in.nextLine();
          String fecha_creacion = in.nextLine();
      
         Float version = in.nextFloat();
        return switch (So) {
            case "linux" -> new linux(nombre,tipo,fecha_creacion,version);
            case "mac" -> new mac(nombre,tipo,fecha_creacion,version);
            default -> new windows(nombre,tipo,fecha_creacion,version);
        };
     }
   
}
