package DFS.组合类;

import javax.imageio.plugins.jpeg.JPEGHuffmanTable;
import java.util.*;

public class Medium_17 {

    public static void main(String[] args) {
        String digits = "22";
        System.out.println(letterCombinations(digits));
    }

    public static List<String> letterCombinations(String digits) {
        Map<Character, String[]> phoneMap = new HashMap<>();
        phoneMap.put('2', new String[]{"a", "b", "c"});
        phoneMap.put('3', new String[]{"d", "e", "f"});
        phoneMap.put('4', new String[]{"g", "h", "i"});
        phoneMap.put('5', new String[]{"j", "k", "l"});
        phoneMap.put('6', new String[]{"m", "n", "o"});
        phoneMap.put('7', new String[]{"p", "q", "r", "s"});
        phoneMap.put('8', new String[]{"t", "u", "v"});
        phoneMap.put('9', new String[]{"w", "x", "y", "z"});
        List<String> res = new ArrayList<>();
        if (digits.equals("")) return res;
        StringBuilder stack = new StringBuilder("");
//        boolean[] visit = new boolean[4];
        Map<String, Boolean> visit = new HashMap<>();
        return dfs(digits.toCharArray(), 0, digits.length(), stack, visit, res, phoneMap);
    }

    private static List<String> dfs(char[] digits, int depth, int len, StringBuilder stack, Map<String, Boolean> visit, List<String> res, Map<Character, String[]> phoneMap) {
        if (depth == digits.length) {
            res.add(stack.toString());
        } else {
            int i = depth;
            for (int j = 0; j < phoneMap.get(digits[i]).length; j++) {
//                if (visit.containsKey(phoneMap.get(digits[i])[j])) {
//                    if(visit.get(phoneMap.get(digits[i])[j])) continue;
//                }
//                if(stack.toString().contains(phoneMap.get(digits[i])[j])) continue;
//                visit.put(phoneMap.get(digits[i])[j], true);
                stack.append(phoneMap.get(digits[i])[j]);
//                System.out.println(stack.toString());
                dfs(digits, depth + 1, len, stack, visit, res, phoneMap);
//                visit.put(phoneMap.get(digits[i])[j], false);
                stack.deleteCharAt(stack.length() - 1);
            }
        }
        return res;
    }

}
