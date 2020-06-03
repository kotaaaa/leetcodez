import java.util.*;

class Solution {
    public static void main(String[] args){
        int a = 3;
        int b = 9;
        System.out.println(getHappyString(a,b));
    }
    public static String getHappyString(int n, int k) {
        String abc = "abc";
//        String[] array = {"cbc", "aba", "abc", "aca", "acb", "bab", "bac", "bca", "bcb", "cab", "cac", "cba"};
//        Arrays.sort(array);
//        for (String a: array){
//            System.out.println(a);
//        }
        StringBuilder[] candidates = new StringBuilder[(int)Math.pow(3,n)];
//        Arrays.fill(candidates, "");
//        List<String> right_candidates = ArrayList<String>();

        String = "";
        for (int i = 0; i < n; i++){
            for (int j = 0; j < 3; j++){
                candidates[3*i+j] = new StringBuilder();
//                System.out.println(i+" "+j);
                if (i != 0){
                    if (candidates[i - 1].toString().toCharArray().equals(abc.charAt(j))); continue;
                }


//                candidates[3*i+j].append(String.valueOf(abc.charAt(j)));
//                System.out.println(abc.charAt(j));
//                System.out.println("can>> "+candidates[3*i+j]);
//                System.out.println(String.valueOf(abc.charAt(j)));
//                candidates[3*i+j].append("11");
            }
        }
        int cnt = 0;
        for (int i = 0; i < 3*n; i++){
            System.out.println(i +" " +candidates[i]);
            if (candidates[i].toString().length() != n) continue;
            cnt++;
            if (cnt == k) return candidates[i].toString();
        }
        return "";
    }
}