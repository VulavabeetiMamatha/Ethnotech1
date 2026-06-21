package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class MovingZeros283{
    public static void moveZeroes(int[] nums) {
        int n=nums.length;
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=0)
            {
                nums[k]=nums[i];
                k++;
            }

        }
        for(int i=k;i<n;i++)
        {
            nums[i]=0;
        }

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
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}


