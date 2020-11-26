package sort;

public class kruthShellSort {
    public static void main(String[] args) {
        int[] a = {4,6,1,2,6,5,9};
        sort(a);
        for(int i : a) System.out.println(i);
    }

    public static void sort(int[] array) {
        int step = 1;
        int len = array.length;
        while (step <= len / 3) {
            step = (step + 1) * 3;
        }
        while(step > 0){
            for(int i = step; i < len; i++){
                int temp = array[i];
                int j = i;
                while(j > step - 1 && temp <= array[j-step]){
                    array[j] = array[j - step];
                    j = j - step;
                }
                array[j] = temp;
            }
            step = (step - 1)/3;
        }
    }
}
