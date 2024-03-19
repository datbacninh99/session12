package BT5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String input = scanner.nextLine(); // Chuỗi đầu vào của bạn
        Queue<Character> filoInput = new ArrayDeque<>();
        Stack<Character> lifoInput = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            filoInput.offer(input.charAt(i));
            lifoInput.push(input.charAt(i));
        }
        System.out.println("Queue: " + filoInput);
        System.out.println("Stack: " + lifoInput);
        while (!lifoInput.isEmpty()) {
            if (filoInput.poll() != lifoInput.pop()) { // Lấy phần tử ở vị trí đầu Queue và cuối của Stack so sánh
                System.out.println("Không phải Palindrome");
                return;
            }
        }
        System.out.println("Là Palindrome");
    }
}