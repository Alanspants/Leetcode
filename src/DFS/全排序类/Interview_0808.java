package DFS.全排序类;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Interview_0808 {

    List<String> res = new ArrayList<>();

    public String[] permutation(String s) {
        int len = s.length();
        char[] input = s.toCharArray();
        Arrays.sort(input);
        boolean[] visited = new boolean[s.length()];
        StringBuilder stack = new StringBuilder();
        dfs(input, len, 0, visited, stack);
        return res.toArray(new String[res.size()]);
    }

    public void dfs(char[] input, int len, int depth, boolean[] visited, StringBuilder stack) {
        if (len == depth) {
            res.add(stack.toString());
            return;
        }
        for (int i = 0; i < len; i++) {
            if (visited[i]) continue;
            if (i > 0 && input[i] == input[i - 1] && !visited[i - 1]) continue;
            visited[i] = true;
            stack.append(input[i]);
            dfs(input, len, depth + 1, visited, stack);
            visited[i] = false;
            stack.deleteCharAt(stack.length() - 1);
        }
    }

    public static void main(String[] args) {
        Interview_0808 obj = new Interview_0808();
        System.out.println(Arrays.toString(obj.permutation("www")));
    }

}
