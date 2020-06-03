import java.util.*;

class Solution {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<Integer>();
        int[] A_array = {1,2,3,4,5};
        System.out.println(heightChecker(A_array));
    }

    public static int heightChecker(int[] heights) {
        int [] orig = new int[heights.length];
        for (int i = 0; i < heights.length; i++){
            orig[i] = heights[i];
        }
        Arrays.sort(heights);
        int cnt = 0;
        for (int i = 0; i < heights.length; i++){
            if (heights[i] != orig[i]) cnt++;
        }
        return cnt;
    }
}

