package u1.codigosClase;

import u1.codigosClase.cerdos.Cerdo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FicherosBinariosLectura {
    public static void main(String[] args) {
        //Leo del fichero binario
        try (FileInputStream fis = new FileInputStream("./files/u1/pruebas.bin");
             ObjectInputStream ois = new ObjectInputStream(fis);) {
            //Tengo que leer exactamente en el mismo orden que escribí:
            boolean money = ois.readBoolean();
            double amount = ois.readDouble();
            char abrev = ois.readChar();
            int numberAccounts = ois.readInt();
            String div = ois.readUTF();

            //Leo los numeros
            /* esto no se hace así, es muy complejo
            int cantidad = ois.readInt();
            int[] numeros = new int[cantidad];
            for (int i = 0; i < cantidad; i++) {
                numeros[i] = ois.readInt();
            }
             */

            int[] numeros = (int[]) ois.readObject();

            //Leo el objeto cerdo
            Cerdo c = (Cerdo) ois.readObject();


            System.out.println("FIN");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.err.println("Error del casting: " + e.getMessage());
        }
    }
}
