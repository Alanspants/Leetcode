package DFS.全排序类;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Interview_0807 {

    List<String> res = new ArrayList<>();

    public static void main(String[] args) {
        Interview_0807 solu = new Interview_0807();
        System.out.println(Arrays.toString(solu.permutation("qDHKARXp")));
    }

    public String[] permutation(String s) {
        boolean[] visit = new boolean[s.length()];
        StringBuilder stack = new StringBuilder("");
        char[] input = s.toCharArray();
        dfs(input, s.length(), 0, visit, stack);
        return res.toArray(new String[res.size()]);
    }

    public void dfs(char[] input, int len, int depth, boolean[] visit, StringBuilder stack) {
        if(depth == len) {
            res.add(stack.toString());
        }
        for (int i = 0; i < len; i++) {
            if(visit[i] == true) continue;
            visit[i] = true;
            stack.append(input[i]);
            dfs(input, len, depth+1, visit, stack);
            visit[i] = false;
            stack.deleteCharAt(stack.length() - 1);
        }

        // Arraylist -> String[]的方法
//        Object[] temp = res.toArray();
//        String[] ans = new String[temp.length];
//        for (int i = 0; i < temp.length; i++) {
//            ans[i] = temp[i].toString();
//        }
//        return ans;
    }
}
