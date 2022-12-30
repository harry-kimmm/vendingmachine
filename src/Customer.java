public class Customer {
    private double balance;

    public double getBalance() {
        if(balance < 0){
            return 0;
        }
        else{
            return balance;
        }
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}