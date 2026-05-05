package collection;
import java.util.ArrayList;
import java.util.List;
public class collectionExample {
    public static void main(String args[]){
        List<String> fruits =new ArrayList<String>();
        fruits.add("Kiwi");
        fruits.add("Mango");
        fruits.add("Watermelon");   

        for(String fruit:fruits){
            System.out.println(fruit);
        }
    }
}
