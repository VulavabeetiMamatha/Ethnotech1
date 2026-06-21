package collections.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Spotify {
    public static void main(String[] args) {

        Queue<String> q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1.Add Song");
            System.out.println("2.Play Next Song");
            System.out.println("3.Current Song");
            System.out.println("4.Exit");

            int n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Enter song:");
                    String s = sc.next();
                    q.offer(s);
                    break;

                case 2:
                    if (q.isEmpty())
                        System.out.println("No songs in playlist");
                    else
                        System.out.println("Playing: " + q.poll());
                    break;

                case 3:
                    if (q.isEmpty())
                        System.out.println("No songs in playlist");
                    else
                        System.out.println("Next Song: " + q.peek());
                    break;

                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }

        }
    }
}