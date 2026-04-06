public class greatest {
    public static void main(String args[])
    {
        int a=100;
        int b=120;
        int c=30;

        if(a>b && a>c){
            System.out.println("A is greatest among all");
        }
        else if(b>a && b>c){
            System.out.println("B is greatest among all");
        }
        else{
            System.out.println("C is greatest among all");
        }
    }
}
