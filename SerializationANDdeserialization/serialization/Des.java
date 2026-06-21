package SerializationANDdeserialization.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Des {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path="C:\\Users\\Mamat\\IdeaProjects\\day2\\src\\SerializationANDdeserialization\\serialization\\t1.txt";
        FileInputStream fos=new FileInputStream(path);
        ObjectInputStream oIs=new ObjectInputStream(fos);//convert byte to data
        Ser s=(Ser)oIs.readObject();
        s.display();
        oIs.close();
        fos.close();
    }
}
