package u1.codigosClase;


import java.io.File;
import java.io.IOException;

public class PruebasFile {
    public static void main(String[] args) {
        //La clase File representa/apunta un fichero o un directorio
        File f = new File("./files/u1/lunes.txt");
        if (f.exists()) {
            System.out.println("El fichero existe");
        } else {
            System.out.println("El fichero no existe");
        }
        if (f.isFile()) {
            System.out.println("Es un fichero, no una carpeta");
        } else {
            System.out.println("Es una carpeta, no una fichero");
        }

        f = new File("./");
        if (f.isFile()) {
            System.out.println("Es un fichero, no una carpeta");
        } else {
            System.out.println("-->Es una carpeta, no una fichero");
        }


        //Mostrar el contenido de una carpeta
        f = new File("./files");
        File[] contenido = f.listFiles();
        if (contenido != null) {
            for (File c : contenido) {
                //1. Imprimo si es carpeta o archivo
                if (c.isDirectory()) {
                    System.out.print("carpeta:\t");
                } else {
                    System.out.print("archivo:\t");
                }
                //2. Imprimo el nombre
                System.out.print(c.getName() + "\t");

                //3. Imprimo el path relativo
                System.out.print(c.getPath() + "\t");

                //3. Imprimo el path completo
                try {
                    System.out.println(c.getCanonicalPath());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
