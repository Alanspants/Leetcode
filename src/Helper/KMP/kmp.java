package Helper.KMP;

public class kmp {
    public static void main(String[] args) {
        String str1 = "badababacamb";
        String str2 = "ababaca";
        System.out.println(kmp(str1.toCharArray(), str2.toCharArray()));
    }

    public static int[] calNext(char[] ptr) {
        int[] next = new int[ptr.length];
        next[0] = -1;
        int k = -1;
        for (int q = 1; q < ptr.length; q++) {
            while (k > -1 && ptr[k + 1] != ptr[q]) k = next[k];
            if (ptr[k + 1] == ptr[q]) k = k + 1;
            next[q] = k;
        }
        return next;
    }

    public static int kmp(char[] str, char[] ptr) {
        int next[] = calNext(ptr);
        int k = -1;
        for (int q = 0; q < str.length; q++) {
            while (k > -1 && ptr[k + 1] != str[q]) k = next[k];
            if (ptr[k + 1] == str[q]) k = k + 1;
            if (k == ptr.length - 1) return q - ptr.length + 1;
        }
        return -1;
    }
}
