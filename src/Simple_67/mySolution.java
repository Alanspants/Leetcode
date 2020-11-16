package Simple_67;

public class mySolution {
    public static void main(String[] args) {
        System.out.println(addBinary("1010", "1011"));
    }

    public static String addBinary(String a, String b) {
        int lengthBias = a.length() - b.length();
        if (lengthBias < 0) a = addZero(a, -lengthBias);
        else b = addZero(b, lengthBias);
//        System.out.println(a + "," + b);
        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();
        String ans = "";
        int plus = 0;
        for (int i = a1.length - 1; i >= 0; i--) {
//            System.out.println(sum(a1[i], b1[i], plus));
            switch (sum(a1[i], b1[i], plus)) {

                case (0):
                    plus = 0;
                    ans = '0' + ans;
                    break;
                case (1):
                    plus = 0;
                    ans = '1' + ans;
                    break;
                case(2):
                    plus = 1;
                    ans = '0' + ans;
                    break;
                case(3):
                    plus = 1;
                    ans = '1' + ans;
                    break;
            }
        }
        if(plus == 1) ans = '1' + ans;
        return ans;
    }

    public static String addZero(String str, int num) {
        for (int i = 0; i < num; i++) {
            str = '0' + str;
        }
        return str;
    }

    public static int sum(char c1, char c2, int plus) {
        int n1 = c1 - '0';
        int n2 = c2 - '0';
        return n1 + n2 + plus;
    }
}
