package Simple_13;

public class MySolution {
    public static void main(String[] args) {
        System.out.println(romanToInt("CMXCIX"));
    }

    public static int romanToInt(String s) {
        char[] c = s.toCharArray();
        int ans = 0;
        for(int i = c.length - 1; i >= 0; i--){
            char curr = c[i];
            if(i != 0){
                char prev = c[i-1];
                int temp = helper2(prev, curr);
//                ans += temp == 0 ? helper1(curr) : temp;
                if(temp == 0){
                    ans += helper1(curr);
                } else {
                    ans += temp;
                    i--;
                }
            } else {
                ans += helper1(curr);
            }

        }
        return ans;
    }

    public static int helper1(char input){
        switch(input) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }

    public static int helper2(char prev, char curr){
        String input = String.valueOf(prev) + String.valueOf(curr);
        switch(input){
            case "IV": return 4;
            case "IX": return 9;
            case "XL": return 40;
            case "XC": return 90;
            case "CD": return 400;
            case "CM": return 900;
        }
        return 0;
    }

}
