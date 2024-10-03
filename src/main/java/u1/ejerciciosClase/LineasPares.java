package u1.ejerciciosClase;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class LineasPares {
    public static void main(String[] args) {
        String fichero = "./files/u1/lineaspares.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(fichero));) {
            String line = "";
            while ((line = br.readLine()) != null) {
                String lineaPar = br.readLine();
                if (lineaPar != null){
                    System.out.println(lineaPar);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
