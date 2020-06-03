import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
//        String move = "LL";
        int[] A = {-4,-1,0,3,10};
        int ans[] = sortedSquares(A);
        for (int a = 0; a < A.length; a++){
            System.out.println(ans[a]);
        }
    }

    public static int[] sortedSquares(int [] A) {
        int[] ans = new int[A.length];
        for (int a = 0; a < A.length; a++){
            ans[a] = A[a] * A[a];
        }
        Arrays.sort(ans);
        return ans;//int[]
    }
}