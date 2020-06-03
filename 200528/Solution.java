import java.util.*;

class Solution {
    public static void main(String[] args) {
        int ans = hammingDistance(10,4);
        System.out.println("ans: "+ans);

    }

    public static int hammingDistance(int x, int y) {
        System.out.println(x ^ y);
        return Integer.bitCount(x ^ y);
//        System.out.println(x+" "+y);
//        System.out.println(Integer.toBinaryString(x));
//        System.out.println(Integer.toBinaryString(y));
//        int temp = 0;
//        if (y > x){
//            temp = x;
//            x = y;
//            y = temp;
//        }
//        String x_str = Integer.toBinaryString(x);
//        String y_str = Integer.toBinaryString(y);
//        int cnt = 0;
//        for (int i = 0; i < x_str.length(); i++){
//            System.out.println(i+" "+y_str.length());
//            if (i >= y_str.length()){
//                System.out.println(x_str.charAt(x_str.length() - i - 1) == 1);
//                if (x_str.charAt(x_str.length() - i - 1) == '1') {
//                    cnt++;
//                    System.out.println("a"+cnt);
//                }
//                continue;
//            }
//            if ((x_str.charAt(x_str.length()-i-1)) != (y_str.charAt(y_str.length()- i - 1))) {
//                cnt++;
//                System.out.println("b"+cnt);
//            }
//        }
//        return cnt;
    }
}