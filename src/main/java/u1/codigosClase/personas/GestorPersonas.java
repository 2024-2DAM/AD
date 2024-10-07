package u1.codigosClase.personas;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorPersonas {

    private static ArrayList<Persona> personas = new ArrayList<Persona>();

    public static void main(String[] args) {

        /* PERSISTENCIA: al iniciar el programa verifico si existe el fichero en el que guardo los datos,
        y si existe, los recupero para trabajar con ellos.
         */
        personas = leerDatos();
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
                    // PERSISTENCIA: al terminar el programa, guardo todos los datos en ./files/u1/gestorpersonas
                    guardarDatos();
                    break;
                default:
                    System.out.println("Elige una opción válida.");
            }
        }
    }

    /**
     *
     * @return ArrayList con las personas leídas del fichero. Si el fichero no existía devuelve un ArrayList vacío
     */
    private static ArrayList<Persona> leerDatos() {
        ArrayList<Persona> personas = new ArrayList<>();
        //Si no existe el fichero gestorpersonas NO PASA NADA, continúa la ejecución normal
        // SI existe, leo los datos y devuelvo el arrayList.
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./files/u1/gestorpersonas"))) {
            personas = (ArrayList<Persona>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("El fichero de personas no existe");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return personas;
    }

    private static void guardarDatos() {
        //Guardar en un fichero binario el arrayList con todas las personas
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./files/u1/gestorpersonas"));) {
            oos.writeObject(personas);  //peronas es de tipo ArrayList<Persona>
        } catch (IOException e) {
            throw new RuntimeException(e);
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
        System.out.println("TODO");
    }


}
