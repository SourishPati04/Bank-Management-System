/** Bank Management *///

package Bank_Simulation_System;

public class BankManage {
    public static void main(String[] args) {
        // 1. Create a bank
        Bank myBank = new Bank();

        // 2. Create and add accounts
        System.out.println("--- Creating Accounts ---");
        Account acc1 = new Account("ACC1001", "Alice", 500.00);
        Account acc2 = new Account("ACC1002", "Bob", 1200.50);
        myBank.addAccount(acc1);
        myBank.addAccount(acc2);

        System.out.println("\n--- Performing Transactions on Alice's Account (ACC1001) ---");

        // 3. Find an account and perform operations
        Account alicesAccount = myBank.findAccount("ACC1001");
        if (alicesAccount != null) {
            // Check initial balance
            System.out.println("Initial balance for Alice: $" + String.format("%.2f", alicesAccount.getBalance()));

            // Perform transactions
            alicesAccount.deposit(250.75);
            alicesAccount.withdraw(100.00);
            alicesAccount.withdraw(800.00); // This should fail due to insufficient funds

            // Check final balance
            System.out.println("Final balance for Alice: $" + String.format("%.2f", alicesAccount.getBalance()));

            // 4. Print transaction history
            alicesAccount.printTransactionHistory();
        } else {
            System.out.println("Account ACC1001 not found.");
        }

        System.out.println("\n--- Checking Bob's Account (ACC1002) ---");
        Account bobsAccount = myBank.findAccount("ACC1002");
        if(bobsAccount != null) {
            bobsAccount.printTransactionHistory();
        }
    }
}
