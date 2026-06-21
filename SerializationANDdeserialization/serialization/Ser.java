package SerializationANDdeserialization.serialization;

import java.io.Serializable;

public class Ser implements Serializable {
    int id;
    String name;
    public Ser(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    public void display()
    {
        System.out.println(id);
        System.out.println(name);
    }
}
