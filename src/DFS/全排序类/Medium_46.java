package DFS.全排序类;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Medium_46 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(permute(nums));
    }

    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        boolean[] visit = new boolean[nums.length];
        return dfs(nums, 0, nums.length, stack, visit, res);
    }

    private static List<List<Integer>> dfs(int[] nums, int depth, int len, Stack<Integer> stack, boolean[] visit, List<List<Integer>> res) {
        if(depth == len){
            res.add(new ArrayList<>(stack));
        }
        for (int i = 0; i < len; i++) {
            if(visit[i]) continue;
            visit[i] = true;
            stack.push(nums[i]);
            dfs(nums, depth+1, len, stack, visit, res);
            visit[i] = false;
            stack.pop();
        }
        return res;
    }


}
