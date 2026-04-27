package Datastructure;
import java.util.Deque;
import java.util.ArrayDeque;
public class dequeueExample {
    public static void main(String args[]){
        Deque<String> d1=new ArrayDeque<>();
        d1.addFirst("First-A");
        d1.add("B");
        d1.addLast("Last-C");
        d1.add("E");
        System.out.println(d1); 

        // System.out.println(d1.removeFirst());
        // System.out.println(d1.removeLast());
        // System.out.println(d1); 

        System.out.println(d1.peek());
        System.out.println("Peeking 1st element"+d1.peekFirst());
        System.out.println("Peeking last element"+d1.peekLast());
        System.out.println(d1);
    }
}
