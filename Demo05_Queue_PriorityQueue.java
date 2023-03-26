
import java.util.PriorityQueue;
import java.util.Queue;

public class Demo05_Queue_PriorityQueue {
    public static void main(String[] args) {
        Queue<String> priorityQueue = new PriorityQueue<>();
        CustomCollectionOperation.operateOn(priorityQueue);
    }
}
