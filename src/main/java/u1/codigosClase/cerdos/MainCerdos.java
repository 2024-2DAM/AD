package u1.codigosClase.cerdos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MainCerdos {
    public static void main(String[] args) {
        ArrayList<Cerdo> cerdos = new ArrayList<>();
        //Leer del fichero de texto toda la información de
        //los cerdos, crear los objetos y añadirlos al ArrayList.

        try (BufferedReader br = new BufferedReader(new FileReader("./files/u1/exportaCerdos.txt"));) {
            String nombre = "";
            //1. Leemos el nombre
            while ((nombre = br.readLine()) != null) {
                //2. Leemos la edad
                String edadString = br.readLine();
                int edad = Integer.parseInt(edadString);    //Conversión de String a int
                //3. Leemos la raza
                String raza = br.readLine();
                //4. Leemos "si" o "no" si muerde o no
                String muerdeString = br.readLine();
                boolean muerde = muerdeString.equals("si"); //Versión abreviada, (no nos dan premios por ahorrar líneas)

                //Contruir el objeto Cerdo
                Cerdo c = new Cerdo(nombre, edad, raza, muerde);

                //Meterlo en el arraylist
                cerdos.add(c);
            }
            System.out.println("Hay un total de " + cerdos.size() + "u1/codigosClase/cerdos");
        } catch (FileNotFoundException e) {
            System.err.println("El fichero no existe: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error de E/S: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error al hacer el parseInt: " + e.getMessage());
        }

        //Imprimo el contenido del ArrayList:
        for (Cerdo c : cerdos) {
            System.out.println(c);
        }
    }
}
