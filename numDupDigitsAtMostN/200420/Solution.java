import java.util.*;

class Solution {

    public static void main(String args[]){
        numDupDigitsAtMostN(10000);
    }

    public static void numDupDigitsAtMostN(int N) {
        // return seek(N);
        seek(N);
    }

    public static int seek(int x){
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
                return count;
            }
            else{
                strList.add(x_array[i]);
            }
        }
        System.out.println(x+" "+count);
        return count;
    }
}
