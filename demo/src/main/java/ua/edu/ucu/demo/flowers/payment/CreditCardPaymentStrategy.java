package ua.edu.ucu.demo.flowers.payment;

public class CreditCardPaymentStrategy implements Payment {
    @Override
    public String pay(double price) {
        return "Total price: " + String.valueOf(price);
    }
}
