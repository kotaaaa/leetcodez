//import java.util.Arrays;
//import java.util.List;
import java.util.*;

class Solution {
    public static void main(String[] args) {
//        String move = "LL";
        int[][] A = {{56216},{63251},{75772},{1945},{27014}};
        List<Integer> ans = new ArrayList<Integer>();
        ans = luckyNumbers(A);
        System.out.println(ans);

    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<>(Arrays.asList());
        int[][] ansMatrix = new int[matrix.length][matrix[0].length];
        //MIN
        for (int i = 0;i < matrix.length; i++){
            int min = 100001;
            int min_index = -1;
            for (int j = 0;j < matrix[0].length; j++){
                if (matrix[i][j] < min){
                    min = matrix[i][j];
                    min_index = j;
                }
            }
            ansMatrix[i][min_index]++;
        }

        for (int j = 0;j < matrix[0].length; j++){
            int max = 0;
            int max_index = -1;
            for (int i = 0;i < matrix.length; i++){
                if (matrix[i][j] > max){
                    max = matrix[i][j];
                    max_index = i;
                }
            }
//            System.out.println(max_index,j);
            ansMatrix[max_index][j]++;
        }

        for (int i = 0;i < matrix.length; i++){
            for (int j = 0;j < matrix[0].length; j++) {
//                System.out.println(ansMatrix[i][j]);
                if (ansMatrix[i][j] == 2){
                    ans.add(matrix[i][j]);
                }
            }
        }

        return ans;

    }
}