package FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FH {
    public static void main(String[] args) throws IOException {
        //creating a file
        System.out.println("Starting my file");
        //need path to create a file -right cick on package copy path k
        String path="C:\\Users\\Mamat\\IdeaProjects\\day2\\src\\FileHandling\\test.txt";
        File f=new File(path);
        FileWriter fw=new FileWriter(f);
        //fw.write("Hello"); not best method
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write("HELLO");
        bw.close();
        fw.close();
        //if we modify the data it will lost the previous data so we create fh1
    }
}
