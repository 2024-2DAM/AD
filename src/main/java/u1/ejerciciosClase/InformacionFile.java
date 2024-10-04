package u1.ejerciciosClase;

import java.io.File;
import java.util.Scanner;

public class InformacionFile {
    public static void main(String[] args) {
        System.out.print("Fichero: ");
        Scanner sc = new Scanner(System.in);
        String file = sc.nextLine();
        File f = new File(file);
        //1. Si existe o no
        if (!f.exists()) {
            System.out.println("No existe");
        } else {
            System.out.println("Existe");
            //2. El path completo.
            System.out.println(f.getAbsolutePath());
            //3. Si es fichero o carpeta.
            if (f.isFile()) {
                System.out.println("Es fichero");
            } else {
                System.out.println("Es carpeta");
            }
            //4. Si tiene permisos de lectura, escritura y ejecución.
            if (f.canRead()) {
                System.out.println("Tiene permisos de lectura");
            }
            if (f.canWrite()) {
                System.out.println("Tiene permisos de escritura");
            }
            if (f.canExecute()) {
                System.out.println("Tiene permisos de ejecución");
            }

            //5. En caso de ser carpeta, muestra su contenido.
            if (f.isDirectory()) {
                File[] contenido = f.listFiles();
                for (File cont : contenido) {
                    System.out.print(cont.getName());
                }
            }
        }
    }
}
