import java.util.Scanner;
public class calculator {
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in);
        System.out.println ("Enter Number 1=");
        int num1=sc.nextInt();  
        System.out.println ("Enter Number 2=");
        int num2=sc.nextInt();  
        System.out.println("\n Menuuu\n \t1.Addition \n\t2.Substraction\n\t3.Multiplication\n\t4.division\n\t5.Modulo\n");
        System.out.println("Select any one number=");
        int choice=sc.nextInt();  
        switch(choice){
            case 1:
                System.out.println("Addition="+(num1+num2));
                break;
            case 2:
                System.out.println("Substraction="+(num1-num2));
                break;
            case 3:
                System.out.println("Multiplication="+(num1*num2));
                break;
            case 4:
                System.out.println("division="+(num1/num2));
                break;
            case 5:
                System.out.println("Modulo="+(num1%num2));
                break;
            default:
                System.out.println("Invalid choice");
                break; 
        }
    sc.close();
    }
}
