package u1.ejerciciosClase;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EscribeFicheroV2 {
    public static void main(String[] args) {
        System.out.print("Fichero: ");
        Scanner sc = new Scanner(System.in);
        String file = sc.nextLine();
        File f = new File(file);
        System.out.println("Escribe líneas. ESC para terminar:");
        String linea = sc.nextLine();
        boolean append = false;
        if (f.exists()) {
            System.out.print("El fichero existe. ¿Quieres sobrescribir? [s/n]: ");
            String opcion = sc.nextLine();
            //La estructura de ifs es solamente para saber el true/false de append:
            if (opcion.contains("n")) {
                append = true;
            }
        }
        //Este código de abajo es copia-pega del ejercicio anterior
        try (PrintWriter pw = new PrintWriter(new FileWriter(f, append));) {
            while (!linea.equalsIgnoreCase("esc")) {
                pw.println(linea);
                linea = sc.nextLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Hasta aquí el copia-pega
    }

}
