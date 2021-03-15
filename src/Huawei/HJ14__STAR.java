package Huawei;

import java.util.*;

/*题目描述
        给定n个字符串，请对n个字符串按照字典序排列。
        输入描述:
        输入第一行为一个正整数n(1≤n≤1000),下面n行为n个字符串(字符串长度≤100),字符串中只含有大小写字母。
        输出描述:
        数据输出n行，输出结果为按照字典序排列的字符串。*/

//重点：treeMap.put(str, treeMap.getOrDefault(str, 0) + 1);


public class HJ14__STAR {
/*    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String[] strArray = new String[num];
        for(int i = 0; i < num; i++){
            String str = scanner.next();
            strArray[i] = str;
        }
        Arrays.sort(strArray);
        for(String element:strArray){
            System.out.println(element);
        }
    }*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        for(int i = 0; i < num; i++){
            String str = scanner.next();
            treeMap.put(str, treeMap.getOrDefault(str, 0) + 1);
        }
        for(Map.Entry<String, Integer> entry :  treeMap.entrySet()){
            for(int i = 0; i < entry.getValue(); i++){
                System.out.println(entry.getKey());
            }
        }
    }
}
