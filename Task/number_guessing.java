package Task;
import java.math.*; 
import java.util.*;
public class number_guessing {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in) ;
         //int random= Math.round(100);
         int random=5;
        int i=0;
        while (i<5){
            System.out.println("Enter input: ");
            int user_input=sc.nextInt();
            if (user_input<random) {
                System.out.println("Your input is much lower ");
            }
            else if (user_input>random){
                System.out.println("Your input is much higher ");
            }
            else if(user_input==random) {
                System.out.println("Winnn\n COrrect guess ");
                break;
            }
            i++;
        }
    }
}
