package u1.codigosClase.personas;

import java.util.Objects;

public class Persona {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(id, persona.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
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
