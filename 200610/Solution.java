import java.util.*;

class Solution {

    public static void main(String[] args) {
        int[][] matrix = spiralMatrixIII(5, 6, 1, 4 );
//        int[][] matrix = spiralMatrixIII(1, 4, 0, 0);
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < 2; j++){
                System.out.println("ans>> "+i+" "+j+" "+matrix[i][j]);
            }
        }
    }
    static List<int[]> ans = new ArrayList<>();
    static int x = 0; static int y = 0;
    public static int[][] spiralMatrixIII(int R, int C, int r0, int c0) {
        ans.clear();
        int[][] box = new int[R][C];
        x = r0; y = c0;
        int allCnt = 0;
        f(1, "r", box, x, y, allCnt);
        int[][] ansArray = new int[R*C][2];
        for (int i = 0; i < ans.size(); i++){
            for (int j = 0; j < 2; j++){
                ansArray[i][j] = ans.get(i)[j];
            }
        }
        return ansArray;
    }

    public static void f (int num, String direction, int[][] box, int x, int y, int allCnt){
        if (box.length * box[0].length  <= allCnt) return;
        for (int n = 0; n < num; n++){
            if ((x < box.length) && (y < box[0].length) && x>=0 && y>=0){
                box[x][y] = allCnt;
                int[] XY = {x,y};
                ans.add(XY);
                allCnt++;
            }
            if ("r".equals(direction)){
                y++;
            } else if ("d".equals(direction)){
                x++;
            } else if ("l".equals(direction)){
                y--;
            } else if ("u".equals(direction)){
                x--;
            }
        }
        if ("r".equals(direction)){
            direction = "d";
        } else if ("d".equals(direction)){
            direction = "l";
            num++;
        } else if ("l".equals(direction)){
            direction = "u";
        } else if ("u".equals(direction)){
            direction = "r";
            num++;
        }
        f (num, direction, box, x, y, allCnt);
    }
}