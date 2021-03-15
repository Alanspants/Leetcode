package Huawei;

import java.util.Scanner;
import java.util.regex.Pattern;

/*题目描述
        密码要求:

        1.长度超过8位

        2.包括大小写字母.数字.其它符号,以上四种至少三种

        3.不能有相同长度大于2的子串重复

        输入描述:
        一组或多组长度超过2的字符串。每组占一行

        输出描述:
        如果符合要求输出：OK，否则输出NG*/

//重点：包括pattern的用法，已经递归求字符串重复

public class HJ20__STAR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        while (scanner.hasNext()) {
            str = scanner.next();
            if (str.length() <= 8) {
                System.out.println("NG");
                continue;
            }
            if (!regexMatcher(str)) {
                System.out.println("NG");
                continue;
            }
            if (!strRepeat(str, 0, 3)){
                System.out.println("NG");
                continue;
            }
            System.out.println("OK");
        }
    }

    public static boolean regexMatcher(String str) {
        Pattern capitalWord = Pattern.compile("[A-Z]");
        Pattern lowerCase = Pattern.compile("[a-z]");
        Pattern number = Pattern.compile("[0-9]");
        Pattern other = Pattern.compile("[^A-Za-z0-9]");
        int counter = 0;
        if (capitalWord.matcher(str).find()) counter++;
        if (lowerCase.matcher(str).find()) counter++;
        if (number.matcher(str).find()) counter++;
        if (other.matcher(str).find()) counter++;
        return counter >= 3;
    }

    public static boolean strRepeat(String str, int left, int right){
        if(right >= str.length()) return true;
        String substr = str.substring(right);
        if(substr.contains(str.substring(left, right))){
            return false;
        } else {
            return strRepeat(str, left+1, right + 1);
        }
    }
}
