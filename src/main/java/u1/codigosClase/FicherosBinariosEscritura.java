package u1.codigosClase;

import u1.codigosClase.cerdos.Cerdo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FicherosBinariosEscritura {
    public static void main(String[] args) {
        //Escribir en un fichero binario
        try (FileOutputStream fos = new FileOutputStream("./files/u1/pruebas.bin");
             ObjectOutputStream oos = new ObjectOutputStream(fos);) {

            //Voy a escribir datos que utilizo en mi programa:
            double cantidad = 5430.24;
            boolean hayDinero = true;
            char inicial = 'E';
            int numeroDeCuentas = 2;
            String divisa = "Euro";

            //Importantísimo el orden de escritura (porque tendré que leer en el mismo orden)
            oos.writeDouble(cantidad);
            oos.writeBoolean(hayDinero);
            oos.writeChar(inicial);
            oos.writeInt(numeroDeCuentas);
            oos.writeUTF(divisa);

            int[] numeros = {2, 6, 9, -3, 99};
            /* esto no se hace así, es muy complejo
            oos.writeInt(numeros.length);
            for (int i = 0; i < numeros.length; i++) {
                oos.writeInt(numeros[i]);
            }
             */
            oos.writeObject(numeros);
            Cerdo c = new Cerdo("pig", 3, "r", false);
            oos.writeObject(c);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
