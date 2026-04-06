public class ternary {
    public static void main(String args[])
    {
        int a=10;
        int b=20;
        
        int result1=(a>b)?a:b;
        System.out.println(result1); 
        
        int c=4;
        int smallest = (a < b) ? (a < c ? a : c) : (b < c ? b : c);
        System.out.println("Smallest: "+ smallest);
    }
}
