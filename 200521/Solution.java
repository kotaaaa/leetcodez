import java.util.*;

class Solution {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<Integer>();
        int[] A_array = {5,1,5,2,5,3,5,4};
        System.out.println(repeatedNTimes(A_array));
    }

    public static int repeatedNTimes(int[] A) {
        HashMap<Integer, Integer> vals = new HashMap<Integer, Integer>();
        for (int a: A){
            if (vals.containsKey(a)){
//                vals[a] += 1;
                vals.put(a, vals.get(a) + 1);
            }
            else {
                vals.put(a,1);
            }
            if (vals.get(a) == A.length/2) return a;
        }
//        System.out.println(vals);
        return 0;

    }

}
