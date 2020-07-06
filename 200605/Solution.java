import java.util.*;

class Solution {
    public static void main(String[] args) {

//        int x = 14;
        int x = 196348;//2^16
        pathInZigZagTree(x);
    }
    public static List<Integer> pathInZigZagTree(int x) {
        List<Integer> ans = new ArrayList<Integer>();
        String strX = Integer.toBinaryString(x);
        System.out.println(strX);

        int hieral = 0;
        for (int i = 0; i < 21; i++){
            if (x < Math.pow(2, i)){
                hieral = i;
                break;
            }
        }
        hieral--;
        System.out.println("hieral:"+ hieral);
        System.out.println("math hieral: "+Math.pow(2, hieral));
        while (hieral >= 0){
            ans.add(0, x);
            int y = (x - (int) Math.pow(2, hieral)) / 2;
            int hieral_minus1 = (int) Math.pow(2, hieral - 1);
            x = (hieral_minus1 - y - 1) + hieral_minus1;
            hieral--;
        }
        System.out.println(ans);
        return ans;
    }
}