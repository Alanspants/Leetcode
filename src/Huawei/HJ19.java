package Huawei;

import javax.management.Query;
import java.util.*;

//重点：Queue<String> queue = new LinkedList<>();

public class HJ19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        HashMap<String, Integer> hashMap = new HashMap<>();
        Queue<String> queue = new LinkedList<>();
        int counter = 0;
        String counter_log = "";
        while(!(str = scanner.nextLine()).equals("")) {
            String[] splitArr = str.split("\\\\");

            str = splitArr[splitArr.length - 1];
            if(!queue.contains(str)) {
                queue.add(str);
            }
            hashMap.put(str, hashMap.getOrDefault(str, 0) + 1);
            if(queue.size() > 8){
                String temp = queue.poll();
                hashMap.put(temp, hashMap.get(temp) - 1);
            }
        }
        while(!queue.isEmpty()){
            String temp = queue.poll();
            counter = hashMap.get(temp);
            System.out.println(temp + " " + counter);
        }
    }
}
