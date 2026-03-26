public class employee {
    private int id ;
    private String name;
    void setter(int id,String name){
        this.id=id;
        this.name=name;
    }
    void getter(){
        System.out.println("Id=" + id);
        System.out.println("Name=" + name);
    }
}
