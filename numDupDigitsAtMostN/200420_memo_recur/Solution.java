import java.util.*;

class Solution {

    static int Num = 10000;
    static int[] dp = new int[Num+1];

    public static void main(String args[]){
        Arrays.fill(dp, -1);
        numDupDigitsAtMostN(Num);
    }

    public static void numDupDigitsAtMostN(int N) {
        // return seek(N);
        // if (dp[i] < INF) return dp[i];
        System.out.println(dp[999]+" "+dp.length);
        seek(N);
    }

    public static int seek(int x){

        if (dp[x] >= 0) return dp[x];

        int count;
        if (x == 0) return 0;
        count = seek(x-1);
        String x_s = String.valueOf(x);
        String[] x_array = x_s.split("");
        List<String> strList = new ArrayList<>();
        for (int i=0;i<x_array.length;i++){
            if (strList.contains(x_array[i])){
                count++;
                System.out.println(x+" "+count);
                return dp[x] = count;
            }
            else{
                strList.add(x_array[i]);
            }
        }
        System.out.println(x+" "+count);
        return count;
    }
}
