import java.util.*;

class Solution {
    public static void main(String[] args){
        int a = 3;
        int b = 9;
        System.out.println(getHappyString(a,b));
    }
    public static String getHappyString(int n, int k) {
        List<String> right_candidates = new ArrayList<String>();
        for (int i = 0; i < Math.pow(3,n) ; i++){
            int dec = Integer.parseInt(String.valueOf(i),10);
            String bin = Integer.toString(dec,3);
            right_candidates.add(String.valueOf(bin));
        }

        List<String> abc_candidates = new ArrayList<String>();
        for (String s: right_candidates){
            if (s.length() != n){
                int num0 = n - s.length();
                for (int j = 0; j < num0; j++){
                    s = "0" + s;
                }
            }
            abc_candidates.add(s.replace("0","a").replace("1","b").replace("2","c"));
        }

        String[] arrayAbc = abc_candidates.toArray(new String[abc_candidates.size()]);
        Arrays.sort(arrayAbc);
        int cnt = 0; int break_point = 0;
        for (String s: abc_candidates) {
            for (int i = 1; i < n; i++) {
                if (s.charAt(i - 1) == s.charAt(i)) {
                    break_point++;
                    break;
                }
            }
            if (break_point >= 1){
                break_point = 0;
                continue;
            }
            cnt++;
            if (cnt == k) return s;
        }
        return "";
    }
}