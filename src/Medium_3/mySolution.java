package Medium_3;

public class mySolution {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("bbbbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        String maxStr = "";
        String tmpStr = "";
        int index = 0;
        while (index < s.length()) {
            int same = tmpStr.indexOf(Character.toString(s.charAt(index)));
            if (same >= 0) {
                index = index - (tmpStr.length() - same - 1);
                tmpStr = "";
            } else {
                tmpStr += Character.toString(s.charAt(index));
                if (tmpStr.length() > maxStr.length()) maxStr = tmpStr;
                index++;
            }
//            System.out.println(index + " " + tmpStr);
        }
        return maxStr.length();
    }
}
