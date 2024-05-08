import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class MaxHeapToMinHeap {
    public static void main(String[] args) {
        Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.offer(50);
        maxHeap.offer(11);
        maxHeap.offer(3);
        maxHeap.offer(37);
        maxHeap.offer(8);
        maxHeap.offer(25);

        System.out.println("Max heap: " + maxHeap);

        System.out.print("Min heap: ");
        while(!maxHeap.isEmpty()) {
            System.out.print(-maxHeap.poll() + " ");
        }



    }
}
