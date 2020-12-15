import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BankAccounApp {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Please type the file path : \n");
        String file= sc.nextLine();
         List<Account> accounts = new LinkedList<Account>();

    // Reading CSV file
        List<String[]> newAccountHolders =  utilities.CSV.read(file);
        for(String[] accountHolder : newAccountHolders){
            String name= accountHolder[0];
            String sSN= accountHolder[1];
            String accountType= accountHolder[2];
            double balance= Double.parseDouble(accountHolder[3]);
          //  System.out.println("name: " +name + "\tsSn: "+sSN+"\taccount Type: "+accountType+"\tbalance: "+balance);
        if(accountType.equals("Checking")) {
            accounts.add(new Checking(name,sSN,balance));
        }else if (accountType.equals("Savings")){
            accounts.add(new Savings(name,sSN,balance));
        }
        else{
            System.out.println("Error reading account type");
        }
        }
        for (Account acc : accounts){
            System.out.println("**************");
            System.out.println(acc);
        }
    }


    }

