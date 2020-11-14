package Simple_20;

import java.util.Stack;

public class MySolution {
    public static void main(String[] args) {
        System.out.println(isValid("(]"));
    }

    public static boolean isValid(String s){
        if(s.equals("")) return true;
        char [] input = s.toCharArray();
        Stack<Character> stk = new Stack();
        for (char c : input) {
            if (stk.empty()){
                stk.push(c);
                continue;
            }
            if (match(stk.peek(), c)) {
                stk.pop();
            } else {
                stk.push(c);
            }
        }
        if(stk.empty()) return true;
        else return false;
    }

    public static boolean match(char target, char input){
        if(target == '(' && input == ')') return true;
        else if(target == '[' && input == ']') return true;
        else if(target == '{' && input == '}') return true;
        else return false;
    }
}
