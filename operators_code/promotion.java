public class promotion {
    public static void main(String args[]) 
    {
        int salary=30000;
        int exp=2;
        String promo=(salary>20000 && exp>2) ? "Promoted" : "Not Promoted";
        System.out.println(promo);
    }
}
