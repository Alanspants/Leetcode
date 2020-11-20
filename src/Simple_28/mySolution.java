package Simple_28;

public class mySolution {
    public static void main(String[] args) {
        System.out.println(strStr("hello","ll"));
    }

    public static int[] calNext(char[] ptr) {
        int next[] = new int[ptr.length];
        next[0] = -1;
        int k = -1;
        for (int q = 1; q < ptr.length; q++) {
            while (k > -1 && next[k + 1] != next[q]) k = next[k];
            if (next[k + 1] == next[q]) k++;
            next[q] = k;
        }
        return next;
    }

    public static int strStr(String haystack, String needle) {
        char[] str = haystack.toCharArray();
        char[] ptr = needle.toCharArray();
        int[] next = calNext(ptr);
        int k = -1;
        for (int q = 0; q < str.length; q++) {
            while (k > -1 && str[q] != ptr[k+1]) k = next[k];
            if (str[q] == ptr[k+1]) k++;
            if (k == ptr.length - 1) return q - ptr.length + 1;
        }
        return -1;
    }
}
