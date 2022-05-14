public class Account{
  private double balance;
  private String accountName;
  
  public Account(String name, double initialBalance){
    this.accountName = name;
    this.balance = initialBalance;
  }

  public double getBalance(){
    return this.balance;
  }

  public void deposit(double depositAmount){
    this.balance += depositAmount;
  }

  public double withdraw(double withdrawAmount){
    if (this.balance >= withdrawAmount){
      this.balance -= withdrawAmount;
      return withdrawAmount;
    }

    else{
      System.out.println("Not enough money in account!");
      return 0;
    }
  }
}
