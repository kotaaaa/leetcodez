import java.util.*;

class Solution {
    public static void main(String[] args){
        int[] a = {1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(a));
    }
    public static boolean uniqueOccurrences(int[] arr) {
        int[] vals = new int[2001];
        HashSet<Integer> uniqueNum = new HashSet<Integer>();
        for (int a: arr){
            vals[a+1000]++;
            if (!uniqueNum.contains(a)) uniqueNum.add(a);
        }
        int cnt = 0;
        for (int i = 1; i <= Collections.max(uniqueNum); i++){
            for (int a : uniqueNum){
                if (i == vals[a+1000]){
                    cnt++;
                    if (cnt >= 2) return false;
                }
            }
            cnt = 0;
        }
        return true;
    }
}