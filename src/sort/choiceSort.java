package sort;

public class choiceSort {
    public static void main(String[] args) {
        int[] ans = sort(new int[] {3,2,1,45,5,8,2,1,0});
        for(int i : ans) System.out.println(i);
    }

    public static int[] sort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int min = i;
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] < nums[min]){
                    min = j;
                }
            }
            if(min != i){
                int temp = nums[min];
                nums[min] = nums[i];
                nums[i] = temp;
            }
        }
        return nums;
    }
}
