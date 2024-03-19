package BT12;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        int[] ints = {12, 2, 1, 10, 44, 3};
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < ints.length; i++) {
            queue.offer(ints[i]);
        }
        System.out.println("Các phần tử trong Queue là: " + queue);

        int min = queue.poll();
        while (!queue.isEmpty()) {
            int element = queue.poll();
            if (min > element) {
                queue.add(element);
                min = element;
            } else {
                queue.add(min);
                break;
            }
        }
        System.out.println("Phần tử nhỏ nhất là: " + min);
    }
}
