package activity26th;

public class BankAccountTest {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("King", 400);

        try {
            bankAccount.deposit(-200);
        } catch (BankAccountException e) {
            System.out.println(e.getMessage());
        }

        try {
            bankAccount.deposit(700);
        } catch (BankAccountException e) {
            System.out.println(e.getMessage());
        }

        try {
            bankAccount.withdraw(-200);
        } catch (BankAccountException e) {
            System.out.println(e.getMessage());
        }

        try {
            bankAccount.withdraw(600);
        } catch (BankAccountException e) {
            System.out.println(e.getMessage());
        }

        try {
            bankAccount.withdraw(450);
        } catch (BankAccountException e) {
            System.out.println(e.getMessage());
        }
    }
}
