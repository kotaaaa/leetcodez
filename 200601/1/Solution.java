class Solution {
    public static void main(String[] args){
        int[] a = {1,2};
        System.out.println(uniqueOccurrences(a));
    }
    public static boolean uniqueOccurrences(int[] arr) {
        int[] vals = new int[2001];
        for (int a: arr){
            vals[a+1000]++;
        }
        int cnt = 0;
        for (int i = 1; i <= 1000; i++){
            for (int j = 0; j<=2000; j++){
                if (i == vals[j]){
                    cnt++;
                    if (cnt >= 2) return false;
                }
            }
            cnt = 0;
        }
        return true;
    }
}