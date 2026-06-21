package Cognizant;

import java.util.Scanner;

public class TicketDiscount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double cost=0,total=0;
        String ref,co,ci;
        System.out.println("Enter no of tickets:");
        int tickets=sc.nextInt();
        if (tickets < 5 || tickets > 40){
            System.out.println ("Minimum of 5 and Maximum of 40 tickets");
            System.exit (0);
        }

        System.out.println("Do you want refreshment:");
        ref=sc.next();
        System.out.println("Do you have coupon code");
        co=sc.next();
        System.out.println("Enter the circle:");
        ci=sc.next();

        if(ci.charAt(0)=='k') cost=tickets*75;
        else if(ci.charAt(0)=='q') cost=tickets*150;
        else {
            System.out.println("invalid");
            return;
        }
        if(tickets>20)
        {
            cost=cost-(0.1*cost);
        }
        if(co.charAt(0)=='y')
        {
            cost=cost-(0.02*cost);
        }
        if(ref.charAt(0)=='y')
        {
            total=tickets*50;
        }
        System.out.printf("total:%.2f",total+cost);
    }
}
