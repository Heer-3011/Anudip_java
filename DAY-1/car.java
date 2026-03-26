class car {
    car()
    {
        System.out.println("This is a constructor");
        int colour=2;
        System.out.println("Local variable=" + colour);
    }
    String model="BMW";
    int year=2026;
    static int price=500000; 
    public static void main(String args[]){
        car c1=new car();
        System.out.println("Model=" + c1.model);
        System.out.println("Instance variable=" + c1.year);
        System.out.println("Static variable=" + c1.price);
        //System.out.println("Local variable=" + c1.colour);
    }
}
