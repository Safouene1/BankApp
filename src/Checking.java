public class Checking extends Account{
 // list properties specific to a checking account
   int debitCardNumber;
   int debitCardPIN;
    // Constructors and init account props
    public  Checking (String name, String sSN, double balance){
        super(name, sSN , balance);
        accountNumber= "2"+accountNumber;
     setDebitCard();
    }
    //  methods specific to the checking account
    private void setDebitCard(){
        debitCardNumber= (int)( Math.random() * Math.pow(10,12));
        debitCardPIN= (int) ( Math.random() * Math.pow(10,4) );
    }

    @Override
    public String toString() {
        return   super.toString()+ "\n Type = Checking" +
                "\ndebit Card Number=" + debitCardNumber +
                "\n debit Card PIN=" + debitCardPIN;
    }
    @Override
    public void setRate(){
        this.rate = getBaseRate() * .15;
    }
}
