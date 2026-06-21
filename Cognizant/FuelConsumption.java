package Cognizant;

import java.util.Scanner;

public class FuelConsumption {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter dist:");
        float dist=sc.nextInt();
        System.out.println("Enter fuel");
        float fuel=sc.nextInt();
        if(dist<=0 || fuel<=0){
            System.out.println("Invalid");
            System.exit(0);}
        float res=(fuel/dist)*100;
        System.out.printf("\nEurope:%.2f",res);
        double res1=((dist*0.6214)/(fuel*0.2642));
        System.out.printf("\nUS:%.2f",res1);
    }
}
