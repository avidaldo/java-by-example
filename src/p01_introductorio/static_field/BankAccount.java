package p01_introductorio.static_field;

class BankAccount {
    private double balance;  // non-static field
    private static double interestRate = 0.03; // static field

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {balance -= amount; }

    public double getBalance() {
        return balance;
    }

    public static void setInterestRate(double rate) {
        interestRate = rate;
    }

    public static double getInterestRate() {
        return interestRate;
    }
}

