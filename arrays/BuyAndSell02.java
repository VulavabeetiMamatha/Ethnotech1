package arrays;

public class BuyAndSell02 {
    public static void main(String args[])
    {
        int arr[]={100,180,260,310,40,535,695};
        System.out.println(profit(arr));
    }
    public static int profit(int arr[])
    {
        int profit=0;
        int buy=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<buy)
            {
                profit+=(arr[i-1]-buy);
                if(i!=(arr.length-1))
                     buy=arr[i];
            }
            if(i==arr.length-1 && arr[i]>buy)
            {
                profit+=(arr[i]-buy);
            }
        }

        return profit;
    }
}







