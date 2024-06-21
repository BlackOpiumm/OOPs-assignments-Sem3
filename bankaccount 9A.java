import java.util.*;

class BankAccount {
    private String accountHolderName;
    private int accountNumber;
    private double balance;
    private static final double DAILY_WITHDRAWAL_LIMIT = 1000.0;
    private double dailyWithdrawnAmount;

    public BankAccount(String accountHolderName, int accountNumber, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.dailyWithdrawnAmount = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited RS" + amount + " successfully.");
    }

    public void withdraw(double amount) {
        if (amount > DAILY_WITHDRAWAL_LIMIT || amount > (DAILY_WITHDRAWAL_LIMIT - dailyWithdrawnAmount)) {
            System.out.println("Withdrawal exceeds daily limit. Cannot process.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Cannot withdraw.");
        } else {
            balance -= amount;
            dailyWithdrawnAmount += amount;
            System.out.println("Withdrawn RS" + amount + " successfully.");
        }
    }

    public void checkBalance() {
        System.out.println("Account Balance: RS" + balance);
    }

    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: RS" + balance);
    }
}

class Bank {
    private BankAccount[] accounts;

    public Bank(int numberOfAccounts) {
        accounts = new BankAccount[numberOfAccounts];
    }

    public void createAccount(int index, String accountHolderName, int accountNumber, double initialBalance) {
        accounts[index] = new BankAccount(accountHolderName, accountNumber, initialBalance);
    }

    public BankAccount getAccount(int index) {
        return accounts[index];
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.println("No  of Accounts you want");
      int n= scanner.nextInt();
        Bank bank = new Bank(n);

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Account " + (i + 1));
            System.out.print("Account Holder Name: ");
            String name = scanner.next();
            System.out.print("Account Number: ");
            int accNumber = scanner.nextInt();
            System.out.print("Initial Balance: ");
            double initialBalance = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            bank.createAccount(i, name, accNumber, initialBalance);
        }

        while (true) {
            System.out.println("\nChoose Operation:");
            System.out.println("1. Deposit  2. Withdraw  3. Check Balance  4. Display Account Info  5. Exit");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting program. Goodbye!");
                break;
            }

            System.out.print("Enter Account Number (1 to " + n+"): ");
            int accountNumber = scanner.nextInt();
            BankAccount selectedAccount = bank.getAccount(accountNumber - 1);

            switch (choice) {
                case 1:
                    System.out.print("Enter Deposit Amount: RS");
                    double depositAmount = scanner.nextDouble();
                    selectedAccount.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter Withdrawal Amount: RS");
                    double withdrawalAmount = scanner.nextDouble();
                    selectedAccount.withdraw(withdrawalAmount);
                    break;
                case 3:
                    selectedAccount.checkBalance();
                    break;
                case 4:
                    selectedAccount.displayAccountInfo();
                    break;
                default:
                    System.out.println("Invalid Choice. Please try again.");
            }
        }

        scanner.close();
    }
}