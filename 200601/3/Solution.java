import java.util.*;

class Solution {
    public static void main(String[] args){
        int[] a = {1,2};//,2,1,1,3};
        System.out.println(uniqueOccurrences(a));
    }
    public static boolean uniqueOccurrences(int[] arr) {
        int[] vals = new int[2001];
        for (int a: arr){
            vals[a+1000]++;
        }
        int[] cnt = new int[2001];
        for (int i = 0; i < 2001; i++){
            if (vals[i] > 0){
                if (cnt[vals[i]] >= 1) return false;
                else cnt[vals[i]]++;
            }
        }
        return true;
    }
}