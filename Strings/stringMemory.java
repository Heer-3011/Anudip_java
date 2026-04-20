public class stringMemory {
    public static void main(String args[])
    {
        String a="Heer";
        String b="Heer";
        String c=new String("Heer");
        
        System.out.println(a==b); //same reference cause same object 
        System.out.println(b==c);
        System.out.println(a.equals(c));//checks value not reference 
    }
}
