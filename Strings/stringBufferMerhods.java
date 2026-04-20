public class stringBufferMerhods {
    public static void main(String args[])
    {
        StringBuffer sb1=new StringBuffer("Heer ");
        sb1.append("Shobhana"); 
        sb1.insert(0,"Patel ");
        System.out.println(sb1);

        System.out.println(sb1.delete(0, 5));
        System.out.println(sb1.reverse());
    }
}
