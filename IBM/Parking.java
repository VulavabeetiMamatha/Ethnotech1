package IBM;

import java.util.Scanner;

public class Parking {
    public static int maxDistToClosest(int[] seats) {
        int prev=-1;
        int max=0;
        for(int i=0;i<seats.length;i++)
        {
            if(seats[i]==1)
            {
                if(prev==-1)
                {
                    max=i;
                }
                else
                {
                    max=Math.max(max,(i-prev)/2);
                }
                prev=i;
            }
        }
        max=Math.max(max,seats.length-1-prev);
        return max;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array values");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(maxDistToClosest(arr));
    }

}
