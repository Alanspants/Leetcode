package Huawei;

import java.util.Scanner;

/*题目描述
        接受一个只包含小写字母的字符串，然后输出该字符串反转后的字符串。（字符串长度不超过1000）

        输入描述:
        输入一行，为一个只包含小写字母的字符串。

        输出描述:
        输出该字符串反转后的字符串。*/




public class HJ12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder temp = new StringBuilder(input);
        System.out.println(temp.reverse().toString());
    }

}

