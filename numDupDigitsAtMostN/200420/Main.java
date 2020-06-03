import java.util.*;

public class Main {
    public static void main(String args[]){
        int e = numDupDigitsAtMostN(20);
    }

    public int numDupDigitsAtMostN(int N) {
        System.out.println(seek(N));
        return seek(N);
    }

    public int seek(int x){
        int count;
        if (x == 0) return 0;
        count = seek(x-1);
        System.out.println(x-1+": "+count);
        String x_s = String.valueOf(x);
        String[] x_array = x_s.split("");
        List<String> strList = new ArrayList<>();
        for (int i=0;i<x_array.length;i++){
            if (strList.contains(x_array[i])){
                count++;
                // System.out.println(x+" "+count);
                return count;
            }
            else{
                // System.out.println(x+" "+count);
                strList.add(x_array[i]);
            }
        }
        return count;
    }

}
//
// public static void main(String args[]){
//     numDupDigitsAtMostN(20);
// }
