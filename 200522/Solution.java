class Solution {
    public static void main(String[] args) {
//        ArrayList<Integer> input = new ArrayList<Integer>();
//        int[] A_array = {5,1,5,2,5,3,5,4};
        String move = "LL";
        System.out.println(judgeCircle(move));
    }

    public static boolean judgeCircle(String moves) {
//        int[][] blocks = new int[10000][10000];
        int horizen = 0; int vertical = 0;
        for (int i = 0; i < moves.length(); i++){
            char x = moves.charAt(i);
            if ('U' == x) horizen++;
            if ('D' == x) horizen--;
            if ('L' == x) vertical++;
            if ('R' == x) vertical--;
        }
        if ((horizen == 0) && (vertical == 0)) return true;
        else return false;
    }
}