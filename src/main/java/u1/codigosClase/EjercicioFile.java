package u1.codigosClase;

import java.io.*;
import java.util.Scanner;

public class EjercicioFile {

    //Ejercicio en la clase "EjercicioFile":
        /*
        1. Pregunta por Scanner un fichero
        2a. Si no existe:
            2a.1. Créalo
            2a.2 Escribe "hola"
            2a.3 termina
        2b. Si existe:
            2b.1. Pregunta si quiere sobrescribir ->
            2b.2. Escribe "otra cosa" (sobrescribiendo o no, dependiendo de la respuesta anterior)
            2b.3. termina
         */
    public static void main(String[] args) {
        //1. Pregunta por Scanner un fichero
        Scanner sc = new Scanner(System.in);
        System.out.print("Fichero: ");
        String fich = sc.nextLine();
        File f = new File(fich);
        String contenido = "";
        boolean sobr = false;
        if (!f.exists()) {
            contenido = "hola";
        }else{
            contenido = "otra cosa";
            System.out.println("Sobrescribir [s/n]: ");
            String sobrescribir = sc.nextLine();
            if (sobrescribir.contains("s")) {
                sobr = true;
            }
        }
        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(fich, sobr)));) {
            pw.println(contenido);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //TODO: Ver en clase un método que pregunte si/no hasta que meta eso


    }
}
