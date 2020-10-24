package Simple_1576;

public class MySolution {
    public static void main(String[] args) {
        System.out.println(modifyString("j?qg??b"));
    }

    public static String modifyString(String s) {
        String ans = "";
        if (s.length() == 1) {
            if (s.charAt(0) == '?') return "a";
            return s;
        }
        for (int index = 0; index < s.length(); index++) {
//            System.out.println(s.charAt(index));
            char c = s.charAt(index);
            if (index == 0 && c == '?') {
                char temp = ' ';
                while (true) {
                    temp = (char) (int) (Math.random() * 26 + 97);
                    if (temp != s.charAt(index + 1)) break;
                }
                ans += Character.toString(temp);
            } else if (index == s.length() - 1 && c == '?') {
                char temp = ' ';
                while (true) {
                    temp = (char) (int) (Math.random() * 26 + 97);
                    if (temp != ans.charAt(index - 1)) break;
                }
                ans += Character.toString(temp);
            } else if (c == '?') {
                char temp = ' ';
                while (true) {
                    temp = (char) (int) (Math.random() * 26 + 97);
                    if (temp != ans.charAt(index - 1) && temp != s.charAt(index + 1)) break;
                }
                ans += Character.toString(temp);
            } else {
                ans += c;
            }
        }
        return ans;
    }
}
