
import java.util.ArrayDeque;
import java.util.Queue;

public class Demo06_Queue_ArrayDeque {
    public static void main(String[] args) {
        Queue<String> priorityQueue = new ArrayDeque<>();
        CustomCollectionOperation.operateOn(priorityQueue);
    }
}
