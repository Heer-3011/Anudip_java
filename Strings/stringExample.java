public class stringExample {
    public static void main(String args[]){

        String s="Hello";
        String s2="Hello";
        String s1=new String("Hello"); 

        System.out.println(s);
        System.out.println(s1);

        if(s==s2){
            System.out.println("Similar");

        }
        else{
            System.out.println("different");
        }
    }
}
