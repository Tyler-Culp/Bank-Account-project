import java.util.*;

public class Account{
  private double balance;
  private String accountName;
  private String userName;
  private String password;
  private static ArrayList<Account> accountsList = new ArrayList<>();
  public Account(){

  }
  
  public Account(String name, double initialBalance, String userName, String password){
    this.accountName = name;
    this.balance = initialBalance;
    this.userName = userName;
    this.password = password;
  }

  public double getBalance(){
    return this.balance;
  }

  public String getAccountName(){
    return this.accountName;
  }

  public String getuserName(){
    return this.userName;
  }

  public String getPassword(){
    return this.password;
  }

  public void deposit(double depositAmount){
    this.balance += depositAmount;
  }

  public void withdraw(double withdrawAmount){
    if (this.balance >= withdrawAmount){
      this.balance -= withdrawAmount;
      return;
    }

    else{
      System.out.println("Not enough money in account!");
      return;
    }
  }

  public static ArrayList<Account> getAccountLists(){
    return accountsList;
  }

  public static void addToAccountList(Account toAdd){
    accountsList.add(toAdd);
  }


}
