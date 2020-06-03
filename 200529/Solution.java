import java.util.*;


class Solution {
    public static void main(String[] args){
        int[] a = {4,4,7,6,7};
        System.out.println(minSubsequence(a));
    }
    public static List<Integer> minSubsequence(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        Arrays.sort(nums);
        int numsSum = 0;
        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
            numsSum += nums[i];
        }
        int tempSum = 0;
        for (int i = nums.length-1; i >= 0; i--){
            numsSum -= nums[i];
            tempSum += nums[i];
            ans.add(nums[i]);
            if (tempSum > numsSum) return ans;
        }

        return ans;
    }
}