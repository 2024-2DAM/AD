package u1.codigosClase.cerdos;

public class Cerdo {
    private String nombre;
    private int edad;
    private String raza;
    private boolean muerde;

    public Cerdo(String nombre, int edad, String raza, boolean muerde) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.muerde = muerde;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getRaza() {
        return raza;
    }

    public boolean isMuerde() {
        return muerde;
    }

    /**
     * Este método transforma a String un objeto. Lo utilizamos
     * para guardar en el fichero con el formato de exportación
     * adecuado.
     * @return String con el objeto convertido a cadena.
     */
    public String toFile() {
        String ret = this.nombre + "\n" + this.edad + "\n" + this.raza + "\n";
        if (this.muerde) {
            ret += "si";
        } else {
            ret += "no";
        }
        return ret;
    }

    @Override
    public String toString() {
        String ret = nombre + ", " + edad + ", años. Raza " + raza + ". ";
        ret += muerde ? "Si muerde" : "No muerde";
        return ret;
    }
}
