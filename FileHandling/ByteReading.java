package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteReading {
    public static void main(String[] args) throws IOException {
        System.out.println("Starting my file");
        String path="C:\\Users\\Mamat\\IdeaProjects\\day2\\src\\FileHandling\\test.txt";
        File f1=new File(path);
        File f2=new File("C:\\Users\\Mamat\\IdeaProjects\\day2\\src\\FileHandling\\test2.txt");
        FileInputStream fis=new FileInputStream(f1);//permission to read a file
        FileOutputStream fos=new FileOutputStream(f2);//permission to write in a file
        int ch;
        while((ch=fis.read())!=-1)
        {
            System.out.print((char)ch);
            fos.write(ch);
        }
        fis.close();
        fos.close();
    }
}
