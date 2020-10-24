package Simple_1576;

public class OfficialSolution {
    public String modifyString(String s) {
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '?') {
                char prev = i == 0 ? ' ' : c[i - 1];
                char behind = i == c.length - 1 ? ' ' : c[i + 1];
                char temp = 'a';
                while (temp == prev || temp == behind) {
                    temp++;
                }
                c[i] = temp;
            }
        }
        return new String(c);
    }
}
