public class CashPayment implements Payment{
    public boolean processPayment(double amount){
        System.out.println("Processing case Payment of $ " + amount);
        return  true;
    }

}
