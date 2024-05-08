import java.util.PriorityQueue;
import java.util.Queue;

public class MinHeapToMaxHeap {
    public static void main(String[] args) {
        Queue<Integer> minHeap = new PriorityQueue<>();

        minHeap.offer(-50);
        minHeap.offer(-11);
        minHeap.offer(-3);
        minHeap.offer(-37);
        minHeap.offer(-8);
        minHeap.offer(-25);

        System.out.println("Min heap: " + minHeap);

        System.out.print("Max heap: ");
        while(!minHeap.isEmpty()) {
            System.out.print(-minHeap.poll() + " ");
        }



    }
}
