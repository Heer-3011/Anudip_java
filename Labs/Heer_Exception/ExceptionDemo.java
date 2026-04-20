package Labs.Heer_Exception;

public class ExceptionDemo {
    public static void main(String args[]){
        try{
            int[] numbers={1,2,3,4};

            for(int i=0;i<=6;i++){
                System.out.println(numbers[i]);
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("You tried to access array out of bound index");        
        }
    }
}
    