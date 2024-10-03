package u1.ejerciciosClase;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EscribeFichero {
    public static void main(String[] args) {
        System.out.print("Fichero: ");
        Scanner sc = new Scanner(System.in);
        String file = sc.nextLine();
        File f = new File(file);
        System.out.println("Escribe líneas. ESC para terminar:");
        String linea = sc.nextLine();
        try (PrintWriter pw = new PrintWriter(new FileWriter(f));) {
            while (!linea.equalsIgnoreCase("esc")) {
                pw.println(linea);
                linea = sc.nextLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}