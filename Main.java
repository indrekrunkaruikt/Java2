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
        Account bartosAccount = new Account("Barto's account",100.00);
        Account bartosSwissAccount = new Account("Barto's account in Switzerland",1000000.00);

        System.out.println("Initial state");
        System.out.println(bartosAccount);
        System.out.println(bartosSwissAccount);

        bartosAccount.withdrawal(20);
        System.out.println("Barto's account balance is now: "+ bartosAccount.balance());
        bartosSwissAccount.deposit(200);
        System.out.println("Barto's Swiss account balance is now: "+ bartosSwissAccount.balance());

        System.out.println("Final state");
        System.out.println(bartosAccount);
        System.out.println(bartosSwissAccount);
    }
}