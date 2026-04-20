public class digit {
    public static void main(String args[])
    {
        int num=12343; 
        int digit=0;
        while(num!=0){  
            num/=10; 
            digit+=1;
        }
        System.out.println("Number of digits= "+digit);
    }
}
