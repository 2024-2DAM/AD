package u1.codigosClase;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FicherosTexto {
    public static void main(String[] args) {
        System.out.println("Vamos a leer el contenido de un fichero");
        //Leerlo con FileReader (MUY poco eficiente, en general nunca se hace así).
        try {
            FileReader fr = new FileReader("./files/u1/f.txt");
            int caracter = fr.read();
            while (caracter != -1) {
                System.out.print((char)caracter);
                caracter = fr.read();
            }
            fr.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error al crear el objeto de la clase FileReader: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Error al leer: " + e.getMessage());
        }

        //Escribir con FileWriter
        try {
            FileWriter fw = new FileWriter("./files/u1/f.txt");    //Este constructor sobrescribe
            fw.write("hola que tal\n");
            //fw.flush(); //Lo escribe en el fichero
            fw.write(101 + "\n");
            fw.close();
        } catch (IOException e) {
            System.err.println("Error al crear FileWriter: " + e.getMessage());
            e.printStackTrace();
        }

        //FileWriter para concatenar: el constructor con String, boolean append
        try {
            FileWriter fw = new FileWriter("./files/u1/f.txt", true);    //Este constructor sobrescribe
            fw.write("\nEsto se concatena :)");
            fw.close();
        } catch (IOException e) {
            System.err.println("Error al crear FileWriter: " + e.getMessage());
        }

        //Qué pasa si el fichero no existe en un FileWriter
        try {
            FileWriter fw = new FileWriter("./files/u1/nuevo.json");    //Si no existe, lo crea
            fw.write("cosas nuevas");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
