package BT6;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Biểu thức đầu vào
        String input = "s * (s – a) * (s – b) * (s – c)";

        // Tạo một stack để lưu trữ các dấu ngoặc mở
        Stack<Character> bStack = new Stack<>();

        // Biến kiểm tra xem biểu thức có hợp lệ hay không
        boolean isValid = true;

        // Duyệt qua từng ký tự trong biểu thức
        for (char sym : input.toCharArray()) {
            // Nếu ký tự là dấu ngoặc mở, đẩy nó vào stack
            if (sym == '(' || sym == '{' || sym == '[') {
                bStack.push(sym);
            }
            // Nếu ký tự là dấu ngoặc đóng và stack không rỗng
            else if ((sym == ')' || sym == '}' || sym == ']') && !bStack.isEmpty()) {
                // Lấy dấu ngoặc mở trên cùng stack
                char left = bStack.peek();

                // Nếu dấu ngoặc đóng khớp với dấu ngoặc mở, loại bỏ dấu ngoặc mở khỏi stack
                if ((sym == ')' && left == '(') || (sym == '}' && left == '{') || (sym == ']' && left == '[')) {
                    bStack.pop();
                }
                // Nếu không khớp, gán isValid là false và thoát vòng lặp
                else {
                    isValid = false;
                    break;
                }
            }
            // Nếu ký tự là dấu ngoặc đóng và stack rỗng, gán isValid là false và thoát vòng lặp
            else if (sym == ')' || sym == '}' || sym == ']') {
                isValid = false;
                break;
            }
        }

        // Nếu stack không rỗng sau khi duyệt hết biểu thức, gán isValid là false
        if (!bStack.isEmpty()) {
            isValid = false;
        }

        // In ra kết quả kiểm tra
        if (isValid) {
            System.out.println("Biểu thức sử dụng đúng dấu ngoặc.");
        } else {
            System.out.println("Biểu thức không sử dụng đúng dấu ngoặc.");
        }
    }
}