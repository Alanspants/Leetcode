package DFS.子集类;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Medium_90 {
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        System.out.println(subsetsWithDup(nums));
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        Arrays.sort(nums);
//        ans.add(new ArrayList<>(stack));
        dfs(nums, ans, stack, 0);
        return ans;
    }

    public static void dfs(int[] nums, List<List<Integer>> ans, Stack<Integer> stack, int depth) {
        ans.add(new ArrayList<>(stack));
        for(int i = depth; i < nums.length; i++){
            if(i > depth && nums[i] == nums[i - 1]) continue;
            stack.add(nums[i]);
            dfs(nums, ans, stack, i+1);
            stack.pop();
        }
    }
}
