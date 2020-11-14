package Simple_415;

public class MySolution {
    public static void main(String[] args) {
        System.out.println(addStrings("123456", "123456789"));
    }

    public static String addStrings(String num1, String num2){
        int length1 = num1.length();
        int length2 = num2.length();
        if(length1 < length2) num1 = moreZero(num1, num2);
        else num2 = moreZero(num2, num1);
//        System.out.println("num1 = " + num1 + "\nnum2 = " + num2);
        char[] c1 = num1.toCharArray();
        char[] c2 = num2.toCharArray();
//        String ans = "";
        StringBuffer ans = new StringBuffer();
        int sum = 0;
        int plus = 0;
        for(int i = c1.length-1; i >= 0; i--){
            int n1 = c1[i] - '0';
            int n2 = c2[i] - '0';
            sum = n1 + n2 + plus;
            if(sum >= 10) {
                sum = sum - 10;
                plus = 1;
            } else {
                plus = 0;
            }
            char current = (char)(sum + '0');
//            ans = String.valueOf(current) + ans;
            ans.append(String.valueOf(current));
        }
        if(plus == 1) ans.append('1');
        ans = ans.reverse();
        return ans.toString();
    }

    public static String moreZero(String sh, String lo){
        int lengthShort = sh.length();
        for(int i = 0; i < (lo.length() - lengthShort); i++){
            sh = "0" + sh;
        }
        return sh;
    }

}
