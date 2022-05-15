import java.util.*;

public class openSession{


    private boolean isValidUser;

    public openSession(){
        this.isValidUser = false;
    }

    public void openNewSession(){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter your username: ");
        String userName = scnr.nextLine();
        System.out.println("Please enter ypur password: ");
        String password = scnr.nextLine();
        for(int i = 0; i < Account.getAccountLists().size(); i++){
            Account currAccount = Account.getAccountLists().get(i);
            if (userName.equals(currAccount.getuserName()) &&
            password.equals(currAccount.getPassword())){
                this.isValidUser = true;
                System.out.println("Welcome back " + userName);
                int userCommand = 0;
                while (userCommand != 4){
                    System.out.println("Please enter the number next to the action you'd like: ");
                    System.out.println("1 - Get Balance \n 2 - Deposit money \n 3 - Withdraw money \n 4 - Close current session");
                    userCommand = scnr.nextInt();
                    openSession.commandAction(userCommand, currAccount);
                }

            }
        }
    }

    public static void commandAction(int userCommand, Account acc){
        Scanner scnr = new Scanner(System.in);
        switch (userCommand){
            case 1: acc.getBalance();
                    break;
            case 2: System.out.println("How much would you like to deposit?");
                    double depositAmount = scnr.nextDouble();
                    acc.deposit(depositAmount);
                    break;
            case 3: System.out.println("How much would you like to withdraw?");
                    double withdrawAmount = scnr.nextDouble();
                    acc.withdraw(withdrawAmount);
                    break;
            case 4: break;
            default: System.out.println("Please enter a number between 1 and 4.");
                     break;
        }
        
    }

    public static void main(String[] args){
        Account createdAccount = new Account("Tyler's checking", 500.00, "tculp", "Norf Norf");
        Account.addToAccountList(createdAccount);
        //System.out.println(Account.getAccountLists().size());
        openSession current = new openSession();
        current.openNewSession();
    }

}