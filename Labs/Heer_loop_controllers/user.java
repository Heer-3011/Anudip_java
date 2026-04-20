package Labs.Heer_loop_controllers;

import java.util.Scanner;

public class user {
    Scanner sc=new Scanner(System.in);
    int id;
    String name;

    user(){
         
        this.id=sc.nextInt();
        sc.nextLine();
        this.name=sc.nextLine();
    }
     public static void main(String args[])
    {
        employee e1=new employee();
        e1.calculateAnnualSalary();
    }
}
class employee extends user{
    double salary;
    double annualSalary;
    Scanner sc=new Scanner(System.in);
    employee(){
        super();
        this.salary=sc.nextDouble();
    }

    public void calculateAnnualSalary(){
        this.annualSalary=salary*12;
        System.out.println("Annual Salary="+annualSalary);
    } 
   
}

