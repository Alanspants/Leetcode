package Simple_557;

public class mySolution {
    public static void main(String[] args) {
        System.out.println(reverseString("Let's take LeetCode contest"));
    }

    public static String reverseString(String s) {
        String[] str = s.split(" ");
        String ans = "";
        if(s.charAt(0) == ' ')
        ans += " ";
        for (String temp : str) {
            for (int i = temp.length() - 1; i >= 0; i--) {
                ans += Character.toString(temp.charAt(i));
            }
            ans += " ";
        }
        ans = ans.substring(0, ans.length()-1);
        if(s.charAt(s.length()-1) == ' ')
            ans += " ";
        return ans;
    }
}
