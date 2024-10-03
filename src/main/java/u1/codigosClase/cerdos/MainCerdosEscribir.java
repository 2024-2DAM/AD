package u1.codigosClase.cerdos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class MainCerdosEscribir {
    public static void main(String[] args) {
        //Construimos 3 cerdos, los metemos en un ArrayList
        ArrayList<Cerdo> cerdos = new ArrayList<>();
        cerdos.add(new Cerdo("uno", 10, "raza1", true));
        cerdos.add(new Cerdo("dos", 11, "raza2", false));
        cerdos.add(new Cerdo("tres", 12, "raza3", false));

        //Lo guardamos en el fichero "exportaCerdos.txt" con el formato que vimos antes
        try (PrintWriter pw = new PrintWriter(new FileWriter("./files/u1/exportaCerdos.txt"));) {
            for (Cerdo cerdo : cerdos) {
//                pw.println(cerdo.getNombre());
//                pw.println(cerdo.getEdad());
//                pw.println(cerdo.getRaza());
//                //Muerde:
////                pw.println(cerdo.isMuerde()); Esto no vale,
////                porque imprimiría "true" o "false", y yo quiero "si" o "no"
//                if (cerdo.isMuerde()) {
//                    pw.println("si");
//                } else {
//                    pw.println("no");
//                }
                pw.println(cerdo.toFile());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        //TODO: Lee una línea extra?
    }
}
