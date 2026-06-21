package Cognizant;

import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter month number");
        int n=sc.nextInt();
        if(n<=0 || n>12)
        {
            System.out.println("Invalid");
            System.exit(0);
        }
        if(n>=3 && n<=5)
        {
            System.out.println("Season:Spring");
        }
        else if(n>=6 && n<=8)
        {
            System.out.println("Season:Summer");
        }
        else if(n>=9 && n<=11)
        {
            System.out.println("Season:Autumn ");
        }
        else
        {
            System.out.println("Season:Winter");
        }

    }
}
