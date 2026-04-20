package Labs.Heer_Polymorphism;

public class hillstation {
    public void loaction(){
        System.out.println("Located in");
    }
    public void famousfor(){
        System.out.println("Famaous For=");
    }
    public static void main(String args[]) {
        Manali m=new Manali();
        m.loaction();
        m.famousfor();

        Mussoorie m2=new Mussoorie();
        m2.loaction();
        m2.famousfor();

        Gulmarg g=new Gulmarg();
        g.loaction();
        g.famousfor();
    }
}
class Manali extends hillstation{
    public void loaction(){
        System.out.println("Manali is located in Himachal Pradesh");
    }
    public void famousfor(){
        System.out.println("Its is famous for hadima Temple and adventure Sportss");
    } 
}
class  Mussoorie{
    public void loaction(){
        System.out.println("Mussoorie is Located in Uttrakhand");
    }
    public void famousfor(){
        System.out.println("it is famous for education insititution");
    }
}
class Gulmarg extends hillstation {
    public void loaction(){
        System.out.println("Gulmarg is in J&K");
    }
    public void famousfor(){
        System.out.println("Its famous For Skiing");
    }

}
