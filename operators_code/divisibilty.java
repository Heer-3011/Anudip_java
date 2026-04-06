public class divisibilty {
    public static void main(String args[])
    {
        int num=5;

        if(num%3==0 && num%5==0){
            System.out.println("Number("+num+") is divisible by both 3 and 5");
        }
        else if(num%7==0 && num%11==0){
            System.out.println("Number("+num+") is divisible by both 7 and 11");
        }
        else{
            System.out.println("Number("+num+") is not divisible by both 3 and 5");
        }
    }
}
