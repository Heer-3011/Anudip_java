package Datastructure;
import java.util.Stack;
public class stackExample{
    public static void main(String args[]){
        Stack<Integer> s1=new Stack<>();

        //System.out.println(s1);
        System.out.println("Before adding elements s1.empty()="+s1.empty());
        // System.out.println(s1.peek());
        s1.push(23);
        s1.push(45);
        s1.push(90);
        s1.push(21);

        System.out.println(s1);
        
        System.out.println("After adding elements s1.empty()="+s1.empty());
        System.out.println(s1.pop());
        
        System.out.println(s1);
        
        System.out.println(s1.peek());
        System.out.println("Searching 44 in the list= "+s1.search(44)); 
        System.out.println("Searching 44 in the list= "+s1.search(45));
    }
}