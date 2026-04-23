//** Account classes **//

package Bank_Simulation_System;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private List<String> transactionHistory;


    public Account(String accountNumber, String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactionHistory = new ArrayList<>();

    }


public void deposit(double amount){
    if(amount >0){
        this.balance += amount;
        String transaction = "Deposited: $"+ String.format("%.2f", amount);
        this.transactionHistory.add(transaction);
        System.out.println("Success: " + transaction + ". New balance: $" + String.format("%.2f", this.balance));
    } else {
        System.out.println("Error: Deposit amount must be positive.");
    }
}

public void withdraw(double amount){
    if(amount > this.balance){
        System.out.println("Error: You have insufficient balance ,,,my dear, Current balance:  $"+String.format("%.2f",this.balance));
    } else {
        this.balance -= amount;
        String transaction = "Withdrew: $" + String.format("%.2f", amount);
        this.transactionHistory.add(transaction);
        System.out.println("Success: " + transaction + ". New balance: $" + String.format("%.2f", this.balance));
    }
}
public void printTransactionHistory(){
    if (transactionHistory.isEmpty()){
        System.out.println("No Transaction is Found ");
    }else {
        for(String transaction : this.transactionHistory){
            System.out.println(transaction);
        }
    }
    System.out.println("-------------------");
}

    public String getAccountNumber(){
        return accountNumber;
   }
    public String getAccountHolderName(){
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }
}
