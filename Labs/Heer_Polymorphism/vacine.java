package Labs.Heer_Polymorphism;

public abstract class vacine {
    int age;
    String nationality;
    boolean firstdose;
    boolean seconddose;
    vacine(int age,String nationality){
        this.age=age;
        this.nationality=nationality;
    }
    public void firstDose(){
        if (this.age>18 && this.nationality=="indian"){
            this.firstdose=true;
            System.out.println("First dose Successfullyy done \n User needs to pay 250");
        }
    }
    public void secondDose(){
        if(firstdose){
            this.seconddose=true;
            System.out.println("Second dose Successfullyy done");
        }
    }
    public abstract void boosterDose();
    
    public static void main(String args[]){
        vaccinationSuccessful v=new vaccinationSuccessful(20,"indian");
        v.firstDose();
        v.secondDose();
        v.boosterDose();
    }
}
class vaccinationSuccessful extends vacine{
    vaccinationSuccessful(int age,String nationality){
        super(age,nationality);
    }
    public void boosterDose(){
        if(super.firstdose && super.seconddose)
        System.out.println("Booster dose Successfullyy done");
    }
}


