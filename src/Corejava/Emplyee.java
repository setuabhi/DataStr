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
    Objects.hash(7, "Abhi"):
    int result = 1;
    result = 31 * result + Integer.hashCode(7);
    result = 31 * result + (name == null ? 0 : name.hashCode());

    above one is like:
    int result = 1;
    for (Object element : values)
    {
    result = 31 * result + (element == null ? 0 : element.hashCode());
    }
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

