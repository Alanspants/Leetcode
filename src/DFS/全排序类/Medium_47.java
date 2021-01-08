package DFS.全排序类;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Medium_47 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        System.out.println(permuteUnique(nums));
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        boolean[] visit = new boolean[nums.length];
        // 排序是剪枝的前提
        Arrays.sort(nums);
        return dfs(nums, 0, nums.length, stack, visit, res);
    }

    private static List<List<Integer>> dfs(int[] nums, int depth, int len, Stack<Integer> stack, boolean[] visit, List<List<Integer>> res) {
        if (depth == len) {
            res.add(new ArrayList<>(stack));
        }
        for (int i = 0; i < len; i++) {
            if (visit[i]) continue;
            // i > 0 保证 num[i-1] 有意义
            // num[i] = num[i-1] 判定和上一次的开始位置的数字相同
            // visit[i - 1] == false 判定上一位数是由回溯状态改变的 而不是已经访问的
            if (i > 0 && nums[i] == nums[i - 1] && visit[i - 1] == false) continue;
            visit[i] = true;
            stack.push(nums[i]);
            dfs(nums, depth + 1, len, stack, visit, res);
            visit[i] = false;
            stack.pop();
        }
        return res;
    }
}
