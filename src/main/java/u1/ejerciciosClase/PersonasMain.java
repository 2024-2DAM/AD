package u1.ejerciciosClase;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class PersonasMain {
    public static void main(String[] args) {
        File f = new File("./files/personas.txt");
        //Ejercicio 7
        List<Persona> personas = importar(f);
        System.out.println(personas);

        //Ejercicio 8
        f = new File("./files/personasExp.txt");
        boolean bien = exportar(f, personas);

        //Ejercicio 9
        personas = importarV2(f);
        System.out.println(personas);
    }

    /**
     * Devuelve un List de objetos Persona con la información leída del fichero.
     * El formato del fichero debe ser, nombre\nDNI\nedad\n por cada persona.
     * @param f Fichero que contiene la información
     * @return List con objetos Persona, o null en caso de no existir el fichero.
     */
    private static List<Persona> importar(File f) {
        //TODO viernes
        return null;
    }

    /**
     * Exporta a un fichero de texto las personas pasadas en la colección.
     * El formato de exportación es, en primer lugar, el número total de personas.
     * A continuación, en cada línea, DNI-Nombre-Edad.
     * @param f Fichero al que exportar la información.
     * @param personas Colección de personas a exportar
     * @return Indica si se ha realizado correctamente o ha habido algún error.
     */
    private static boolean exportar(File f, List<Persona> personas) {
        //TODO viernes
        return false;
    }

    /**
     * Devuelve un List de objetos Persona con la información leída del fichero.
     * El formato del fichero debe ser, en primer lugar, el número total de personas.
     * A continuación, en cada línea, DNI-Nombre-Edad.
     * @param f Fichero del que importar la información
     * @return List con objetos Persona, o null en caso de no existir el fichero.
     */
    private static List<Persona> importarV2(File f) {
        //TODO viernes
        return null;
    }
}
