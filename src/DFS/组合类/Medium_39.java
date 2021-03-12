package DFS.组合类;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Medium_39 {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        System.out.println(combinationSum(candidates, 7));
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        if(candidates.length == 0) return ans;
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
            stack.push(candidates[i]);
            dfs(candidates, ans, stack, target - candidates[i], i);
            stack.pop();
        }
    }
}
