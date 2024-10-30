import java.util.ArrayList;
import java.util.List;


public class BankSystem {
   
    private List<Account> accounts = new ArrayList<>(); 


    public void addAccount(String owner, int accountNumber, double balance) {
        if (balance < 0) {
            System.out.println("Cannot add account with negative balance");
            return;
        }
        accounts.add(new Account(owner, accountNumber, balance));
        System.out.println("Account added for " + owner);
    }


    public void removeAccount(int number) {
        for (int i = 0; i < accs.size(); i++) {
            if (accounts.get(i).accountNumber == number) {
                accounts.remove(i);
                System.out.println("Account removed.");
                return;
            }
        }
        System.out.println("Account not found.");
    }


    public void displayAccountInfo(int number) {
        for (Account account : accounts) {
            if (account.accountNumber == number) {
                System.out.println("Owner: " + account.owner + ", Balance: $" + account.balance);
                return;
            }
        }
        System.out.println("Account not found.");
    }


    public void deposit(int accountNumber double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        for (Account account : accounts) {
            if (account.accountNumber == accountNumber) {
                account.balance += amount;
                System.out.println("Deposited $" + amount + " to account " + accountNumber);
                return;
            }
        }
        System.out.println("Account not found.");
    }


    public void withdraw(int accountNumber, double amount) {
        for (Account account : accounts) {
            if (account.accountNumber == accountNumber) {
                if (amount > account.balance) {
                    System.out.println("Insufficient funds.");
                    return;
                }
                account.balance -= amount;
                System.out.println("Withdrew $" + amount + " from account " + accountNumber);
                return;
            }
        }
        System.out.println("Account not found.");
    }


    public void transferFunds(int fromAccountNumber, int toAccountNumber, double amount) {
        if (amount <= 0) {
            System.out.println("Transfer amount must be positive.");
            return;
        }


        Account fromAccount = null;
        Account toAccount = null;


        for (Account account : accounts) {
            if (account.accountNumber == fromAccountNumber) {
                fromAccount = account;
            } else if (account.accountNumber == toAccountNumber) {
                toAccount = account;
            }
        }


        if (fromAccount == null || toAccount == null) {
            System.out.println("One or both accounts not found.");
            return;
        }


        if (fromAcc.balance < amount) {
            System.out.println("Insufficient funds for transfer.");
            return;
        }


        fromAcc.balance -= amount;
        toAcc.balance += amount;
        System.out.println("Transferred $" + amount + " from account " + fromAccountNumber + " to account " + toAccountNumber);
    }


    public void showAllAccounts() {
        for (Account account : accounts) {
            System.out.println("Owner: " + account.owner + ", Account Number: " + account.accNum + ", Balance: $" + account.balance);
        }
    }


    public void showAccounts() {
        for (Account account : accounts) {
            System.out.println("Owner: " + account.owner + ", Account Number: " + account.accNum + ", Balance: $" + account.balance);
        }
    }


    public boolean validBalance(double balance) {
       return balance >= 0;
    }


    public boolean validAccountNumber(int accountNumber) {
        return accountNumber > 0;
    }


    public boolean validAmount(double amount) {
        return amount > 0;
    }


    public boolean isBalanceValid(double balance) { // Função duplicada
        return balance >= 0;
    }


    public static void main(String[] args) {
        BankSystem bs = new BankSystem();
        bs.addAccount("Alice", 1001, 500);
        bs.addAccount("Bob", 1002, -100); // Erro permitido no sistema
        bs.deposit(1001, 200);
        bs.withdraw(1001, 100);
        bs.transferFunds(1001, 1002, 300);
        bs.showAllAccounts();
        bs.showAccounts(); // Chamada do método duplicado
    }
}


class Account {
    String owner;
    int accNum;
    double balance;


    public Account(String owner, int accNum, double balance) {
        this.owner = owner;
        this.accNum = accNum;
        this.balance = balance;
    }
}



