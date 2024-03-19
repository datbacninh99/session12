package BT13;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String input = scanner.nextLine(); // Chuỗi đầu vào
        Stack<Character> stack = new Stack<>();

        // Đưa các ký tự của chuỗi vào stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Khởi tạo một biến flag để lưu trữ kết quả kiểm tra
        boolean isDescending = true;

        // Duyệt qua từng ký tự trong chuỗi đầu vào
        for (char c : input.toCharArray()) {
            // So sánh với ký tự đầu tiên trong stack
            if (c > stack.peek()) {
                // Nếu ký tự trong chuỗi lớn hơn ký tự đầu tiên trong stack
                isDescending = false;
                break;
            }
            stack.pop();
        }

        // Kiểm tra kết quả
        if (isDescending) {
            System.out.println("Chuỗi đầu vào là dãy giảm dần");
        } else {
            System.out.println("Chuỗi đầu vào không phải là dãy giảm dần");
        }
    }
}