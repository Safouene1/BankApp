public class Savings extends Account {
    // list properties specific to a saving account
    private int safetyDepositBoxId;
    private  int safetyDepositKey;
    // Constructors and init account props
    public  Savings (String name, String sSN, double balance){
        super(name,sSN, balance);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }
    // methods specific to the savings account


    private void setSafetyDepositBox() {
    safetyDepositBoxId= (int)( Math.random() * Math.pow(10,3));
    safetyDepositKey= (int) ( Math.random() * Math.pow(10,4) );
    }

    @Override
    public String toString() {
        return super.toString() + "\n Type = Savings" +
                "\nSafety Deposit Box ID=" + safetyDepositBoxId +
                "\n safety Deposit Box Key=" + safetyDepositKey ;
    }
    @Override
    public void setRate(){
        this.rate= getBaseRate() - .25;
    }

}
