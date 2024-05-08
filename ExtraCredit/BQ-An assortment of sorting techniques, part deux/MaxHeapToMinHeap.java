import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class MaxHeapToMinHeap {
    public static void main(String[] args) {
        Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int[] array = {50, 11, 3, 37, 8, 25};

        for (int num : array) {
            maxHeap.offer(-num);
        }

        System.out.println("Max heap: " + maxHeap);
        System.out.print("Min heap: ");
        while(!maxHeap.isEmpty()) {
            System.out.print(-maxHeap.poll() + " ");
        }
    }
}
