package SerializationANDdeserialization.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        Ser s=new Ser(1,"Mammu");
        //s.display();
        String path="C:\\Users\\Mamat\\IdeaProjects\\day2\\src\\SerializationANDdeserialization\\serialization\\t1.txt";
        FileOutputStream fos=new FileOutputStream(path);//give write permission to the file
        ObjectOutputStream oos=new ObjectOutputStream(fos);//convert text into bytes
        oos.writeObject(s);
        oos.close();
        fos.close();
    }
}
