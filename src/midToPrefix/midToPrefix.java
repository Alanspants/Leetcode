package midToPrefix;

import java.util.Stack;

public class midToPrefix {
    public static void main(String[] args) {
        workstation("A*(B+C)-D/(E+F)");
    }

    public static void workstation(String input) {
        Stack<Character> s1 = new Stack<>();    // 操作符
        Stack<Character> s2 = new Stack<>();    // 数字, temp stack
        for (int i = 0; i < input.length(); i++) {
            char now = input.charAt(i);
            switch (now) {
                case '+':
                    meetOPRT(s1, s2, now);
                    break;
                case '-':
                    meetOPRT(s1, s2, now);
                    break;
                case '*':
                    meetOPRT(s1, s2, now);
                    break;
                case '/':
                    meetOPRT(s1, s2, now);
                    break;
                case '(':
                    meetBRKT(s1, s2, now);
                    break;
                case ')':
                    meetBRKT(s1, s2, now);
                    break;
                default:
                    s2.push(now);
            }
            System.out.println("now = " + now + "\ns1 = " + s1.toString() + "\ns2 = " + s2.toString());
        }
        while (!s1.empty()) {
            s2.push(s1.peek());
            s1.pop();
        }
        System.out.println(s2.toString());
    }

    public static void meetOPRT(Stack s1, Stack s2, char c) {
        while (true) {
            if (s1.empty() || (char) s1.peek() == '(') {
                s1.push(c);
                break;
            } else if (priority(c) > priority((char) s1.peek())) {
                s1.push(c);
                break;
            } else {
                s2.push(s1.peek());
                s1.pop();
            }
        }
    }

    public static void meetBRKT(Stack s1, Stack s2, char c) {
        if (c == '(') s1.push(c);
        else {
            while (!s1.empty()) {
                if((char)s1.peek() == '(') {
                    s1.pop();
                    break;
                }
                s2.push(s1.peek());
                s1.pop();
            }
        }
    }

    public static int priority(char c) {
        switch (c) {
            case '+':
                return 1;
            case '-':
                return 1;
            case '*':
                return 2;
            case '/':
                return 2;
        }
        return 0;
    }
}
