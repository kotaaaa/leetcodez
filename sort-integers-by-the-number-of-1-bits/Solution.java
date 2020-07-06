import java.util.*;

class Solution {

    public static void main(String[] args) {
        int[] mat = {0,1,2,3,4,5,6,7,8};
//        int[] mat = {1024,512,256,128,64,32,16,8,4,2,1};

        int[] ans = new int[mat.length];
        ans = sortByBits(mat);
        for (int i: ans) {
            System.out.println(i);
        }
    }

    public static int[] sortByBits(int[] arr) {
        Arrays.sort(arr);
        int[][] vals = new int[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            vals[i][0] = arr[i];
            vals[i][1] = Integer.bitCount(arr[i]);
        }

        Arrays.sort(vals, (a, b) -> Integer.compare(a[1], b[1]));

        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = vals[i][0];
        }

        return ans;
    }
}