public abstract class Account implements  IBaseRate {
    // Common properties for saving or checking account
    private String name ;
    private String sSN; // Social Security Number
    private double balance;
    protected String accountNumber;
    static int index=100000;
    protected double rate;

    // instructor and init account
   public Account (String name, String sSN, double  balance) {
        this.name=name;
        this.sSN=sSN;
        this.balance =balance;
        this.accountNumber=setAccountNumber();
        index++;
        setRate();
   }
   public abstract void setRate();

    public double getBalance() {
        return balance;
    }
 private  String setAccountNumber(){
       String lastTwoOfSSN= sSN.substring(sSN.length()-2,sSN.length());
       int UniqueId= index;
       int randomNumber=(int) (Math.random() * Math.pow(10,3)) ;
       return lastTwoOfSSN+ index + randomNumber;
 }
    // List Common Methods
    // Compound method
    public void compound(){
        double accrudInterest = balance * (rate/100) ;
        balance += accrudInterest;
        System.out.println("Accrud Interest : "+accrudInterest +"$"+
                "\n Your New Balance :" + getBalance() +"$");
    }
    // Deposit method
    public void deposit(double amount) {
        balance+=amount;
        System.out.println("Depositing : "+amount+"$"+
                "\n New Balance :" + getBalance() +"$");
    }
    // Withdraw Method
     public void withdraw(double amount) {
         balance-=amount;
         System.out.println("Withdrawing : "+amount+"$" +
                 "\n New Balance :" + getBalance() +"$");
     }
     //Transfer Method
     public void transfer(String toWhere , double amount){
    balance-=amount;
         System.out.println("Transfering  : "+amount+"$" +
                 "\n New Balance :" + getBalance() +"$");
     }

        // To String
    @Override
    public String toString() {
        return "** Account **" +
                "\nname=" + name  +
                "\n Social Security Number=" + sSN  +
                "\n balance=" + balance + "$"+
                "\n account Number=" + accountNumber  +
                "\n rate=" + rate+"%";
    }
}
