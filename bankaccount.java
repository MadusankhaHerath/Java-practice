public class bankaccount{
    private double balance = 2000;

    public void withdraw(double amount) throws insufficientbalanceexception{
        if(amount > balance){
            throw new insufficientbalanceexception ("not enough balance to to withdraw " + amount);
        } 
        balance -= amount;
        System.out.println("withdraw successful : " +amount);
        System.out.println("new balance : " + balance);
    } 
}