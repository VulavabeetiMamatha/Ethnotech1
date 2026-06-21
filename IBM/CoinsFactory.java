package IBM;

import java.util.Arrays;
import java.util.Scanner;

public class CoinsFactory {
    public static int box(int[] arr)
    {
        Arrays.sort(arr);
        int n=arr.length;
        int boxs[]=new int[100];
        int low=arr[0];
        int high=arr[n-1];
        int max=0;
        for(int i=low;i<=high;i++)
        {
            int num=i;
            int sum=0;
            while(num>0)
            {
             sum+=num%10;
             num=num/10;
            }
            boxs[sum]++;
            max=Math.max(boxs[sum],max);
        }
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
        System.out.println(box(arr));
    }

}
