package Labs.Heer_oops;

import java.util.Scanner;

public class greater {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 1 number=");
        int a=sc.nextInt(); 
        System.out.println("Enter 2 number=");
        int b=sc.nextInt();

        int result= a>b ? a:b;
        System.out.println("among the both number "+result+" is greater");
        sc.close();
    }
}
