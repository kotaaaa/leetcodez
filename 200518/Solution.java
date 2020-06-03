import java.util.*;

class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(selfDividingNumbers(a,b));
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int i = left; i <= right; i ++ ){
            int flg = 0;
            for (char x : Integer.toString(i).toCharArray()){
                System.out.println(i+" "+x);
                if (Character.getNumericValue(x) == 0) {
                    flg = 1;
                    break;
                }
                if (i % (Character.getNumericValue(x)) != 0) {
                    flg = 1;
                    break;
                }
            }
            if (flg == 0){
                ans.add(i);
            }
        }
        return ans;
    }
}