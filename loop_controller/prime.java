public class prime {
    public static void main(String args[]){
        int num=11;
        int count=0;
        for(int i=2;i<=num;i++)
        {
            if(num%i==0){
                count+=1;
            }

        }
        if(count>=2){
            System.out.println("Number is prime");
        }
        else{
            System.out.println("Number is not prime");
        }
    }
}
