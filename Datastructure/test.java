package Datastructure;
import java.util.List;
import java.util.ArrayList;
public class test {
    public static void main(String args[]){
        List<String> shopping= new ArrayList<>();
        shopping.add("Bags");
        shopping.add("Watches");
        shopping.add("Makeup");
        System.out.println(shopping);
        shopping.set(2, "Shoes");
        System.out.println(shopping);
    }
}
