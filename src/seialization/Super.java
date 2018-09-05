package seialization;

import java.io.NotSerializableException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Super implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;
    Super(){
        this.name="Dharam";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Sub extends Super {

    private static final long serialVersionUID = 1L;
    private Integer id;

    public Sub(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + "]";
    }

    /*
     * define how Serialization process will write objects.
     */
    private void writeObject(ObjectOutputStream os) throws NotSerializableException {
        throw new NotSerializableException("This class cannot be Serialized");
    }


}



