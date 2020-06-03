import java.util.*;

class Solution {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {3,2,7};
        int ans = busyStudent(a,b,4);
        System.out.println("ans: "+ans);
    }

    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int ans = 0;
        for (int i = 0; i < startTime.length; i++){
            if ((startTime[i] < queryTime) && (queryTime < endTime[i])){
                ans++;
            }
        }
        return ans;
    }
}