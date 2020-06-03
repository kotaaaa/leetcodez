import java.util.*;

class Solution {
    public static void main(String[] args){
        int[] a = {1,2};//,2,1,1,3};
        System.out.println(uniqueOccurrences(a));
    }
    public static boolean uniqueOccurrences(int[] arr) {
        int[] vals = new int[2001];
        HashSet<Integer> uniqueNum = new HashSet<Integer>();
        for (int a: arr){
            vals[a+1000]++;
            if (!uniqueNum.contains(a)) uniqueNum.add(a);
        }
        int[] cnt = new int[2001];
        for (int i: uniqueNum){
            System.out.println(i);
            if (cnt[vals[i+1000]] >= 1) return false;
            else cnt[vals[i+1000]]++;
        }
        return true;
    }
}