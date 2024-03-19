package BT1;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Một");
        queue.add("Hai");
        queue.add("Ba");

        System.out.println("Các phần tử của Queue là: ");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        System.out.println("Queue sau khi lấy là rỗng: " + queue.isEmpty());
    }
}