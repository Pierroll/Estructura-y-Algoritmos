package Examenes;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 
 */

interface Actvidades {
    String Trabajar(String tipoTrabajo);
}

class Persona {
    public String Dni;
    public String Nombre;
    public int Edad;
}

class Trabajador extends Persona implements Actvidades {
    public String habilidad1;
    public String habilidad2;
    public String habilidad3;
    public double EspectativaSueldo;
    
    public Trabajador(String Dni, String Nombre, int Edad, String habilidad1, String habilidad2, String habilidad3, double EspectativaSueldo) {
        this.Dni = Dni;
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.habilidad1 = habilidad1;
        this.habilidad2 = habilidad2;
        this.habilidad3 = habilidad3;
        this.EspectativaSueldo = EspectativaSueldo;
    }

    @Override
    public String Trabajar(String tipoTrabajo) {
        return "El trabajador " + this.Nombre + " está trabajando en " + tipoTrabajo;
    }
}

class Trabajo {
    public String habilidadRequerida;
    public double pago;
    
    public Trabajo(String habilidadRequerida, double pago) {
        this.habilidadRequerida = habilidadRequerida;
        this.pago = pago;
    }
}


public class Examen_03 {
    public static void main(String[] args) {
        List<Trabajador> trabajadores = new LinkedList<>();
        List<Trabajo> trabajos = new LinkedList<>();
        
        int option;
        do {
            System.out.println("Bienvendio al menu   1) Para agregar trabajador,    2) Para agregar trabajos,   3) ara listar los trabajadores con sus trabajos,   Cualquier otro número para salir.");
            Scanner scn = new Scanner(System.in);
            option = scn.nextInt();
            switch(option) {
                case 1 : 
                    Scanner scn3 = new Scanner(System.in);
                    Scanner scn4 = new Scanner(System.in);
                    System.out.println("ingrese los datos del trabajador");
                    System.out.println("ingrese el dni del trabajador");
                    String dni = scn3.nextLine();
                    System.out.println("ingrese el nombre del trabajador");
                    String nombre = scn3.nextLine();
                    trabajadores.add(new Trabajador(dni, nombre));
                    break;
                case 2:
                    Scanner scn1 = new Scanner(System.in);
                    Scanner scn2 = new Scanner(System.in);
                    System.out.println("ingrese los datos del trabajo.");
                    System.out.println("Habilidad requerida");
                    String habilidad = scn1.nextLine();
                    System.out.println("Pago");
                    double pago = scn2.nextDouble();
                    trabajos.add(new Trabajo(habilidad, pago));
                    break;
                case 3:
                    break;
                default:
                    option = -1;
            }
        } while (option == -1);
    }
}