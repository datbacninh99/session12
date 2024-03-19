package BT11;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] array = {1, 4, 6, 9, 5};
        for (int i = 0; i < array.length; i++) {
            if (stack.isEmpty() || array[i] > stack.peek()) {
                stack.push(array[i]);
            }
            System.out.println("Phần tử lớn nhất là: " + stack.peek());
        }
    }
}