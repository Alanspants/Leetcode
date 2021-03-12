package DFS.组合类;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Medium_40 {
    public static void main(String[] args) {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        System.out.println(combinationSum2(candidates, 8));
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        if(candidates.length == 0) return ans;
        Arrays.sort(candidates);
        Stack<Integer> stack = new Stack<>();
        dfs(candidates, ans, stack, target, 0);
        return ans;
    }

    public static void dfs(int[] candidates, List<List<Integer>> ans, Stack<Integer> stack, int target, int index){
        if (target < 0) return;
        if (target == 0){
            ans.add(new ArrayList<>(stack));
        }
        for(int i = index; i < candidates.length; i++){
            if (target - candidates[i] < 0) break;
            if (i > index && candidates[i] == candidates[i - 1]) continue;
            stack.push(candidates[i]);
            dfs(candidates, ans, stack, target - candidates[i], i + 1);
            stack.pop();
        }
    }
}
