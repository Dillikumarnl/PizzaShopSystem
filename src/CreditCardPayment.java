public class CreditCardPayment implements Payment{

    private String cardNumber;

    public CreditCardPayment(String cardNumber){
        this.cardNumber = cardNumber;
    }

    public boolean processPayment(double amount){
        System.out.println("Processing CreditCard Payment : "+amount);
        return true;
    }
}
