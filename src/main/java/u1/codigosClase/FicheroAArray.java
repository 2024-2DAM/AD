package u1.codigosClase;

import java.io.*;
import java.util.ArrayList;

public class FicheroAArray {
    public static void main(String[] args) {
        File file = new File("./files/u1/datosCerdo.txt");
        ArrayList<String> lineas = null;
        try {
            lineas = ficheroAArrayList(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(lineas);
    }

    /**
     * Transforma un fichero de texto a un ArrayList de Strings. En cada posición de la
     * colección hay una línea del fichero.
     *
     * @param file Fichero del que lee
     * @return ArrayList con cada una de las líneas del fichero. null si el fichero no existe
     */
    public static ArrayList<String> ficheroAArrayList(File file) throws IOException {
        if (!file.exists()) {
            return null;
        }
        ArrayList<String> lineas = new ArrayList<>();
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String linea = "";
        while ((linea = br.readLine()) != null) {
            lineas.add(linea);
        }
        return lineas;
    }

    public static ArrayList<String> ficheroAArrayListV2(File file) {
        ArrayList<String> lineas = new ArrayList<>();
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr);) {
            String linea = "";
            while ((linea = br.readLine()) != null) {
                lineas.add(linea);
            }
        } catch (FileNotFoundException e) {
            return null;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lineas;
    }

}
