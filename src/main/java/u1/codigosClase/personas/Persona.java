package u1.codigosClase.personas;

import java.io.Serializable;

public class Persona implements Serializable {
    private String id;
    private String name;
    private int age;
    private boolean isEmployed;

    public Persona(String id, String name, int age, boolean isEmployed) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.isEmployed = isEmployed;
    }

    @Override
    public String toString() {
        String ret = id + " - " + name + ", " + age + " años, ";
        if (!isEmployed) {
            ret += "no ";
        }
        ret += "tiene trabajo";
        return ret;
    }
}
