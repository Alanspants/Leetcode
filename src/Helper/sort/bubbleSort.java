package Helper.sort;

public class bubbleSort {
    public static void main(String[] args) {
        int[] ans = sort(new int[] {5,4,3,1,2,6,12,3,2,9,124});
        for(int i:ans){
            System.out.println(i);
        }
    }

    public static int[] sort(int[] nums){
        for(int i = 1; i < nums.length; i++){
            boolean flag = true;
            for(int j = 0; j < nums.length - i; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    flag = false;
                }
            }
            if(flag) break;
        }
        return nums;
    }
}
