package Labs.Heer_Collection;

import java.util.ArrayList;
import java.util.List;
public class sum {
    public static void main(String args[]){
        List<Integer> numbers =new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(25);
        numbers.add(8);
        numbers.add(10);
        numbers.add(15);

        int sum=0;
        for (int i=0;i< numbers.size();i++){
            if (numbers.get(i)%2==0){
                sum+=numbers.get(i);
            }
        }
        System.out.println("sum of all even numbers in arraylist = "+sum);
    }
}
