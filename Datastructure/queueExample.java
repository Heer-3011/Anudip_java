package Datastructure;
import java.util.Queue;
import java.util.LinkedList;
public class queueExample {
    public static void main(String args[]){ 
        Queue<String> veggies=new LinkedList<>();

        veggies.add("Potato");
        veggies.add("Tomato");
        veggies.add("Brocolii");
        veggies.add("Bell pepper");
        
        System.out.println("Elements in Queue: " + veggies);
        System.out.println("element() Helps to view 1st element ="+veggies.element());
        //System.out.println("veggies.remove() without using the elment name="+veggies.remove());
        System.out.println("veggies.remove() using the elment name="+veggies.remove("Brocolii"));
        System.out.println(veggies); 
        System.out.println(veggies.poll());

    }   
}
