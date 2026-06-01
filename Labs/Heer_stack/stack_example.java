package Labs.Heer_stack;

import java.util.Stack;

public class stack_example {
    public static void main(String args[]){
 
        Stack<Integer> s1=new Stack<>(); 
        s1.push(23);
        s1.push(45);
        s1.push(90);
        s1.push(21);
        s1.push(67);
        s1.push(12);
        s1.push(90);
        s1.push(34);
        s1.push(90);
        s1.push(44);

        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
        System.out.println(s1);

     }
}
