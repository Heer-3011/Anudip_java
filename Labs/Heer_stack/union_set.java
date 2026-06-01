package Labs.Heer_stack;
import java.util.HashSet;
import java.util.Set;

public class union_set {
    public static void main(String[] args) {
 
        Set<String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Cherry"); 

        Set<String> set2 = new HashSet<>();
        set2.add("Cherry");
        // set2.add("Date");
        // set2.add("Fig");
 
        Set<String> unionSet = new HashSet<>();
 
        unionSet.addAll(set1);
        unionSet.addAll(set2);
 
        System.out.println("Union Set:");
        System.out.println(unionSet);
 
        if (set1.containsAll(unionSet)) {
            System.out.println("Union Set is a subset of Set1");
        } else {
            System.out.println("Union Set is NOT a subset of Set1");
        }
    }
}