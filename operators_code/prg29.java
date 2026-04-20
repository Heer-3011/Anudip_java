public class prg29{
    public static void main(String args[]){
        int a=990;
        int b=220;
        int c=30;

        if(a==b && a==c && b==c){ 
            System.out.println("A,B,C al are equal");
        } 
        else{
            if(a>b && a>c)
            {
                System.out.println("A is greatest");
            }
            else if(b>c){
                System.out.println("B is greatest");
            }
            else{
                    System.out.println("C is greatest");
                }
            } 
    }
}