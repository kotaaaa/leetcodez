import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        String A = "IDID";
        int ans[] = diStringMatch(A);
        for (int a = 0; a < A.length()+1; a++){
            System.out.println(ans[a]);
        }
    }
    static int[] ans;
    public static int[] diStringMatch(String S) {
        ans = new int[S.length()+1];
        for (int i = 0; i < S.length()+1; i++){
            ans[i] = i;
        }
        int d_count = 0;
        int tmp = 0;
        for (int i = 0; i < S.length(); i++){
            if ((d_count > 0) && ('I' == S.charAt(i))){
                sort(i-d_count, i, d_count);
                d_count = 0;
            }

            if ('D' == S.charAt(i)){
                d_count++;
            }
        }
        if (d_count > 0){
            sort(S.length()-d_count, S.length(), d_count);
        }
        return ans;
    }

    public static void sort(int start, int end, int d) {
        int tmpArray[] = new int[d+1];
        for (int i = 0; i < d + 1; i++){
            tmpArray[i] = ans[start + i];
        }
        for (int i = d; i >= 0; i--){
            ans[start + i] = tmpArray[d - i];
        }
    }
}