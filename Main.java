public class Main {

    public static class Account {
        String name;
        double balance;

        public Account(String name, double balance) {
            this.name = name;
            this.balance = balance;
        }

        public void withdrawal(int ammount) {
            this.balance = this.balance - ammount;
        }

        public void deposit(int ammount) {
            this.balance = this.balance + ammount;

        }

        public double balance() {
            return this.balance;
        }
    }
    public static void main(String[] args) {
        Account mattsAccount = new Account( "Matt's account",1000.0);
        Account my_account = new Account("My account",0.0);

        System.out.println("Initial state");
        System.out.println(mattsAccount);
        System.out.println(my_account);

        mattsAccount.withdrawal(100);
        System.out.println("Barto's account balance is now: "+ mattsAccount.balance());
        my_account.deposit(100);
        System.out.println("Barto's Swiss account balance is now: "+ my_account.balance());

        System.out.println("Final state");
        System.out.println(mattsAccount);
        System.out.println(my_account);
    }
}