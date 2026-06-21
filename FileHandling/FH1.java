package FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FH1 {
    public static void main(String[] args) throws IOException {
        //creating a file
        Scanner sc=new Scanner(System.in);
        System.out.println("Starting my file");
        //need path to create a file -right cick on package copy path k
        String path="C:\\Users\\Mamat\\IdeaProjects\\day2\\src\\FileHandling\\test.txt";
        File f=new File(path);
        //it has parameter as boolean append so it added to previous content
        FileWriter fw=new FileWriter(f,true);
        //fw.write("Hello"); not best method
        BufferedWriter bw=new BufferedWriter(fw);
        String inp=sc.nextLine();
        bw.newLine();
        bw.write(inp);
        bw.close();
        fw.close();
    }
}
