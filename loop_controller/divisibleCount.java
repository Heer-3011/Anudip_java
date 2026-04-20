public class divisibleCount {
    public static void main(String args[]){
        int count=0;
        int num=5;
        for(int i=1;i<=50;i++)
        {
            if(i%5==0){
                count+=1;
            }
        }
        System.out.println("Total divisble number by 5 in rangee 1 top 50="+count);
    }  
}
