package main.java.ua.edu.ucu.demo.flowers.flower;

public class DiscountDecorator extends ItemDecorator {
    public DiscountDecorator(Item item) {
        super(item);
    }

    public double getPrice() {
        double discount = 0.8;
        return super.getPrice() * discount;
    }
}
