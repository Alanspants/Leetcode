package Simple_38;

public class MySolution {
    public static void main(String[] args) {
        System.out.println(countAndSay(5));
    }

    public static String countAndSay(int n) {

        if (n == 1) return "1";
        String ans = "";
        String prev = countAndSay(n - 1);
        System.out.println("countAndSay: " + n);
        System.out.println("--prev: " + prev);
        char[] c = prev.toCharArray();
        for (int i = 0; i < c.length; i++) {
            // Longest same substr
            int same = 1;
            if(c.length != 1) {
                for (int j = i + 1; j < c.length; j++) {
                    System.out.println("c[i] = " + c[i] + " c[j] = " + c[j] + " same = " + same);
                    if (c[j] == c[i]) same++;
                    else break;
                }
                i += (same - 1);
            }
            // int -> char
            System.out.println("c[i] = " + c[i] + ", same = " + same);
            char quantity = (char)(same + '0');
            char num = (char)(c[i]);
            ans += String.valueOf(quantity);
            ans += String.valueOf(num);
            System.out.println("ans = " + ans);
        }
        return ans;
    }
}
