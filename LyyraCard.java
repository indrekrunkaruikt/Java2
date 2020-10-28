public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public String toString() {
        // write code here
        String positiveFeedback =  "You have: " + this.balance;
        return positiveFeedback;
    }
    public void payEconomical() {
        // write code here
        if(this.balance >= 2.50){
            this.balance -= 2.50;
        }
    }

    public void payGourmet() {
        // write code here
        if(this.balance >= 4.00){
            this.balance -= 4.00;
        }
    }

}