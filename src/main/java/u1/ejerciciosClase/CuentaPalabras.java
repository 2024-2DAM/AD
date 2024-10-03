package u1.ejerciciosClase;

import java.io.*;
import java.util.Scanner;

public class CuentaPalabras {
    public static void main(String[] args) {
        String cadena = "hola buenos dias";

        //split: dividir
        //split(caracteres o String por los que quiero dividir el String)
        //Devuelve un array de Strings divididos

//        String[] partes = cadena.split(" ");
//        for (String parte : partes) {
//            System.out.println(parte);
//        }
//        System.out.println("El número de palabras es " + partes.length);

//        try{
            //...
//            String linea = "";
//            while ((linea = br.readLine()) != null){
//                //...
//            }
//        }

        System.out.print("Fichero: ");
        Scanner sc = new Scanner(System.in);
        String file = sc.nextLine();
        File f = new File(file);
        int palabras = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(f));) {
            String linea = "";
            while ((linea = br.readLine()) != null) {
                palabras += linea.split(" ").length;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("En total hay " + palabras + " palabras");
    }
}
