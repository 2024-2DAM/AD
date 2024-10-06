package u1.codigosClase.personas;

import java.util.ArrayList;
import java.util.Scanner;

public class GestorPersonas {
    private static ArrayList<Persona> personas = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("1. Dar de alta");
            System.out.println("2. Eliminar");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt(); //TODO Control de erores: que el programa no finalice si introduce algo que no es un número
            switch (opcion) {
                case 1:
                    alta();
                    break;
                case 2:
                    baja();
                    break;
                case 0:
                    System.out.println("Hasta pronto!");
                    break;
                default:
                    System.out.println("Elige una opción válida.");
            }
        }

    }

    private static void alta() {
        System.out.println("*** ALTA ***");
        Scanner sc = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        System.out.print("Id: ");
        String id = sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Edad: ");
        int edad = scInt.nextInt();
        System.out.println("Tiene trabajo? [s/n]: ");
        String t = sc.nextLine().toLowerCase();
        boolean trabajo = false;
        if (t.contains("s")) {
            trabajo = true; //TODO control de errores: verificar que mete "s" o "n" (sin importar mayúsuclas/minúsculas). Que siga preguntándolo hasta que meta s/n.
        }
        personas.add(new Persona(id, nombre, edad, trabajo));
    }

    private static void baja() {
        System.out.println("*** BAJA ***");
        for (Persona p : personas) {
            System.out.println(p);
        }
        System.out.print("id de la persona que quieres dar de baja: ");
        //TODO terminar esta parte: 1) comprobar que existe el id, 2) eliminar a esa persona del ArrayList.
        //System.out.println("TODO");
        //if ()
    }


}
