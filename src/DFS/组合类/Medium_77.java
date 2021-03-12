package DFS.组合类;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Medium_77 {
    public static void main(String[] args) {
        List<List<Integer>> ans = combine(4, 2);
        for(List<Integer> temp : ans){
            System.out.println(temp);
        }
    }

    public static List<List<Integer>> combine(int n, int k){
        List<List<Integer>> ans = new ArrayList<>();
        if (n < 1 || k <=0) return ans;
        Stack<Integer> stack = new Stack<>();
        int depth = 1;
        dfs(ans, stack, depth, n, k);
        return ans;
    }

    public static void dfs(List<List<Integer>> ans, Stack<Integer> stack, int depth, int n, int k){
        if (stack.size() == k) {
            ans.add(new ArrayList<>(stack));
            return;
        }
        for(int i = depth; i <= n; i++){
            System.out.println("depth = " + depth);
            stack.push(i);
//            System.out.println("Before i: " + i + " stack: " + stack);
            dfs(ans, stack, i + 1, n, k);
            stack.pop();
//            System.out.println("After i: " + i + " stack: " + stack);
        }
    }
}
