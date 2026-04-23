/** Bank **/

package Bank_Simulation_System;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<String, Account> accounts;

    public Bank() {
        this.accounts = new HashMap<>();
    }


    public void addAccount(Account account) {
        if (account != null) {
            accounts.put(account.getAccountNumber(), account);
            System.out.println("Account created for " + account.getAccountHolderName() + " with number " + account.getAccountNumber());
        }
    }


    public Account findAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }
}
