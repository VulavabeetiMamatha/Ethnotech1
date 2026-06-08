package arrays;

import java.util.Scanner;

public class DiagonalPrint04 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][3];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(i==j || i+j ==arr.length-1)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}
