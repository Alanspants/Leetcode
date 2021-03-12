package Huawei;

import javax.print.DocFlavor;
import java.util.*;

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
