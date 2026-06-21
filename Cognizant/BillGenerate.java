package Cognizant;

import java.util.Scanner;

public class BillGenerate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of pizzas");
        int pizza=sc.nextInt();
        System.out.println("Enter no of puffs");
        int puff=sc.nextInt();
        System.out.println("Enter no of coolDrinks");
        int coolDrink=sc.nextInt();
        System.out.println("Bill Details");
        System.out.println();
        int pizaCost=pizza*100;
        int puffCost=puff*20;
        int coolCost=coolDrink*10;
        System.out.println("No of pizzas:" + pizaCost);
        System.out.println("No of puffs:" + pizaCost);
        System.out.println("No of cooldrinks:" + coolCost);
        System.out.println("Total price=" + (pizaCost+puffCost+coolCost));
        System.out.println();

        System.out.println("ENJOY THE SHOW!!!");
    }
}
