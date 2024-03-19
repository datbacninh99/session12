package BT14;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String input = scanner.nextLine(); // Chuỗi đầu vào2
        Stack<Integer> stack = new Stack<>();

        // Duyệt qua từng ký tự trong chuỗi đầu vào
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(Character.getNumericValue(c));
            }
        }

        // Lấy từng ký tự từ stack và kiểm tra xem chúng có phải là số nguyên tố hay không
        boolean isPrimeSequence = true;
        while (!stack.isEmpty()) {
            int num = stack.pop();
            if (!isPrime(num)) {
                isPrimeSequence = false;
                break;
            }
        }

        // Kết thúc chương trình
        if (isPrimeSequence) {
            System.out.println("Chuỗi đầu vào là dãy số nguyên tố");
        } else {
            System.out.println("Chuỗi đầu vào không phải là dãy số nguyên tố");
        }
    }
}