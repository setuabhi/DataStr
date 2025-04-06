package Corejava;

import java.util.Objects;

public record Emplyee(String id, String name) {
//Note below will be done by compiler
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emplyee emplyee = (Emplyee) o;
        return (Objects.equals(id, emplyee.id) && Objects.equals(name, emplyee.name));
    }

    /*
    Objects.hash(1, "Abhi"):
    int result = 1;
    result = 31 * result + Integer.hashCode(id);
    result = 31 * result + (name == null ? 0 : name.hashCode());
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

