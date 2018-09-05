package map.comparable;

public class ComparableEmployee implements Comparable<ComparableEmployee>{
    String name;
    String id;
    public ComparableEmployee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int compareTo(ComparableEmployee o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", id=" + id  + '}';
    }
}
