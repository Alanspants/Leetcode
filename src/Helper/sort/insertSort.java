package Helper.sort;

public class insertSort {
    public static void main(String[] args) {
        int[] ans = sort(new int[] {4,3,7,2,3,8,9,0});
        for(int i:ans){
            System.out.println(i);
        }
    }

    public static int[] sort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int j = i;
            int temp = nums[i];
            while (j > 0 && temp < nums[j - 1]) {
                nums[j] = nums[j - 1];
                j--;
            }
            nums[j] = temp;
        }
        return nums;
    }
}
