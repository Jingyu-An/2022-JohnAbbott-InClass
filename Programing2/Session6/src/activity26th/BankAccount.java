package activity26th;

class BankAccount {

    private String name; // your name
    private double balance; // current amount of money you save in the bank account
    private final static double depositLimit = 500;
    private final static double withdrawLimit = 500;

    /**
     * constructor
     */
    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    /**
     * constructor
     */
    public BankAccount(String name) {
        this(name, 0);
    }

    /**
     * return balance
     */
    public double getbalance() {
        return balance;
    }

    /**
     * return name
     */
    public String getName() {
        return name;
    }

    public String toString() {
        return "Name: " + name + "\n" + "balance: " + balance;
    }

    /**
     * deposit money into the account
     */
    public void deposit(double depositAmount) throws BankAccountException {
// TODO
        if (depositAmount < 0) {
            throw new InvalidAmountException();
        } else if (depositAmount > depositLimit) {
            throw new DepositLimitException();
        } else {
            this.balance += depositAmount;
        }
    }

    /**
     * withdraw money from the account
     */
    public void withdraw(double withdrawAmount) throws BankAccountException {
// TODO
        if (withdrawAmount < 0) {
            throw new InvalidAmountException();
        } else if (withdrawAmount > withdrawLimit) {
            throw new WithdrawLimitException();
        } else if (withdrawAmount > balance) {
            throw new NotEnoughBalanceException();
        } else {
            this.balance -= withdrawAmount;
        }
    }
}

class BankAccountException extends Exception {

    BankAccountException(String s) {
        super(s);
    }
}

class InvalidAmountException extends BankAccountException {

    InvalidAmountException(){
        super("Invalid Amount Exception");
    }
}

class NotEnoughBalanceException extends BankAccountException {

    NotEnoughBalanceException() {
        super("Not Enough Balance Exception");
    }
}

class WithdrawLimitException extends BankAccountException {

    WithdrawLimitException() {
        super("Withdraw Limit Exception");
    }
}

class DepositLimitException extends BankAccountException {

    DepositLimitException() {
        super("Deposit Limit Exception");
    }
}