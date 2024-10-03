package u1.ejerciciosClase;

import java.io.File;
import java.util.ArrayList;

public class PersonasMain {
    public static void main(String[] args) {
        File f = new File("./files/personas.txt");
        //Ejercicio 7
        ArrayList<Persona> personas = importar(f);
        System.out.println(personas);

        //Ejercicio 8
        f = new File("./files/personasExp.txt");
        boolean bien = exportar(f, personas);

        //Ejercicio 9
        personas = exportarV2(f);
        System.out.println(personas);
    }

    private static ArrayList<Persona> importar(File f) {
        //TODO el viernes
        return null;
    }

    private static boolean exportar(File f, ArrayList<Persona> personas) {
        //TODO el viernes
        return false;
    }

    private static ArrayList<Persona> exportarV2(File f) {
        //TODO el viernes
        return null;
    }
}
