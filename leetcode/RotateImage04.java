package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class RotateImage04 {
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
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(i!=j)
                {
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
        for(int i=0;i<n/2;i++)
        {
            for(int j=0;j<n;j++)
            {
                int temp=arr[j][i];
                arr[j][i]=arr[j][n-i-1];
                arr[j][n-i-1]=temp;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
