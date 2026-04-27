package Datastructure;
import java.util.PriorityQueue; 
public class priorityQueue {
    public static void main(String args[]){
        PriorityQueue<String> p1=new PriorityQueue<>(15,new MyComparator());
        p1.add("Heer");
        p1.add("Shobhana");
        p1.add("Meet");
        p1.add("Person");
        System.out.println(p1);
    }
}
