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
        Account a = new Account( "a",100.0);
        Account b = new Account( "b",0.0);
        Account c = new Account( "c",0.0);

        System.out.println("Initial state");
        System.out.println(a.balance);
        System.out.println(b.balance);
        System.out.println(c.balance);

        transfer(a, b, 50.0);
        transfer(a, c, 25.0);

        System.out.println("Final state");
        System.out.println(a.balance);
        System.out.println(b.balance);
        System.out.println(c.balance);
    }

    private static void transfer(Account from, Account to, double howMuch) {
        from.withdrawal((int) howMuch);
        to.deposit((int) howMuch);
    }
}