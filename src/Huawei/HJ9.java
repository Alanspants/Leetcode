package Huawei;

import javax.print.DocFlavor;
import java.util.*;

//题目描述
//        输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
//        保证输入的整数最后一位不是0。
//        输入描述:
//        输入一个int型整数
//
//        输出描述:
//        按照从右向左的阅读顺序，返回一个不含重复数字的新的整数

public class HJ9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        char[] arr = String.valueOf(input).toCharArray();
        String ans = "";
        for(int i = arr.length - 1; i >= 0; i--){
            if(!ans.contains(String.valueOf(arr[i]))) ans += arr[i];
        }
        System.out.println(ans);
    }
}
