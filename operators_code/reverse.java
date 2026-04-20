public class reverse {
    public static void main(String args[]){
        int num=121;
        int org=num;
        int rem=0;
        int rev=0; 
        while(num!=0){  
            rem=num%10;
            rev=rev*10+rem;
            num/=10;  
        }
        System.out.println("Reverse = "+rev);
        if(org==rev){
            System.out.println("Number is palidrone");
        }
    }
}
