package Labs.Heer_oops;
class bank{
    int amount=0;
    public void withdraw(double withdrawalAmount )
    {
        String message = (withdrawalAmount <= amount) ? "Withdrawal successful" : "Insufficient balance"; 
        if(message=="Withdrawal successful")
        {
            amount-=withdrawalAmount;
            System.out.println(message+"\n Current Balance="+amount);
        }
    }
    public void deposit(double depositAmount){
        amount+=depositAmount;
        System.out.println("Deposite Successfull\nTotal balnace="+amount);
    }
    public static void main(String args[]){
        bank b1=new bank();
        b1.deposit(5000);
        b1.withdraw(9000);
    }
}