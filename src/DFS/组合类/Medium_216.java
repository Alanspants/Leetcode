package DFS.组合类;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Medium_216 {
    public static void main(String[] args) {
        System.out.println(combinationSum3(3, 9));
    }

    public static List<List<Integer>> combinationSum3(int k, int n) {
//        int num[] = {1,2,3,4,5,6,7,8,9};
        List<List<Integer>> ans = new ArrayList<>();
        if (k == 0) return ans;
        Stack<Integer> stack = new Stack<>();
        dfs(ans, stack, k, n, 1);
        return ans;
    }

    public static void dfs(List<List<Integer>> ans, Stack<Integer> stack, int k, int n, int index){
        if(n < 0 ) return;
        else if(n == 0 && k == 0){
            ans.add(new ArrayList<>(stack));
        } else if (n != 0 && k == 0){
            return;
        }
        for(int i = index; i < 10; i++) {
            stack.push(i);
            dfs(ans, stack, k - 1, n - i, i + 1);
            stack.pop();
        }
    }
}
