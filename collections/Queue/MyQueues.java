package collections.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueues {

    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.offer(2);
        q.add(3);
        q.offer(4);
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q.remove());
        System.out.println(q);
        q.clear();
        //sout(q.remove());
        System.out.println(q.poll());
        q.offer(6);
        q.offer(7);
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.contains(7));
        //q.clear();
        //System.out.println(q.element());
    }
}
