package collections.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeues {
    public static void main(String[]args) {
        Deque<Integer> dq=new ArrayDeque<>();
        dq.addFirst(5);
        dq.addFirst(4);
        dq.addLast(3);
        dq.addLast(2);
        dq.addLast(1);
        System.out.println(dq);
        dq.remove(3);
        System.out.println(dq);
        System.out.println(dq.poll());
        System.out.println(dq.pollLast());

    }
}
