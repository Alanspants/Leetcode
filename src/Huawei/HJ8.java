package Huawei;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HJ8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            int key = scanner.nextInt();
            int value = scanner.nextInt();
            if (treeMap.containsKey(key)) {
                treeMap.put(key, treeMap.get(key) + value);
            } else {
                treeMap.put(key, value);
            }
        }
        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
