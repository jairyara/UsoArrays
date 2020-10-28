/*
Segundo Punto del Parcial Programación I
Integrantes: Edinson Jair Yara Rueda
             Miguel David Ruiz Sánchez

En este ejercicio libre de una manera similar al punto anterior vamos a hacer el mismo tipo de registro
de personas pero incluyendo a las mascotas. Esto representa un sistema de registro de una veterinaria
*/
import java.util.ArrayList;
import java.util.Scanner;
public class main {

    //creacion del arrayList de las personas
    static ArrayList<Persona> personas = new ArrayList();
    static Scanner sc = new Scanner(System.in);

    //creacion del Array List de las mascotas
    static ArrayList<Mascota> mascotas = new ArrayList();


    public static void main (String ... args) {
        //lectura de personas
        if (numeroDeMascotas() > 0) {
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

    //Método que lee los datos de cada mascota y les añade al ArrayList
    public static void leerMascotas() {

        String nombre, direccion, ciudad;
        Fecha fecha;
        Mascota masc;
        int codigoPostal, N, i, dia, mes, anio;

        do {
            System.out.println("Número de Mascotas ");
            N = sc.nextInt();
        } while (N < 0);
        sc.nextLine();

        for (i = 1; i <= N; i++) {
            System.out.print("Nombre: ");
            nombre = sc.nextLine();
            do {
                System.out.println("Fecha de Nacimiento: ");
                System.out.println("Día: ");
                dia = sc.nextInt();
                System.out.println("Mes: ");
                mes = sc.nextInt();
                System.out.println("Año: ");
                anio = sc.nextInt();
                fecha = new Fecha(dia, mes, anio);
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
            masc = new Mascota();
            masc.setNombre(nombre);
            masc.setFechaNacimiento(fecha);
            masc.setDireccion(direccion);
            masc.setCodigoPostal(codigoPostal);
            masc.setCiudad(ciudad);

            //se añade al objeto Array
            mascotas.add(masc);
        }
    }

    //Mostrar todas las personas
    public static void mostrar() {
        for (int i = 0; i < mascotas.size(); i++) {
            System.out.println(mascotas.get(i));
        }
    }

    //devuelve el numero de personas que contiene el array
    public static int numeroDeMascotas() {
        return mascotas.size();
    }

    //Devuelve la persona mayor de edad
    //En este metodo se utiliza el metodo esMayorQue() añadido a la clase Fecha
    public static Persona personaMayorEdad() {
        Mascota aux = mascotas.get(0);
        for (int i = 0; i < mascotas.size(); i++) {
            if (mascotas.get(i).getFechaNacimiento().esMayorQue(aux.getFechaNacimiento())) {
                aux = mascotas.get(i);
            }
        }
        return aux;
    }
    //calcula el número de personas que viven en la ciudad
    public static int cuantasPersonasVivenEn(String ciudad){
        int cont = 0;
        for(int i= 0; i<mascotas.size(); i++) {
            if (mascotas.get(i).getCiudad().equalsIgnoreCase(ciudad)){
                cont++;
            }
        }
        return cont;
    }
}//fin de la clase principal