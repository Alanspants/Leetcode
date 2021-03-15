package Huawei;

import java.util.HashMap;
import java.util.Scanner;

public class HJ10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] chars = input.toCharArray();
        HashMap<Character, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (!hashmap.containsKey(chars[i])) {
                hashmap.put(chars[i], 1);
            }
        }

        System.out.println(hashmap.size());
    }
}
