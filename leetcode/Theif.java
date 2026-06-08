package leetcode;

import java.util.ArrayList;

public class Theif {
    public static void main(String[] args) {
        int arr[]={5,4,3,8,5,1,0,2,8};
        int n=arr.length;
        ArrayList<Integer> l1=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            l1.add(arr[i]);
        }
        for(int i=0;i<n;i+=2)
        {
          l1.add(arr[i]);
        }
        for(int i=1;i<n;i+=2)
        {
            l1.add(arr[i]);
        }
        System.out.println(l1);

    }
}
