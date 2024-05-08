import java.util.PriorityQueue;
import java.util.Queue;

public class MinHeapToMaxHeap {
    public static void main(String[] args) {
        Queue<Integer> minHeap = new PriorityQueue<>();
        int[] array = {50, 11, 3, 37, 8, 25};

        for (int num : array) {
            minHeap.offer(-num);
        }

        System.out.println("Min heap: " + minHeap);
        System.out.print("Max heap: ");
        while(!minHeap.isEmpty()) {
            System.out.print(-minHeap.poll() + " ");
        }
    }
}
