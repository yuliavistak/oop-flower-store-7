package ua.edu.ucu.demo.flowers.payment;

public class PayPalPaymentStrategy implements Payment {
    @Override
    public String pay(double price) {
        return "Total price: " + String.valueOf(price);
    }
}
