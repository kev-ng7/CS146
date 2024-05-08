import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class MaxHeap {
    public static void main(String[] args) {
        Queue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());

        heap.offer(50);
        heap.offer(11);
        heap.offer(3);
        heap.offer(25);
        heap.offer(8);
        heap.offer(37);

        while (!heap.isEmpty()) {
            System.out.print(heap.poll() + " ");
        }
    }
}
