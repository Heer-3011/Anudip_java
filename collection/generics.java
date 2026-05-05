package collection;

import java.util.ArrayList;

public class generics {
    public static void main(String args[]){
        // ArrayList list = new ArrayList( );
        // list.add("Hello");
        // list.add(10);
            
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello"); 
        //list.add(10); 

        String s = list.get(0);    
    }
}
