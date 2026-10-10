import java.util.*;

public class QueueAndDeque {
    public static void main(String [] args){
        Queue<String> queue = new ArrayDeque<>();

        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        System.out.println(queue.poll());

        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(10);
        deque.addLast(20);

        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());

        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);

        System.out.println(stack.pop());
    }
}
