package u1.ejerciciosClase;

import java.io.*;
import java.util.Scanner;

public class CuentaVocales {
    public static void main(String[] args) {
        System.out.print("Fichero: ");
        Scanner sc = new Scanner(System.in);
        String file = sc.nextLine();
        File f = new File(file);
        int vocales = 0;
        String linea = "";
        try (BufferedReader br = new BufferedReader(new FileReader(f));) {
            while ((linea = br.readLine()) != null) {
                char[] letras = linea.toLowerCase().toCharArray();
                for (int i = 0; i < letras.length; i++) {
                    if (esVocal(letras[i])) {
                        vocales++;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean esVocal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'á' || c == 'é' || c == 'í' || c == 'ó' || c == 'ú' ;
    }
}
