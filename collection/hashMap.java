package collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.Set;
public class hashMap {
    public static void main(String args[]){
        Map<Integer,String> student=new HashMap<>();
        student.put(1, "Heer");
        student.put(2,"Meett");
        student.put(3,"abc");
        student.put(1,"xyz");
        System.out.println(student);

        Map<String, String> capitals = new LinkedHashMap<>();
        capitals.put("India", "Delhi");
        capitals.put("USA", "Washington");
        capitals.put("UK", "London");
        System.out.println(capitals);

        // TREE SETTT 
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(0);
        numbers.add(34);
        numbers.add(25); 
        numbers.add(0);
        System.out.println(numbers);
    }
}
