package DFS.全排序类;

public class Hard_60 {

    private int[] factorial;
    private int n;
    private int k;
    StringBuilder res = new StringBuilder();

    public void makeFactorial(int n) {
        factorial = new int[n + 1];
        factorial[0] = 1;
        for (int i = 1; i <= n; i++) {
            factorial[i] = factorial[i - 1] * i;
        }
    }

    public String getPermutation(int n, int k) {
        this.n = n;
        this.k = k;
        makeFactorial(n);
        boolean visited[] = new boolean[n + 1];
        dfs(0, visited);
        return res.toString();
    }

    public void dfs(int index, boolean[] visited) {
        if (index == n) return;
        int s = factorial[n - 1 - index];
        for (int i = 1; i <= n; i++) {
            if (visited[i]) continue;
            if (s < k) {
                k = k - s;
                continue;
            }
            visited[i] = true;
            res.append(Integer.toString(i));
            dfs(index + 1, visited);
            return;
        }
    }

    public static void main(String[] args) {
        Hard_60 obj = new Hard_60();
        System.out.println(obj.getPermutation(4, 9));
    }

}
