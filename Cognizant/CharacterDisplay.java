package Cognizant;

import java.util.Scanner;

public class CharacterDisplay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the digits:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();

        char a1=(char)a;
        char b1=(char)b;
        char c1=(char)c;
        char d1=(char)d;

        System.out.println(a+" "+a1);
        System.out.println(b+" "+b1);
        System.out.println(c+" "+c1);
        System.out.println(d+" "+d1);
    }
}
