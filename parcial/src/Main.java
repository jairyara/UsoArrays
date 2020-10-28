/*Parcial II corte
Integrantes:  -Miguel David Ruiz Sánchez
              -Edinson Jair Yara Rueda

Nombre del programa: arrays.java

Descripción del programa: Este programa es realizado para validar los conocimientos adquiridos
en el tema de Arrays
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //Se crea el ArrayList de Personas
    static ArrayList<Persona> personas = new ArrayList();
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        //Se leen personas y se introducen en el ArrayList
        leerpersonas();
        if (numeroDePersonas() > 0) {
            //se muestran todas las personas introducidas
            System.out.println("\nPersonas introducidas: ");
            mostrar();
            //se muestra la persona mayor de edad
            System.out.println("\nPersona de mayor edad");
            System.out.println(personaMayorEdad());
            //se muestran todas las personas que viven en Elche
            System.out.println("\nNúmero de personas que viven Bogotá: " + cuantasPersonasVivenEn("Bogotá"));
            //se muestra el número de personas mayores de edad
            System.out.println("\nNúmero de personas mayores de edad");
        }
    }

    //Método que lee los datos de cada persona y les añade al ArrayList
    public static void leerpersonas() {

        String nombre, direccion, ciudad;
        Fecha fecha;
        Persona p;
        int codigoPostal, N, i, dia, mes, año;

        do {
            System.out.println("Número de personas? ");
            N = sc.nextInt();
        } while (N < 0);
        sc.nextLine();

        for (i = 0; i <= N; i++) {
            System.out.println("Fecha de Nacimiento: ");
            System.out.print("Nombre: ");
            nombre = sc.nextLine();
            do {
                System.out.println("Día: ");
                dia = sc.nextInt();
                System.out.println("Mes: ");
                mes = sc.nextInt();
                System.out.println("Año: ");
                año = sc.nextInt();
                fecha = new Fecha(dia, mes, año);
            } while (!fecha.fechaCorrecta());
            sc.nextLine();
            System.out.println("Dirección");
            direccion = sc.nextLine();
            System.out.println("Código postal: ");
            codigoPostal = sc.nextInt();
            sc.nextLine();
            System.out.println("Ciudad: ");
            ciudad = sc.nextLine();

            //se crea nueva instancia de persona
            p = new Persona();
            p.setNombre(nombre);
            p.setFechaNacimiento(fecha);
            p.setDireccion(direccion);
            p.setCodigoPostal(codigoPostal);
            p.setCiudad(ciudad);

            //se añade al objeto Array
            personas.add(p);
        }
    }

    //Mostrar todas las personas
    public static void mostrar() {
        for (int i = 0; i < personas.size(); i++) {
            System.out.println(personas.get(i));
        }
    }

    //devuelve el numero de personas que contiene el array
    public static int numeroDePersonas() {
        return personas.size();
    }

    //Devuelve la persona mayor de edad
    //En este metodo se utiliza el metodo esMayorQue() añadido a la clase Fecha
    public static Persona personaMayorEdad() {
        Persona aux = personas.get(0);
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getFechaNacimiento().esMayorQue(aux.getFechaNacimiento())) {
                aux = personas.get(i);
            }
        }
        return aux;
    }
    //calcula el número de personas que viven en la ciudad
     public static int cuantasPersonasVivenEn(String ciudad){
        int cont = 0;
        for(int i= 0; i<personas.size(); i++) {
            if (personas.get(i).getCiudad().equalsIgnoreCase(ciudad)){
                cont++;
            }
        }
        return cont;
     }
}//fin de la clase principal