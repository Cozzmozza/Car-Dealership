public class Till {

    private double initialBalance;
    private double currentBalance;

    public Till(double initialBalance) {
        this.initialBalance = initialBalance;
        this.currentBalance = initialBalance;
    }

    public double getInitialBalance() {
        return initialBalance;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void reduceBalance(double amount) {
        currentBalance -= amount;
    }

    public void increaseBalance(double amount) {
        currentBalance += amount;
    }
}
