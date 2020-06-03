import java.util.*;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<Integer>();

        int [] intArray = {1,2,3,4,5};
        System.out.println(intArray.length);
        String text = "text";
        System.out.println(text.length());
        StringBuilder sb = new StringBuilder();
        sb.append("text");
        System.out.println(sb.length());

        String StringA = "0";
        int intA = Integer.parseInt(StringA);
//        System.out.println(intA instanceof Integer);

        int intB = 0;
        String stringB = String.valueOf(intB);
//        System.out.println(StringB.getClass());

        int intC = 0;
        Integer integerC = intC;
        System.out.println(intC);

        Integer integerD = 0;
        System.out.println(integerD.intValue());
    }

}
