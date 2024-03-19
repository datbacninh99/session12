package BT2;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String input = "[{(";
        boolean check = true;
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            check = true;
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                if (c == ')' || c == '}' || c == ']') {
                    check = false;
                }
            }
        }
        if (!stack.isEmpty() || !check) {
            System.out.println("Không hợp lệ");
        } else {
            System.out.println("Hợp lệ");
        }
    }
}