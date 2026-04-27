package Datastructure;

import java.util.Comparator;

public class MyComparator implements Comparator<String> {
    // MyComparator(){
    //     System.out.println("Calledddd"); 
    // }
    @Override
    public int compare(String x,String y){
        return x.length()-y.length();
    }
    
}
