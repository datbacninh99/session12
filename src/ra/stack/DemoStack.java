package ra.stack;

import java.util.*;

public class DemoStack {
    public static void main(String[] args) {
        // Khởi tạo stack
        Stack<String> stack = new Stack<>();

        // Thêm các phần tử vao stack
        stack.push("Q Anh"); // 3
        stack.push("L Anh"); // 2
        stack.push("Ngọc Anh"); // 1


        // Lấy nhưng ko xóa phần tử đầu
        System.out.println(stack.peek());
        // Lấy và xóa
        System.out.println(stack.pop());
        System.out.println(stack);


        // Kiểm tra stack có phần tử hay không
        // Duyệt stack
//        while (!stack.empty()) {
//            String element = stack.pop();
//            System.out.println("Phần tử kế tiêp : " + element);
//        }

        // Tìm kiếm phần tử
        System.out.println(stack.search("Q Anh"));

        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

        Queue<String> queue = new PriorityQueue<>();
        queue.add("Khánh");
        queue.add("Nam");
        queue.add("Sơn");
        queue.offer("Hùng");
        // Lấy nhưng không xóa
        System.out.println(queue.peek());
//        System.out.println(queue.remove()); // Ném ra lỗi nếu hàng đợi rỗng
//        System.out.println(queue.poll());
        System.out.println(queue.element());
        System.out.println(queue);

        // Dequeue
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("Quỳnh Anh");
        deque.addFirst("Ngọc Anh");
        deque.addFirst("Hồng Anh");
        deque.addLast("Trung Hiếu");
        deque.addLast("Văn Đạt");

        while (!deque.isEmpty()) {
            System.out.println(deque.poll());
        }
    }
}