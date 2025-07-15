public class main{
    public static void main(String[] args) {
        bankaccount account = new bankaccount();
        try{
        account.withdraw(3000);
        }
        catch(insufficientbalanceexception e){
            System.out.println("transaction fail : " +e.getMessage());
            System.out.println(" ");
        }

        try{
        account.withdraw(300);
        }
        catch(insufficientbalanceexception e){
            System.out.println("transaction fail : " +e.getMessage());
            System.out.println(" ");
        }
    }
}