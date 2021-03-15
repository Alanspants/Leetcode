package Huawei;

import java.util.Scanner;
import java.util.ServiceConfigurationError;

/*
题目描述
        输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。

        输入描述:
        输入一个整数（int类型）

        输出描述:
        这个数转换成2进制后，输出1的个数
*/

//重点：String binaryStr = Integer.toBinaryString(num);

public class HJ15__STAR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String binaryStr = Integer.toBinaryString(num);
        int ans = 0;
        for(int i = 0; i < binaryStr.length(); i++){
            if (binaryStr.charAt(i) == '1') ans++;
        }
        System.out.println(ans);
    }
}
