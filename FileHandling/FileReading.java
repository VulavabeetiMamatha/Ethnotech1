package FileHandling;

import java.io.*;

public class FileReading {
    public static void main(String[] args) throws IOException {
        System.out.println("Starting my file");
        //need path to create a file -right cick on package copy path k
        String path="C:\\Users\\Mamat\\IdeaProjects\\day2\\src\\FileHandling\\test.txt";
        File f=new File(path);
        FileReader fp=new FileReader(f);
        BufferedReader bp=new BufferedReader(fp);
       // char r=(char)bp.read();//default retutrn type is int so we convert it into char
        int ch;
        int c=0;
        while((ch=bp.read())!=-1) {
            System.out.print((char) ch);
            c++;
        }
        System.out.println();
        System.out.println(c);//to read no of characters
    }
}
