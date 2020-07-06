import java.util.*;

class Solution {


    public static void main(String[] args) {

        int a = 4;
        int len_main = String.valueOf(Integer.bitCount(a)).length();
        int[] ans_ret_main = new int[len_main];
        ans_ret_main = countBits(a);
        for (int an: ans_ret_main){
            System.out.println(an);
        }
    }


    static List<Integer> ans = new ArrayList<Integer>();
    public static int[] countBits(int num) {
        f(num);
        int[] ans_ret = new int[num + 1];

        for (int i = 0; i < ans.size(); i++){
            ans_ret[i] = ans.get(i);
        }

        return ans_ret;
    }

    public static void f (int value){
        if (value == 0) {
            ans.add(0);
            return ;
        }
        f (value - 1);
        ans.add(Integer.bitCount(value));
    }
}
