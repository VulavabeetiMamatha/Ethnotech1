package leetcode;

class Solution {
    public int pivotIndex(int[] nums) {
        int total=0;
        for(int i=0;i<nums.length;i++)
        {
            total+=nums[i];
        }
        int ls=0;
        for(int i=0;i<nums.length;i++)
        {
            int rs=total-ls-nums[i];
            if(ls==rs)
                return i;
            else
                ls+=nums[i];
        }
        return -1;
    }
}
public class PivotIndex724 {
    public static void main(String[] args) {
        Solution s=new Solution();
        int arr[]={1,7,3,6,5,6};
        int index=s.pivotIndex(arr);
        System.out.println(index);
    }
}
