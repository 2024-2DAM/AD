package u1.codigosClase;

import java.io.*;

public class FicherosTextoBuffer {
    public static void main(String[] args) {
        //String fichero = "/home/sete/IdeaProjects/ADU1/files/a.txt";  Así no, porque no sería portable
        String fichero = "./files/a.txt";
//        try {
//            FileWriter fw = new FileWriter(fichero);
//            //Envuelvo el FileWriter en un BufferedWriter (más fácil de usar, más eficiente)
//            BufferedWriter bw = new BufferedWriter(fw);
//            bw.write("una línea");
//            bw.newLine();   //Imprime el salto de línea propio del SO que se esté usando
//            bw.write("otra línea");
//            bw.close();
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        }

        //Voy a escribir a la vez en dos ficheros:
        String fichero1 = "./files/u1/nuevo.txt";
        String fichero2 = "./files/u1/a.txt";
        try {
            FileWriter fw1 = new FileWriter(fichero1);
            FileWriter fw2 = new FileWriter(fichero2, true);
            //Envuelvo el FileWriter en un BufferedReader (más fácil de usar, más eficiente)
            BufferedWriter bw1 = new BufferedWriter(fw1);
            BufferedWriter bw2 = new BufferedWriter(fw2);
            bw1.write("una línea");
            bw1.newLine();   //Imprime el salto de línea propio del SO que se esté usando
            bw2.write("esto va al fich de viernes");
            bw1.close();
            bw2.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        //Otra opción es envolver el FileWriter en un PrintWriter
        fichero = "./files/u1/a.txt";
        try {
            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fw); //Envuelvo FileWriter en un BufferedWriter
            PrintWriter pw = new PrintWriter(bw);   //Envuelvo BufferedWriter en PrintWriter
            pw.println("una linea");
            pw.println("otra linea");
            pw.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        //TRY WITH RESOURCES (nuestro nuevo mejor amigo):
        fichero = "./files/u1/a.txt";
        try (FileWriter fw = new FileWriter(fichero);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter pw = new PrintWriter(bw);) {
            pw.println("una linea");
            pw.println("otra linea");
            //pw.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        // Leer con BufferedReader:
        fichero = "./files/u1/b.txt";
        try (FileReader fr = new FileReader(fichero);
             BufferedReader br = new BufferedReader(fr);){
            String linea = br.readLine();
            while(linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Otro error: " + e.getMessage());
        }

        // Voy a darle una vueltecita al while para que quede más pro:
        System.out.println("Con un bucle while mejorado:");
        fichero = "./files/u1/b.txt";
        try (FileReader fr = new FileReader(fichero);
             BufferedReader br = new BufferedReader(fr);){
            String linea = "";
            while( (linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Otro error: " + e.getMessage());
        }

        // Declaraciones todas en una misma línea:
        // Con PritWriter:
        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("./files/b.txt", true)));) {
//            FileWriter fw = new FileWriter("./files/b.txt", true);
//            BufferedWriter bw = new BufferedWriter(fw);
//            PrintWriter pw = new PrintWriter(bw);
            pw.println("jejeje");
        } catch (IOException e) {
            e.printStackTrace();
        }





        try{
            String fich = "./files/u1/prueba.txt";
//            FileReader fr = new FileReader(fich);   //Si no existe: excepción
//            FileWriter fw = new FileWriter(fich);   //Si no existe: lo crea. Si existía: borra el contenido
//            FileWriter fw2 = new FileWriter(fich, true);   //Si no existe: lo crea. Si existía: concatena

        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
